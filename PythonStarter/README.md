# Why Did it Have to be Snakes?
Welcome to the Python starter.  You can feel free to shamelessly copy this code and use it as a skeleton for your own project.  You may need to add in some things that I've left out as an exercise to you.

## Enter the ~~Dragon~~ Virtual Environment
In Python, dependencies are installed at the system level, which makes things both easier and tougher.  If you’re using Python 3.3 or later, you’ll have access to something called `venv` which helps quite a bit with dependency management.  Venv stands for virtual environment, which you can think of as an isolated box for you to put dependencies in.

### Using Venv
In the root of your project, to make a new virtual environment, use:
```bash
# Here, "env" is the name of the virtual environment
python3 -m venv env
```

To activate it (or enter the virtual environment), use:
```bash
source env/bin/activate
```

You should now see something like the below.  The parenthesis to the left indicate the name of the virtual environment we are in.  You should always activate the virtual environment before running your code or installing a dependency.
![Venv terminal](https://github.com/mfreema1/ssw-555/tree/master/img/python/venv.png)

Note that many IDEs will detect and auto-activate virtual environments before they run -- a bonus!

Now, install dependencies as you normally would (using pip):
```bash
# I'm using prettytable just as an example
pip3 install prettytable
```

To export your dependencies to a text file, simply type:
```bash
pip3 freeze > requirements.txt
```

Handling dependencies like this is much better than a simple install for a few reasons:
1. Dependencies only exist in the virtual environment and do not pollute your system.
2. Dependencies are more modular.  For someone else (like Travis or a teammate) to install your dependencies, all they must do is:
```bash
pip3 install -r requirements.txt
```

This `requirements.txt` file is just a text file that lists out your dependencies.  It should be committed to version control to keep your fellow developers up-to-date.

If you install a dependency without updating your requirements.txt file, then your teammates will likely not have the same dependency installed.  When they run any code that uses that dependency, it will fail on their machine.

## Project Structure

Since we aren’t using a build management system, we have more freedom in how we design our folder structure.  We recommend something like the below:

![Python project structure](https://github.com/mfreema1/ssw-555/tree/master/img/python/project.png)

These `__init__.py` files are empty files (nothing in them) that denote a Python package.  They will allow you to laterally import your user story logic into your test directory.

Also note that with test frameworks, you often must stick to a naming convention for tests.  Otherwise, it will not know which files are tests.  For unittest, all test files must start with “test”.

To execute a single test -- simply run it as you would any other Python file.  To run all of your tests from the root of your project, simply use:
```bash
python3 -m unittest discover
```