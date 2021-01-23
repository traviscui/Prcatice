class Node:
    def __init__(self, value):
        self.parent = None
        self.value = value
        self.left_child = None
        self.right_child = None


class BST:
    def __init__(self):
        self.root = None

    # def insert2(self, value):
    #     node = Node(value)
    #     place_to_insert = BST.search(self, value)
    #     if not place_to_insert:
    #         self.root = node
    #         return
    #     if place_to_insert.value != value:
    #         if value < place_to_insert.value and not place_to_insert.left_child:
    #             place_to_insert.left_child = node
    #             node.parent = place_to_insert
    #             return
    #         elif value >= place_to_insert.value and not place_to_insert.right_child:
    #             place_to_insert.right_child = node
    #             node.parent = place_to_insert
    #             return

    def insert2(self, value):
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

    def insert(self, node_in_interest, value):
        if not self.root:
            self.root = Node(value)
        elif not node_in_interest:
            return Node(value)
        elif value < node_in_interest.value:
            node_in_interest.left_child = self.insert(node_in_interest.left_child, value)
        else:
            node_in_interest.right_child = self.insert(node_in_interest.right_child, value)
        return node_in_interest

    # def insert3(self, node, key):
    #     if node is None:
    #         return Node(key)
    #     if key < node.key:
    #         node.left = BST.insert3(node.left_child, key)
    #     else:
    #         node.right = BST.insert3(node.right_child, key)
    #     return node

    def search(self, value):
        value_to_find = value
        place_to_search = self.root
        if not self.root:
            return None
        while place_to_search:
            if value_to_find == place_to_search.value:
                return place_to_search
            elif value_to_find < place_to_search.value:
                prev_place = place_to_search
                place_to_search = place_to_search.left_child
                continue
            else:
                prev_place = place_to_search
                place_to_search = place_to_search.right_child
                continue
        return prev_place

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
#B.root = Node(100)
B.insert(B.root, 100)
B.insert(B.root, 50)
B.insert(B.root, 200)
B.insert(B.root, 4)
B.insert(B.root, 0)
B.insert(B.root, 900)
B.insert(B.root, 45)
B.insert(B.root, 567)
B.insert(B.root, 23)
B.insert(B.root, 2)
B.insert(B.root, 6)
B.insert(B.root, 90)
B.insert(B.root, 34)
B.insert(B.root, 3)

print(B.breath_search())
print(B.root)

B2 = BST()
B2.insert2(100)
B2.insert2(50)
B2.insert2(200)
B2.insert2(4)
B2.insert2(0)
B2.insert2(900)
B2.insert2(45)
B2.insert2(567)
B2.insert2(23)
B2.insert2(2)
B2.insert2(6)
B2.insert2(90)
B2.insert2(34)
B2.insert2(3)
print(B2.breath_search())
print(B2.root.value)
#
# B3 = BST()
# B3.insert_recur(B3.root, 100)
# B3.insert_recur(B3.root, 50)
# B3.insert_recur(B3.root, 200)
# B3.insert_recur(B3.root, 4)
# B3.insert_recur(B3.root, 0)
# B3.insert_recur(B3.root, 900)
# B3.insert_recur(B3.root, 45)
# B3.insert_recur(B3.root, 567)
# B3.insert_recur(B3.root, 23)
# B3.insert_recur(B3.root, 2)
# B3.insert_recur(B3.root, 6)
# B3.insert_recur(B3.root, 90)
# B3.insert_recur(B3.root, 34)
# B3.insert_recur(B3.root, 3)
# print(B2.breath_search())
# print(B2.root.value)
