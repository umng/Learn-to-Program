#print "hello world"


#l = int(raw_input("Enter a lower limit: "))
#u = int(raw_input("Enter a upper limit: "))
#a = int(raw_input("Enter a number: "))


# a = raw_input("Enter a number: ")
# a+=1
# print "You entered ", %a


# if a>10:
#     print "%d is greater than 10" %a
# elif a == 10:
#     print "%d equals 10" %a
# else:
#     print "%d is less than 10" %a


# if a >= l and a <= u:
#     print "valid"
# else:
#     print "invalid"


# if a >= l & a <= u:
#     print "valid"
# else:
#     print "invalid"


# if a%5==0 or a%3==0:
#     print "valid"
# else:
#     print "invalid"


# if a%5 is 0 or a%3 is 0:
#     print "valid"
# else:
#     print "invalid"


# a = "hello ' "
# a = "hello"
# print "%r world!" %a
# print "%s world!" %a


# a = [1,2,3,4,5,6,7]
# print a[2]

# for x in range(1,5):
#     print a[x],


# print("""Raz said, "I didn't know about triple quotes!" and laughed.
# 	... Hello""")


# print "Hello\nWorld"

# print("Use backslash, so the single quote isn\'t noticed.")

# print("My name is \"Umang\"")

# print "Hello \\ World"

# print "Hello \a World"

# print "Hello \f World"

# print "Hello \t World"

# print "Hello \u0021 World"

# import math            # Imports the math module
# everything = dir(math) # Sets everything to a list of things from math
# print everything   

# from math import *
# print sqrt(9)


# from math import sqrt
# print sqrt(9)


# import math
# print math.sqrt(9)

# """
# def biggest_number(*args):
#     print max(args)
#     return max(args)
    
# def smallest_number(*args):
#     print min(args)
#     return min(args)

# def distance_from_zero(arg):
#     print abs(arg)
#     return abs(arg)


# biggest_number(-10, -5, 5, 10)
# smallest_number(-10, -5, 5, 10)
# distance_from_zero(-10)

# """


# print type(42)
# print type(4.2)
# print type('spam')


# a,b,c = [1, 2, 3]
# print a,b,c

# a = (1, 2)
# a = ['a', 'b']
# print a

# # swap using tuples
# a,b = [3, 4]
# a,b = b,a
# print a,b

# a = dict(name = "Umang")
# print a

# a = dict()
# a["name"]="Umang"
# print a

# a = dict(name = "Umang", age =21)
# print a

# a = dict(name = "Umang", age =21)

# # fetch all keys
# print a.keys()

# # fetch all items or values
# print a.items()

# # get length
# print len(a)

# for x in a:
# 	print "Name : %s" %a[x]
# 	print "Age : %s" %a[x]

# for x,y in a.items():
# 	print x, y

# a = int(raw_input("Enter a number"))
# b = int(raw_input("Enter a number"))

# a = 5
# b = 10
# if a > b:
# 	print "%d is greater" %a
# else:
# 	print "%d is greater" %b

# def getMax(a , b):
# 	if a > b:
# 		print "%d is greater" %a
# 	else:
# 		print "%d is greater" %b

# a = 5
# b = 10
# getMax(a,b)


# def getMax(a , b):
# 	if a > b:
# 		return a
# 	else:
# 		return b

# a = 5
# b = 10
# print "%d is greater" %getMax(a,b)





# # classes

# class User:
# 	name = ''
# 	age = 0
# 	g = ''

# 	def __init__(self, name = '', age = 0, g = ''):
# 		self.name = name
# 		self.age = age
# 		self.g = g

# 	def Display(self):
# 		print 'Name : %s' %self.name
# 		print 'Age : %s' %self.age
# 		print 'g : %s' %self.g

# 	def to_dict(self):
# 		return dict(name = self.name, age = self.age, g = self.g)

# 	def __repr__(self):
# 		return 'Name : %s\nAge : %s\ng : %s' %(self.name, self.age, self.g)

# # sampleUser = User('Umang', 21)
# sampleUser = User(name = 'Umang', age = 21, g = 'abc')
# # sampleUser.Display()
# print sampleUser

# print sampleUser.to_dict()





# from sys import argv

# arg1, arg2, arg3 = argv

# print arg1, arg2, arg3

# print argv






# n = [1, 3, 5]
# n.pop(1)
# # Returns 3 (the item at index 1)
# print n
# # prints [1, 5]

# n.remove(1)
# # Removes 1 from the list,
# # NOT the item at index 1
# print n
# # prints [3, 5]

# del(n[0])
# # Doesn't return anything
# print n
# # prints [1, 5]








# ################# --Start-- BattleShip Game ######################

# from random import randint

# board = []

# for x in range(5):
#     board.append(["O"] * 5)

# def print_board(board):
#     for row in board:
#         print " ".join(row)

# print "Let's play Battleship!"
# print_board(board)

# def random_row(board):
#     return randint(0, len(board) - 1)

# def random_col(board):
#     return randint(0, len(board[0]) - 1)

# for turn in range(4):
#     print "Turn", turn + 1
#     ship_row = random_row(board)
#     ship_col = random_col(board)
#     print ship_row
#     print ship_col

#     # Everything from here on should go in your for loop!
#     # Be sure to indent four spaces!
#     guess_row = int(raw_input("Guess Row:"))
#     guess_col = int(raw_input("Guess Col:"))

#     if guess_row == ship_row and guess_col == ship_col:
#         print "Congratulations! You sunk my battleship!"
#         break
#     else:
#         if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
#             print "Oops, that's not even in the ocean."
#         elif(board[guess_row][guess_col] == "X"):
#             print "You guessed that one already."
#         else:
#             print "You missed my battleship!"
#             board[guess_row][guess_col] = "X"
#         # Print (turn + 1) here!
#         print_board(board)
#         if turn ==3:
#             print "Game Over"

# ################# --End -- BattleShip Game ######################





# list = ["a", "b", "c", "d"]

# for i,j in enumerate(list):
# 	print i+1,j




# list_a = [3, 9, 17, 15, 19]
# list_b = [2, 4, 8, 10, 30, 40, 50, 60, 70, 80, 90]
# list_c = [1,2,50,4,5,6,]

# def getMax(x,y,z):
#     if x>=y and x>=z:
#         return x
#     elif y>=x and y>=z:
#         return y
#     else:
#         return z

# for a, b, c in zip(list_a, list_b, list_c):
#     # Add your code here!
#     print getMax(a,b,c)






# fruits = ['banana', 'apple', 'orange', 'tomato', 'pear', 'grape']

# print 'You have...'
# for f in fruits:
#     if f == 'tomato':
#         print 'A tomato is not a fruit!' # (It actually is.)
#         break
#     print 'A', f
# else:		#else will be hitted
#     print 'A fine selection of fruits!'







# def median(numbers):
#     for i in range(len(numbers)):
#         j = i + 1
#         while j < len(numbers):
#             if numbers[i] > numbers[j]:
#                 x = numbers[i]
#                 numbers[i] = numbers[j]
#                 numbers[j] = x
#             j += 1
       
#     print numbers

#     med = 0
#     if len(numbers)%2 is 1:
#         return numbers[(len(numbers)/2) ]
#     else:
#     	print numbers[len(numbers)/2]
#         med = ( float(numbers[len(numbers)/2 - 1]) + \
#         (numbers[(len(numbers)/2)]) ) / 2
#         return med

# # print median([4,5,5,4])

# print median([1, 34, 1, 6, 8, 0])
















# # grades = [100, 100, 90, 40, 80, 100, 85, 70, 90, 65, 90, 85, 50.5]
# grades = [7,8]

# def grades_sum(scores):
#     total = 0
#     for i in scores:
#         total += i
#     return total
    
# def grades_average(grades):
#     return float(grades_sum(grades)) / len(grades)

# print grades_sum(grades)

# print grades_average(grades)














# grades = [100, 100, 90, 40, 80, 100, 85, 70, 90, 65, 90, 85, 50.5]

# def print_grades(grades):
#     for grade in grades:
#         print grade

# def grades_sum(grades):
#     total = 0
#     for grade in grades: 
#         total += grade
#     return total
    
# def grades_average(grades):
#     sum_of_grades = grades_sum(grades)
#     average = sum_of_grades / float(len(grades))
#     return average

# def grades_variance(scores):
#     average = grades_average(scores)
#     variance = 0
#     for score in scores:
#         variance += (average - score) ** 2
#     return variance / len(scores)
    
# def grades_std_deviation(variance):
#     return variance ** 0.5

# print_grades(grades)
# print grades_sum(grades)
# print grades_average(grades)
# print grades_variance(grades)
# variance = grades_variance(grades)
# print grades_std_deviation(variance)















# my_dict = {
#     "name" : "Umang",
#     "age" : 20
#     }
# print my_dict.keys()
# print my_dict.values()

# for item in my_dict:
#     print item, my_dict[item]