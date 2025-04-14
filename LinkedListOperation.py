class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at_end(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def insert_after_value(self, data, value):
        new_node = Node(data)
        current = self.head
        while current and current.data != value:
            current = current.next
        if current:
            new_node.next = current.next
            current.next = new_node

    def insert_before_value(self, data, value):
        if not self.head:
            return
        if self.head.data == value:
            self.insert_at_beginning(data)
            return
        prev = None
        current = self.head
        while current and current.data != value:
            prev = current
            current = current.next
        if current:
            new_node = Node(data)
            prev.next = new_node
            new_node.next = current

    def insert_at_position(self, data, pos):
        if pos < 1:
            return
        if pos == 1:
            self.insert_at_beginning(data)
            return
        new_node = Node(data)
        current = self.head
        for _ in range(pos - 2):
            if not current:
                return
            current = current.next
        if current:
            new_node.next = current.next
            current.next = new_node

    def insert_after_position(self, data, pos):
        current = self.head
        for _ in range(pos - 1):
            if not current:
                return
            current = current.next
        if current:
            new_node = Node(data)
            new_node.next = current.next
            current.next = new_node

    def insert_before_position(self, data, pos):
        if pos <= 1:
            self.insert_at_beginning(data)
            return
        self.insert_at_position(data, pos - 1)

    def delete_at_end(self):
        if not self.head:
            return
        if not self.head.next:
            self.head = None
            return
        current = self.head
        while current.next.next:
            current = current.next
        current.next = None

    def delete_at_beginning(self):
        if self.head:
            self.head = self.head.next

    def delete_before_value(self, value):
        if not self.head or self.head.data == value:
            return
        if self.head.next and self.head.next.data == value:
            self.head = self.head.next
            return
        prev = None
        current = self.head
        while current.next and current.next.data != value:
            prev = current
            current = current.next
        if current.next:
            prev.next = current.next

    def delete_after_value(self, value):
        current = self.head
        while current and current.data != value:
            current = current.next
        if current and current.next:
            current.next = current.next.next

    def delete_at_position(self, pos):
        if pos < 1 or not self.head:
            return
        if pos == 1:
            self.head = self.head.next
            return
        current = self.head
        for _ in range(pos - 2):
            if not current or not current.next:
                return
            current = current.next
        if current.next:
            current.next = current.next.next

    def delete_after_position(self, pos):
        current = self.head
        for _ in range(pos):
            if not current:
                return
            current = current.next
        if current and current.next:
            current.next = current.next.next

    def delete_before_position(self, pos):
        if pos <= 1 or not self.head:
            return
        if pos == 2:
            self.head = self.head.next
            return
        current = self.head
        for _ in range(pos - 3):
            if not current or not current.next:
                return
            current = current.next
        if current.next:
            current.next = current.next.next

    def display(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

if __name__ == "__main__":
    ll = LinkedList()
    ll.insert_at_beginning(1)
    ll.insert_at_beginning(2)
    ll.insert_at_end(3)
    ll.insert_at_end(4)
    ll.insert_at_end(5)
    ll.insert_at_end(6)
    ll.display()
    print("delete")
    ll.delete_at_end()
    ll.display()
    print("begin")
    ll.delete_at_beginning()
    ll.display()
    print("value")
    ll.insert_after_value(9, 3)
    ll.display()
    print("after position")
    ll.insert_after_position(25, 2)
    ll.display()
    print("before position")
    ll.insert_before_position(25, 2)
    ll.display()
    print("insert At position")
    ll.insert_at_position(23, 2)
    ll.display()
    print("delete before value")
    ll.delete_before_value(9)
    ll.display()
    print("delete after value")
    ll.delete_after_value(9)
    ll.display()
    print("delete At position")
    ll.delete_at_position(6)
    ll.display()
    print("delete After position")
    ll.delete_after_position(6)
    ll.display()
    print("delete Before position")
    ll.delete_before_position(2)
    ll.display()
