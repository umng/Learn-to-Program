import os
"""
pip install flask-sqlalchemy pymysql flask-script
install mysql using command line (linux) and .exe for windows

"""
DEBUG=True
basedir = os.path.abspath(os.path.dirname(__file__))
SQLALCHEMY_DATABASE_URI = 'sqlite:///' + os.path.join(basedir, 'app.db')
SQLALCHEMY_ECHO = False
SQLALCHEMY_TRACK_MODIFICATIONS = False
