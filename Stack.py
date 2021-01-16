class Stack:
    def __init__(self):
        self.data = [0]*4
        self.count = 0

    def push(self, element):
        # TODO: expandion
        if self.count == 32:
            print("Stack Overflow")
            #TODO: termination condition
        self.data[self.count] = element
        self.count += 1
        # consider to return sth
    
    def pop(self):
        if self.count == 0:
            print("Stack Empty")
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
    
    if __name__ == "__main__":
        s = Stack()
        for i in range(123):
            s.push(i)
        assert(s.data[-1]==122)
        
