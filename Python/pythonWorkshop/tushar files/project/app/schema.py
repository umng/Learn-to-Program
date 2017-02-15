from flask.ext.sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class Todo(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    item = db.Column(db.String(120), nullable=False)
    isComplete = db.Column(db.Boolean, default=False)

    def __init__(self, item):
        self.item = item

class 	User(db.Model):
	id = db.Column(db.Integer, primary_key = True)
	name = db.Column(db.String(120), nullable = False)

	def __init__(self, 	name):
		self.name = name
			