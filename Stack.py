class Stack:
    def __init__(self):
        self.count = 0
        self.capacity = 4
        self.data = [0]*self.capacity

    def push(self, element):
        if self.count >= self.capacity - 1:
            self.expand()
        self.data[self.count] = element
        self.count += 1
        return
    
    def pop(self):
        if self.count <= 0:
            raise Exception("fuck")
        tempoaryVariable = self.data[self.count]
        self.data[self.count] = 0
        self.count -= 1
        return tempoaryVariable

    def isEmpty(self):
        return self.count == 0
    
    def peek(self):
        return self.data

    def get_capacity(self):
        return self.capacity
    
    def expand(self):
        self.capacity *= 2
        newdata = [0]*self.capacity
        for i in range(self.count):
            newdata[i] = self.data[i]
        self.data = newdata
        return

    
if __name__ == "__main__":
    s = Stack()
    #for i in range(123):
    #    s.push(i)
    #assert(s.data[-1]==122)
    s.push(1)
    s.pop()
    s.pop()

        
