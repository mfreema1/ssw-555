# This is on the right path, but you'll need to figure out
# how to fit a similar pattern to GEDCOM or develop your
# own pattern

def get_result(data):
    """
    Look at the parsed GEDCOM (wherever it is) and see where the
    error are.  This is your user story logic.
    """
    if(data["left"] + data["right"] != data["sum"]):
        return data
    return {}


def print_result(result):
    """
    This assumes that the result is a 3-item list of parameters.
    The first item is the left operand, the second is the right,
    and the third is the supposed sum.
    """
    print(f"ERROR US01: {result['left']} and {result['right']} do not sum to {result['sum']}")
