class Node:
    def __init__(self, d):
        self.data = d
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def push(self, d):
        newnode = Node(d)
        if self.top is None:
            self.top = newnode
            return
        temp = self.top
        while temp.next is not None:
            temp = temp.next
        temp.next = newnode

    def pop(self):
        if self.top is None:
            return 0
        if self.top.next is None:
            a = self.top.data
            self.top = None
            return a
        temp = self.top
        while temp.next.next is not None:
            temp = temp.next
        a = temp.next.data
        temp.next = None
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
