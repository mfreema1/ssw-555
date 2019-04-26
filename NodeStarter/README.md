# "I Have Entered the Node"
_- Professor Ryan_

Welcome to the JavaScript starter.  You can feel free to shamelessly copy this code and use it as a skeleton for your own project.  You may need to add in some things that I've left out as an exercise to you.

## Node Modules -- a Supermassive Black Hole of Dependencies
In JavaScript, dependencies are stored at the project level, inside of a special folder called `node_modules`.  Dependencies are installed using the Node Package Manager, or `npm` for short.

> Note that you may also install dependencies at the system level with Node, however we will not be doing that for this project.

### Using npm
In the root of your project, to make a new Node project, simply use:
```bash
npm init
```
This will guide you through a little terminal program to get you started with a `package.json` file.  This file is where your dependencies are listed.  If you are familiar with Python virtual environments, this is similar to a `requirements.txt` file.

Next up, to install a dependency in this project, use:
```bash
# Here, "package" is the name of the package to install
npm install --save package
```

What does the `--save` flag do?  It instructs npm to write the dependency to your `package.json` file.  That way, another developer can install those same dependencies with a simple `npm install` command (assuming you have committed this file to version control).

> You may notice that the `jest` package is installed using `--save-dev`.  What this means, is that this package is only used during development, and should not ship with the production build of your code.  Anything that is not used during runtime of your application should be listed here.

You can always look up a package on npm to see what it exposes.  For example, [here](https://www.npmjs.com/package/table) is the page for the package we use to display tables.

## Project Structure

With JavaScript, you can afford to be prety loose with your project structure.  We recommend something like the below:

![Node Project Structure](https://github.com/mfreema1/ssw-555/blob/master/img/node/project.png)

With this project, we recommend using `Jest` for your test framework.  For Jest to work, you must name your file according to the `USXX.test.js` pattern.  Then, simply run `npm test` from the command line to test your code.

Be sure to read up on the [methods](https://jestjs.io/docs/en/api) that Jest exposes for use in testing.