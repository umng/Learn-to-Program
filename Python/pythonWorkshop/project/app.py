from app import app_api, db
from app.schema import Todo, User
from flask.ext.script import Manager

manager = Manager(app_api)

@manager.command
def createdb():
    db.drop_all()
    db.create_all()


@manager.command
def dropall():
    db.drop_all()


@manager.shell
def make_shell_context():
    return dict(app=app_api, db=db, Todo=Todo, User=User)

if __name__ == '__main__':
    manager.run()
