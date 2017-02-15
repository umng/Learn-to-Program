from flask import jsonify
from app import app_api

@app_api.route('/')
def index () :
    return jsonify({'message': 'hellom world!'})
