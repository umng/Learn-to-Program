from flask.ext.sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class Todo(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)
    item = db.Column(db.String(120), nullable=False)
    isComplete = db.Column(db.Boolean, default=False)

    def __init__(self, item, user_id):
        self.item = item
        self.user_id = user_id
    def to_dict(self):
        return dict(id=self.id,item=self.item)
        
class 	User(db.Model):
	id = db.Column(db.Integer, primary_key = True)
	name = db.Column(db.String(120), nullable = False)

	def __init__(self, 	name):
		self.name = name
			