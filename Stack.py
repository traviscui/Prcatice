class Stack:
    def __init__(self):
        self.data = [0]*4
        self.count = 0

    def push(self, element):
        if self.count >= 4:
            print("Stack Overflow")
            return
        self.data[self.count] = element
        self.count += 1
        return
    
    def pop(self):
        if self.count <= 0:
            print("Stack Empty")
            return
        tempoaryVariable = self.data[self.count]
        self.data[self.count] = 0
        self.count -= 1
        return tempoaryVariable

    def isEmpty(self):
        return self.count == 0
    
    def peek(self):
        return self.data[self.count]