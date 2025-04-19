class Queue:
    def __init__(self):
        self.arr = [0] * 1000
        self.front = -1
        self.rear = -1

    def enqueue(self, d):
        if self.rear == 999: 
            return
        self.rear += 1
        self.arr[self.rear] = d
        if self.rear == 0:
            self.front = 0

    def dequeue(self):
        if self.front == -1:
            return 0
        if self.front == self.rear:
            a = self.arr[self.front]
            self.front = -1
            self.rear = -1
            return a
        a = self.arr[self.front]
        self.front += 1
        return a

    def display(self):
        temp = self.front
        while temp != -1 and temp <= self.rear:
            print(self.arr[temp])
            temp += 1


if __name__ == "__main__":
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.display()
    print("wjkdsfd")
    print("popped", q.dequeue())
    q.display()
