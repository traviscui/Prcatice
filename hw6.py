# <Hokie Pig>
#
# @author <Jiarong Cui> (jiarong8)
# @date <10/19/2015>
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
# was obtained from another source, such as a text book of course
# notes, that has been clearly noted with a proper citation in
# the comments of my program.
# - I have not designed this program in such a way as to defeat or
# interfere with the normal operation of the Web-Cat Server.																																																																																																																																																					Fall	2015
#
# <Jiarong Cui>

line = input('Enter a sentence: ')
words_str = str(line)
words = words_str.split()

for word in words:
    result = ('ho-' + word[1:] + word[0] + '-kie')
    print(result, end = ' ')


