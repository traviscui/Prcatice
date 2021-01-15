# <printing patterns>
#
# @author <Jiarong Cui> (jiarong8)
# @date <10/5/2015>
#
# Virginia Tech Honor Code Pledge
# On my honor:
#
# - I have not discussed the Python language code in my program with
# anyone other than my instructor or the teaching assistants
# assigned to this course.
# - I have not used Python language code obtained from another student,
# or any other unauthorized source, either modified or unmodified.
# - If any Python language code or documentation used in my program
# was obtained from another source, such as a text book of coarse
# notes, that has been clearly noted with a proper citation in
# the comments of my program.
# - I have not designed this program in such a way as to defeat or
# interfere with the normal operation of the Web-Cat Server.
#
# <Jiarong Cui>

num = int(input("Enter an odd number width:"))

print("Hill:")
for x in range(num//2 +1):
    print((2*x+1)*'*')

print(' ')
print("Trangle:")
for x in range(num//2 +1):
    print((num//2-x)*' ' +(2*x+1)*'*')

print(' ')
print('Hour Glass:')
for x in range(num//2 + 1):
    print(x*' ' + (num - 2*x)*'*')
for x in range(num//2 + 1):
    print((num//2-x)*' ' +(2*x+1)*'*')

