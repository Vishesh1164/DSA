class Node:
    def __init__(self, d):
        self.data = d
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def push(self, d):
        newnode = Node(d)
        newnode.next = self.top
        self.top = newnode

    def pop(self):
        if self.top is None:
            return 0
        if self.top.next is None:
            a = self.top.data
            self.top = None
            return a
        first = self.top
        self.top = self.top.next
        a = first.data
        first.next = None
        return a

    def display(self):
        if self.top is None:
            return
        temp = self.top
        while temp is not None:
            print(temp.data)
            temp = temp.next

if __name__ == "__main__":
    s = Stack()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.display()
    s.pop()
    s.display()
