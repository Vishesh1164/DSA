class Stack:
    def __init__(self):
        self.arr = [0] * 1000
        self.top = -1

    def push(self, d):
        if self.top == 999:  # Because index starts from 0
            return
        self.top += 1
        self.arr[self.top] = d

    def pop(self):
        if self.top == -1:
            return 0
        a = self.arr[self.top]
        self.top -= 1
        return a

    def display(self):
        temp = self.top
        while temp >= 0:
            print(self.arr[temp])
            temp -= 1


if __name__ == "__main__":
    s = Stack()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.display()
    print("djfkgj")
    print("popped", s.pop())
    s.display()
