# This is a Real Language?
Yes, Ruby is a language -- welcome to the starter.  You can feel free to shamelessly copy this code and use it as a skeleton for your own project.  You may need to add in some things that I've left out as an exercise to you.

## Bundler -- the Ruby Equivalent of a Virtual Environment
In Ruby, depentdencies are stored by default at the system level.  You can use Bundler to manage your dependencies, and even store them at the project level.  You'll need the name of the gem you want to install.  You can find them on [Ruby Gems](https://rubygems.org/).

> Similar to how we use `venv` or `virtualenv` in Python, you'll need to have Bundler installed at the system level of the machine you want to use it on.  You can install it by running `gem install bundler` at the command line.

Dependencies are listed in a special file called a `Gemfile` which you edit directly.  You can then execute a `bundle install` command to allow Bundler to fetch the needed files.  To install at the project level (which we recommend), use `bundle install --path vendor/bundle` from the root of your project.

Then, to install from the local bundle, simply add the following to the root of your program:
```ruby
require 'rubygems'
require 'bundler/setup'
```

After this, the dependencies included in your Gemfile will be available to your program.  Simply add your dependencies as usual in the rest of your files:
```ruby
# For example, if we need to print a table
require 'terminal-table'
```

### Using a Gemfile
With tools such as npm, you may be used to using a separate program to manage your dependency file for you (such as npm for use with a package.json file).  With a  `Gemfile`, you instead write the dependencies you want directly into the file using a `gem package` syntax, where "package" is the name of the package you want to download.

After editing your `Gemfile`, be sure to run a `bundle install` in order to pull down your new dependencies.  If your `Gemfile` has any errors, Bundler will let you know.

## Project Structure
With Ruby, you can afford to be pretty loose with your project structure.  Ruby has a slightly different import syntax than other languages.  If you intend to import an outside dependency simply use a `require 'package'`.  To import a package from a directory relative to the current file, use the `require_relative 'package'` syntax.

> Hint: `require_relative` is how you will import your user story logic into your test files.