class Que:
    def __init__(self):
        self.capacity = 32
        self.data = [None] * self.capacity
        self.count_front = 0
        self.count_rear = 0
    
    def enq(self, element):
        if Que.is_full(self) is True:
            raise Exception("Que is full.")
        self.data[self.count_rear] = element
        self.count_rear = (self.count_rear + 1) % self.capacity
        return

    def deq(self):
        if Que.is_empty(self) is True:
            raise Exception("Que is Empty.")
        self.data[self.count_front] = None
        self.count_front = (self.count_front + 1) % self.capacity
        return

    def is_empty(self):
        if self.count_rear == self.count_front:
            return True
        else:
            return False

    def is_full(self):
        if (self.capacity - self.count_front + self.count_rear) % self.capacity == self.capacity - 1:
            return True
        else:
            return False

    def peek(self):
        print(self.data)

Q = Que()

for i in range(31):
    Q.enq(i)
    Q.peek()

for i in range(90):
    Q.deq()
    Q.peek()
