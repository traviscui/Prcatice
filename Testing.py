import unittest
import sys
from Stack import stack

class TestSprint1(unittest.TestCase):

    def test_stack(self):
      s = stack()
      for i in range(225):
        s.push(i)
      
