from flask import Flask
from schema import db

app_api = Flask(__name__)
app_api.config.from_object('config')
db.init_app(app_api)

from app import apis
