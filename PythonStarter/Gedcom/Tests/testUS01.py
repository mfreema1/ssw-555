import unittest
from UserStories.US01 import run

class TestAddition(unittest.TestCase):
    
    def testSimpleAddition(self):
        assert(run(1, 1, 2))

    def testComplexAddition(self):
        assert(run(400, 400, 800))

    def testWrongAddition(self):
        assert(not run(1, 1, 3))

if __name__ == '__main__':
    unittest.main()