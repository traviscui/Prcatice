class Stack:
    def __init__(self):
        self.data = [0]*4
        self.count = 0

    def push(self, element):
        self.data[self.count] = element
        self.count += 1
    
    def pop(self):
        tempo = self.data[self.count]
        self.data[self.count] = 0
        self.count -= 1
        return tempo

    def isEmpty(self):
        if self.count == 0:
            return True
        if self.count != 0:
            return False
    
    def peek(self):
        return self.data