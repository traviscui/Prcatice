class Queue:
    def __init__(self):
        self.capacity = 32
        self.data = [None] * self.capacity
        self.count_front = 0
        self.count_rear = 0
    `
    def enqueue(self, value):
        if self.is_full():
            raise Exception("Que is full.")
        self.data[self.count_rear] = value
        self.count_rear = self.increase_index(self.count_rear)
        return

    def dequeue(self):
        if self.is_empty():
            raise Exception("Que is Empty.")
        result = self.data[self.count_front]
        self.count_front = self.increase_index(self.count_front)
        return result

    def is_empty(self):
        return self.count_rear == self.count_front

    def is_full(self):
        return (self.capacity - self.count_front + self.count_rear) % self.capacity == self.capacity - 1

    def peek(self):
        return self.data[self.count_front]

    def increase_index(self, current_index):
        return (current_index + 1) % self.capacity

Q = Queue()
Q2 = Queue()

for i in range(31):
    Q.enqueue(i)
    Q2.enqueue(i)
    print(Q.data)

for i in range(90):
    Q.dequeue()
    Q.peek()
