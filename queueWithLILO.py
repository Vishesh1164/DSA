class Node:
    def __init__(self, d):
        self.data = d
        self.next = None

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None

    def enqueue(self, d):
        newnode = Node(d)
        if self.rear is None:
            self.front = newnode
            self.rear = newnode
            return
        self.rear.next = newnode
        self.rear = self.rear.next

    def dequeue(self):
        if self.front is None:
            return 0
        if self.front == self.rear:
            a = self.rear.data
            self.front = None
            self.rear = None
            return a
        a = self.front.data
        self.front = self.front.next
        return a

    def display(self):
        if self.front is None:
            return
        temp = self.front
        while temp is not None:
            print(temp.data)
            temp = temp.next

if __name__ == "__main__":
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.display()
    print(13456)
    q.dequeue()
    q.display()
