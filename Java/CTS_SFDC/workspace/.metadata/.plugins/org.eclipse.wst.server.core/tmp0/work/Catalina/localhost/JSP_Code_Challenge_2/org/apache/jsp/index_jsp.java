/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-02 11:25:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h3>Winning Team Details</h3>\n");
      out.write("<table id='skill_details'>\n");
      out.write("<tr>\n");
      out.write("<th>Player Name</th>\n");
      out.write("<th>Skill</th>\n");
      out.write("<th>Country</th>\n");
      out.write("</tr>\n");
      out.write("<tr><td>Zaheer Khan         </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Mayank Agarwal      </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Khaleel Ahmed       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Mohammed Shami      </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Karun Nair          </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Jayant Yadav        </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Carlos Brathwaite   </td><td>All Rounder            </td><td> West India    </td></tr>\n");
      out.write("<tr><td>JP Duminy           </td><td>All Rounder            </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Quinton de Kock     </td><td>Wicket Keeping Batting </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Chris Morris        </td><td>All Rounder            </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Shreyas Iyer        </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Nathan Coulter-Nile </td><td>Bowling                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Imran Tahir         </td><td>Bowling                </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Suresh Raina        </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Praveen Kumar       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Akshdeep Nath       </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Dwayne Bravo        </td><td>All Rounder            </td><td> West India    </td></tr>\n");
      out.write("<tr><td>James Faulkner      </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Shadab Jakati       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Sarabjit Ladda      </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Brendon McCullum    </td><td>Batting                </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>Ravindra Jadeja     </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Dinesh Karthik      </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Dwayne Smith        </td><td>All Rounder            </td><td> West India    </td></tr>\n");
      out.write("<tr><td>Jaydev Shah         </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Aaron Finch         </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Murali Vijay        </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>David Miller        </td><td>Batting                </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Kyle Abbott         </td><td>All Rounder            </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Anureet Singh       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Armaan Jaffer       </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Nikhil Naik         </td><td>Wicket Keeping Batting </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Axar Patel          </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Mohit Sharma        </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>KC Cariappa         </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Rishi Dhawan        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Mitchell Johnson    </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Shaun Marsh         </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Rohit Sharma        </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Corey Anderson      </td><td>All Rounder            </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>Jasprit Bumrah      </td><td>All Rounder            </td><td> England       </td></tr>\n");
      out.write("<tr><td>Jos Buttler         </td><td>Bowling                </td><td> South African </td></tr>\n");
      out.write("<tr><td>Unmukt Chand        </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Shreyas Gopal       </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Harbhajan Singh     </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Kieron Pollard      </td><td>All Rounder            </td><td> West Indian   </td></tr>\n");
      out.write("<tr><td>Jitesh Sharma       </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Krunal Pandya       </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Parthiv Patel       </td><td>Wicket Keeping Batting </td><td> India         </td></tr>\n");
      out.write("<tr><td>Tim Southee         </td><td>Bowling                </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>MS Dhoni            </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ankit Sharma        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ankush Bains        </td><td>Wicket Keeping Batting </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ashok Dinda         </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Jaskaran Singh      </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Mitchell Marsh      </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Albie Morkel        </td><td>All Rounder            </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Irfan Pathan        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ishant Sharma       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Kevin Pietersen     </td><td>Batting                </td><td> England       </td></tr>\n");
      out.write("<tr><td>Saurabh Tiwary      </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Peter Handscomb     </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>David Warner        </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Yuvraj Singh        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ben Cutting         </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Moises Henriques    </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Naman Ojha          </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Barinder Sran       </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ashish Reddy        </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Siddarth Kaul       </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Bipul Sharma        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ashish Nehra        </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Kane Williamson     </td><td>Batting                </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>Deepak Hooda        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Virat Kohli         </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Sachin Baby         </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Samuel Badree       </td><td>Bowling                </td><td> West India    </td></tr>\n");
      out.write("<tr><td>Harshal Patel       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Varun Aaron         </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>AB de Villiers      </td><td>Batting                </td><td> South Africa  </td></tr>\n");
      out.write("<tr><td>Chris Gayle         </td><td>All Rounder            </td><td> West India    </td></tr>\n");
      out.write("<tr><td>Abu Nechim          </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Stuart Binny        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Travis Head         </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Adam Milne          </td><td>Bowling                </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>Mitchell Starc      </td><td>Bowling                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Gautam Gambhir      </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Piyush Chawla       </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>John Hastings       </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Brad Hogg           </td><td>All Rounder            </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Jason Holder        </td><td>All Rounder            </td><td> West India    </td></tr>\n");
      out.write("<tr><td>Chris Lynn          </td><td>Batting                </td><td> Australia     </td></tr>\n");
      out.write("<tr><td>Colin Munro         </td><td>Batting                </td><td> New Zealand   </td></tr>\n");
      out.write("<tr><td>Suryakumar Yadav    </td><td>Batting                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Manan Sharma        </td><td>All Rounder            </td><td> India         </td></tr>\n");
      out.write("<tr><td>Ankit Rajpoot       </td><td>Bowling                </td><td> India         </td></tr>\n");
      out.write("<tr><td>Sheldon Jackson     </td><td>Batting                </td><td> India   </td></tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}