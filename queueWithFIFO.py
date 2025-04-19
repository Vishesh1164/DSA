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
        newnode.next = self.front
        self.front = newnode
        if self.rear is None:
            self.rear = self.front

    def dequeue(self):
        if self.rear is None:
            return 0
        if self.rear == self.front:
            a = self.rear.data
            self.rear = None
            self.front = None
            return a
        first = self.front
        while first.next != self.rear:
            first = first.next
        a = self.rear.data
        first.next = None
        self.rear = first
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
