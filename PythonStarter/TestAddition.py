import unittest

class TestAddition(unittest.TestCase):
    
    def testSimpleAddition(self):
        self.assertEqual(1 + 1, 2)

if __name__ == '__main__':
    unittest.main()
