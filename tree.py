class Node:
    def __init__(self, value):
        self.parent = None
        self.value = value
        self.left_child = None
        self.right_child = None


class BST:
    def __init__(self):
        self.root = None

    def insert(self, value):
        place_to_insert_parent = self.root
        node = Node(value)
        if not self.root:
            self.root = node
            return
        while place_to_insert_parent:
            if value < place_to_insert_parent.value and not place_to_insert_parent.left_child:
                node.parent = place_to_insert_parent
                place_to_insert_parent.left_child = node
                return
            elif value < place_to_insert_parent.value and place_to_insert_parent.left_child:
                place_to_insert_parent = place_to_insert_parent.left_child
                continue
            elif value >= place_to_insert_parent.value and not place_to_insert_parent.right_child:
                node.parent = place_to_insert_parent
                place_to_insert_parent.right_child = node
                return
            else:
                place_to_insert_parent = place_to_insert_parent.right_child
                continue

    def search(self, value):
        value_to_find = value
        place_to_search = self.root
        if not self.root:
            raise Exception("Empty Tree")
        while place_to_search:
            if value_to_find == place_to_search.value:
                return place_to_search
            elif value_to_find < place_to_search.value:
                place_to_search = place_to_search.left_child
                continue
            else:
                place_to_search = place_to_search.right_child
                continue
        raise Exception("404 Not Found")

    def remove(self, value):
        pass

    def breath_search(self):
        stack = [self.root]
        result = []
        while stack:
            tmp = []
            result.append([])
            while stack:
                node = stack.pop(0)
                if node:
                    result[-1].append(node.value)
                    tmp.append(node.left_child)
                    tmp.append(node.right_child)
                else:
                    result[-1].append('#')
            stack = tmp
        return result

B = BST()
B.insert(100)
B.insert(50)
B.insert(200)
B.insert(34)
B.insert(4)
B.insert(0)
B.insert(900)
B.insert(45)
B.insert(567)
B.insert(23)
B.insert(2)
B.insert(6)
B.insert(90)
B.insert(34)
B.insert(3)

B.remove(23)

print(B.breath_search())