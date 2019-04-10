# You'll need to do some thinking about how to fit this to
# the GEDCOM system.  Possibly open up some new methods and
# separate logic?
def run(left, right, sum):
    if(left + right != sum):
        print(f"ERROR US01: {left} and {right} do not add to {sum}")
    return left + right == sum
