class Stack:
    def __init__(self):
        self.data = [0]*4
        self.count = 0

    def push(self, element):
        self.data[self.count] = element
        self.count += 1
    