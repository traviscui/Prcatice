class Node:
    def __init__(self, value):
        self.ancestor = None
        self.value = value
        self.left_child = None
        self.right_child = None


class BST:
    def __init__(self):
        self.root = None

    def is_root(self, node):
        if node.ancester is None:
            return True
        else:
            return False

    def root(self):
        return self.root

    def parent(self, node):
        if node.ancester is None:
            raise Exception(node + " is root.")
        else:
            return node.ancester

    def children(self, node):
        if BST.is_external(node) is True:
            print("Node is external.")
        else:
            print("Children are " + node.left_child + node.right_child)

    def is_internal(self, node):
        if node.left_child is not None:
            return True
        else:
            return False

    def is_external(self, node):
        if BST.is_internal(node) is False:
            return True
        else:
            False
