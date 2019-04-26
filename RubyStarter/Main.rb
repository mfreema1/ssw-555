# install dependencies from the bundle
require 'rubygems'
require 'bundler/setup'

# import dependencies from bundle and other files
require 'terminal-table'
require_relative 'UserStories/US01.rb'

story = US01.new()
parsed_gedcom = [[2, 2, "fish"]]

# display our table
table = Terminal::Table.new :headings => ['Left', 'Right', 'Sum'], :rows => parsed_gedcom
puts table

# run each user story over the table
parsed_gedcom.each do |el|
    story.print_results(story.get_results(el[0], el[1], el[2]))
end