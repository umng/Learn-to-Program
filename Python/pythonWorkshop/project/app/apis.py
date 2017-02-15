from flask import jsonify, request
from app import app_api, db
from schema import Todo, User

@app_api.route('/getid', methods=['POST'])
def get_id() :
    name = request.json['name']
    user = User.query.filter_by(name=name).first()

    if not user:
    	user = User(name)
    	db.session.add(user)
    	db.session.commit()
    return jsonify({"id": user.id})

@app_api.route('/todos/<int:todoid>', methods=['DELETE'])
@app_api.route('/todos', methods=['POST', 'GET', 'PUT'],defaults = {'todoid':0})
def todos(todoid):
    if request.method == 'POST':
    	return add_todo()
    if request.method == 'GET':
        return getTodos()
    if request.method == 'DELETE':
        return deleteTodo(todoid)



def add_todo() :
    user_id = request.json['user_id']
    item = request.json['item']
    user = User.query.get(user_id)
    if user is None:
        return jsonify(dict(error="user not found"))
    todo = Todo(item, user_id)
    db.session.add(todo)
    db.session.commit()
    return jsonify({"status": True}),200

def getTodos():
    user_id = int(request.args['userid'])
    user = User.query.get(user_id)
    if user is None:
        return jsonify(dict(error="user not found")),404
    # if user is None:
    #     return jsonify(dict(error="user not found")),404
    todos = Todo.query.filter_by(user_id=user_id).all()

    # todos_result = []
    # for todo in todos:
    #     todos_result.append(todo.to_dict())
    todos_result = [todo.to_dict() for todo in todos]
    return jsonify(dict(todos=todos_result))

def deleteTodo(todoid):
    todo = Todo.query.get(todoid)
    if todo is None:
        return jsonify(dict(error="todo not found"))
    db.session.delete(todo)
    db.session.commit()
    return jsonify({"status":"True"})