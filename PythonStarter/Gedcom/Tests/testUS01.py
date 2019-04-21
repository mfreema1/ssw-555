import unittest
from UserStories.US01 import get_result

"""
This is one way to write your tests.  It is not perfect by
any means, but it should give you an idea of how your program
should flow.
"""

class TestAddition(unittest.TestCase):
    
    def testSimpleAddition(self):
        # Dummy data, only for demonstration
        parsed_gedcom = {
            "left": 2,
            "right": 2,
            "sum": 4
        }
        self.assertEqual(get_result(parsed_gedcom), {})

    def testComplexAddition(self):
        parsed_gedcom = {
            "left": 413,
            "right": 588,
            "sum": 1001
        }
        self.assertEqual(get_result(parsed_gedcom), {})

    def testWrongAddition(self):
        parsed_gedcom = {
            "left": 2,
            "right": 2,
            "sum": "fish"
        }
        self.assertNotEqual(get_result(parsed_gedcom), {})
        self.assertEqual(get_result(parsed_gedcom), parsed_gedcom)

if __name__ == '__main__':
    unittest.main()