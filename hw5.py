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

