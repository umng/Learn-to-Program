import requests
from bs4 import BeautifulSoup

def stop():
	exit(0)

def print_head(header):
	print('\n________________________________\n--------------------------------\n' + header + '\n--------------------------------')

def get_session_id(session, url):
	try:
		response = session.get(url)
		return (response.headers.get('Set-Cookie')[18:])[:-18]
	except:
		print('ERROR- get_session_id()')
		stop()

def load_time_table_page(session, _session_id, url):
	try:
		response = session.get(url, cookies={'ASP.NET_SessionId': _session_id})
		return response
	except:
	    print('ERROR- load_get_time_table_page()')
	    stop()

def _find_session_alive_url(page_html):
    a = 0
    b = 0
    for i in range(len(page_html)):
        if page_html[i:i+15] == 'KeepAliveUrl":"':
            a = i+15
        elif page_html[i:i+57] == '","id":"ReportViewerabcd_SessionKeepAlive"}, null, null);':
        	b = i
        	break
    if a==0:
    	print('ERROR- _find_session_alive_url() - getting a')
    	stop()
    if b==0:
    	print('ERROR- _find_session_alive_url() - getting b"')
    	stop()
    _ctrl_id = str(page_html[a+83:b-15])
    return ('https://ums.lpu.in' + str(page_html[a:a+67]) + '&' + str(page_html[a+73:b-15]) + '&' + str(page_html[b-9:b]) , _ctrl_id)

def make_session_alive(session, _session_id, page_html):
	try:
		_session_alive_url, _ctrl_id = _find_session_alive_url(page_html)
		response = session.get(_session_alive_url, cookies={'ASP.NET_SessionId': _session_id})
		if(response.status_code == 200):
			return (_ctrl_id, True)
		else:
			print('ERROR- SESSION_ALIVE- False')
			stop()
	except:
	    print('ERROR- make_session_alive()')
	    stop()

def load_time_table(session, _session_id, url, registration_number):
	try:
		soup1 = BeautifulSoup((session.get(url)).text, "lxml")
		__VSTATE = soup1.select('input[name=__VSTATE]')[0]['value']
		print(__VSTATE)

		request_body1 = {
		    "ReportViewerabcd$ctl09$VisibilityState$ctl00": "None",
		    "__VIEWSTATE": "",
		    "__VSTATE": __VSTATE,
		    "btnGetTimeTable": "View Time Table",
		    "txtRegistrationNumber": registration_number
		}
		headers1 = {
	    'content-type': "application/x-www-form-urlencoded",
	    'cookie': "ASP.NET_SessionId=" + _session_id,
	    'cache-control': "no-cache"
	    }
		response1 = session.request("POST", url, headers=headers1, data=request_body1, cookies={'ASP.NET_SessionId': _session_id})
		# print response1.text

		_ctrl_id, SESSION_ALIVE= make_session_alive(session, _session_id, response1.text)
		print('CONTROL ID-\t' + _ctrl_id)
		print('SESSION_ALIVE-\t' + str(SESSION_ALIVE))

		soup2 = BeautifulSoup(response1.text, "lxml")
		__VSTATE = soup2.select('input[name=__VSTATE]')[0]['value']
		print(__VSTATE)

		request_body2 = {
			"ReportViewerabcd$ctl09$VisibilityState$ctl00": "None",
		    "__EVENTARGUMENT": "",
		    "__EVENTTARGET": "ReportViewerabcd$ctl09$Reserved_AsyncLoadTarget",
		    "__VIEWSTATE": "",
		    "__VSTATE": __VSTATE,
		    "btnGetTimeTable": "View Time Table",
		    "txtRegistrationNumber": registration_number
		}
		headers2 = {
	    'origin': "https://ums.lpu.in",
	    'x-requested-with': "XMLHttpRequest",
	    'x-microsoftajax': "Delta=true",
	    'content-type': "application/x-www-form-urlencoded",
	    'accept': "*/*",
	    'referer': "https://ums.lpu.in/Lpuums/Reports/frmStudentTimeTable.aspx",
	    'cache-control': "no-cache"
	    }

		response2 = session.request("POST", url, headers=headers2, data=request_body2, cookies={'ASP.NET_SessionId': _session_id})
		print response2.text

		# soup = BeautifulSoup(response.text, "html.parser")
		# print(soup.prettify())
		return response1
	except:
		print('ERROR- load_time_table()')
		stop()

def get_time_table(session, _session_id, _ctrl_id):
	try:
		url = 'https://ums.lpu.in/LpuUms/Reserved.ReportViewerWebControl.axd?Culture=1033&CultureOverrides=True&UICulture=1033&UICultureOverrides=True&ReportStack=1&ControlID=' + _ctrl_id + '&OpType=Export&FileName=rptTimeTableStudent&ContentDisposition=OnlyHtmlInline&Format=CSV'
		response = session.request("GET", url, cookies={'ASP.NET_SessionId': _session_id})
		return response
	except Exception as e:
		raise e

def main():
	url_time_table_page = 'https://ums.lpu.in/Lpuums/Reports/frmStudentTimeTable.aspx'

	# INITIALIZE SESSION
	session = requests.Session()

	# GET CURRENT SESSION ID
	print_head('get_session_id()')
	SESSION_ID = get_session_id(session, 'https://ums.lpu.in/lpuums/')
	print 'SESSION_ID-\t' + str(SESSION_ID)

	# LOAD GET TIME TABLE PAGE
	print_head('load_time_table_page()')
	load_time_table_response = load_time_table_page(session, SESSION_ID, url_time_table_page)
	print 'load_time_table_response-\t' + str(load_time_table_response)

	# GET MAKE SESSION ALIVE
	print_head('make_session_alive()')
	CONTROL_ID, SESSION_ALIVE = make_session_alive(session, SESSION_ID, load_time_table_response.text)
	print 'CONTROL_ID-\t' + str(CONTROL_ID)
	print 'SESSION_ALIVE-\t' + str(SESSION_ALIVE)

	#LOAD_TIME_TABLE
	print_head('load_time_table()')
	registration_number = '11304295'
	load_time_table(session, SESSION_ID, url_time_table_page, registration_number)

	# GET TIME TABLE
	# print_head('get_time_table()')
	# print(str(get_time_table(session, SESSION_ID, CONTROL_ID)))




if __name__ == "__main__":	main()
