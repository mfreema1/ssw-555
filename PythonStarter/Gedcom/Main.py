from UserStories.US01 import get_result, print_result
from prettytable import PrettyTable

def main():
    parsed_gecom = {
        "left": 2,
        "right": 2,
        "sum": "fish"
    }
    
    table = PrettyTable(parsed_gecom.keys())
    table.add_row(parsed_gecom.values())
    print(table)

    print_result(get_result(parsed_gecom))

if __name__ == '__main__':
    main()