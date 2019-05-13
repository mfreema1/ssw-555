# Welcome to Agile Methods for Software Development

As you are all aware, we will be developing a linting system for a file format called GEDCOM, which is used to represent ancestry data.  This is a very hands-on project, so roll your sleeves up and prepare to get your hands dirty.  I am Mark, one of the graders of this course -- you can think of me as your safari guide, just without the Australian accent.  I'm sure you're excited to get started, so let's jump right in!

## Expectations
This is a Scrum simulation, which consists of two-week long sprints.  Every sprint, you must complete 2 user stories -- this includes implementing, unit testing, and demonstrating your logic.
- __Implementation__ _(8 pts each)_: This is the writing of the user story itself.  It will usually be found in a file called something like `USXX.ext`, where `.ext` is defined by whichever programming language you are using.
- __Unit Testing__ _(5 pts each)_: This is what makes your software reliable -- customers would not want something that they couldn't trust!  These are one (or hopefully more) tests written for some kind of test framework, such as JUnit, unittest, etc.  They are located in files called something like `testUS03.ext`, but again, this will depend on your programming langauge and test framework.  We give you concrete names for your tests in your starter pack.
- __Demonstration__ _(2 pts each)_: It's time to show off!  This is where your program prints something to the console and describes what it has found that has caused an error.  Please note that in order for a demonstration to count, it must show an error that it has found -- it cannot simply state that everything is okay or that nothing was found.

Demonstrations are special in that they are the only type of submission that can affect your group grade.  It is up to the team as a whole to make sure that the customer has their needs met.

## A Word on Sprint Reports
Sprint reports are like a diary for you to keep between sprints.  With every sprint, you will turn this in and we will evaluate it based on what you wrote.  The sprint checklist defines precisely what you need to put in your sprint report, such as a burndown chart, a sprint review, etc.  These are easy points and will affect the group as a whole -- please be sure to pay attention to detail here.

# On Programming
It can be useful to take some time up front to lay out the architecture of your solution -- this means before you start writing your code.  This is because as you lay down code, it will cost more to switch directions should you decide that your current solution isn't working.

These decisions might include a programming language choice, the decision to store parsed information in memory or on disk, etc.

## Picking a Language
Firstly, think about what language(s) your team members are most familiar with.  If some of you are willing to learn a new language for this project, that's great!  With that said, you'll probably want at least one person who is familiar with your language of choice.

Next, think of the strengths of the language(s) you know of -- do they line up with issues you predict you will face in GEDCOM?  

> For example, GEDCOM requires that you write a parser, which means string manipulation will be a big focus at some stage.  Are you more comfortable with this sort of thing in one language versus another?  Try to think of other aspects to this project as well!

If you need a quick primer or refresher on some languages, feel free to read below.

### For those Walking the Path of the Python for the First Time
For those who are new to Python, here's a crash-course:
- Python exists in two main versions: 2 and 3.  Your grandmother probably wrote in Python 2, so please stick to Python 3.
- It is a loosely typed language that is idiomatic and concise.  It is typically easy to understand for beginners.
- It fully supports object-oriented programming, and also provides a neat way to do polymorphism through duck typing.
- Python has some special data types that are very powerful -- namely the dictionary, list, and the occasional tuple.

### For the Brave Souls Taking their First Sip of Java
Java is very different from Python, so here's a sneak-peek on the language:
- Java versions itself using what is called a JDK, or the Java Developmet Kit.  At the time of this writing, the most recent is Java 12.  However, you should be fine with Java 8, which we use for our starter pack.
- Java is a strongly-typed language that is typically more verbose.  It is still relatively easy to understand for beginners.
- This is an object-oriented language which derives much of its power from relationships between classes.  Strictly organizing code using classes and interfaces can make larger projects more predictable and easier to understand.
- Java uses the collections framework to hold things like Maps, Lists, and Sets -- these act similarly to the dictionary, list, and other collection objects in Python.

## Who's Travis?
TravisCI is a continuous integration system that integrates directly with GitHub, which is where you'll be storing your projects.  Whenever you push code, Travis will run whatever tests you tell him to, which assures that your new changes have not broken any preexisting code.

You will need to define what Travis will do using a special `travis.yml` file.  A blank copy is provided to you in your starter pack, but you will need to fill it out.

## In Memory or on Disk?
One last thing you should decide on before you start coding, is how you're going to be handling data.  When you're reading in a file, it exists in a serialized form.  You must build a parser that deserializes this information and brings it into memory.  What you do with it once it's in memory is entirely up to you.  

It's all well and good to keep your data in a collection object such as a dictionary or a HashMap, but in some situations, it might make sense to store this data in a database.  Since we are working with relationships between people in our data, a _relational_ database could work.

Implementations of databases are not included in the starter packs, but you are free to add them on your own if you choose.
