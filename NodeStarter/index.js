const US01 = require('./UserStories/US01').print_results;
const { table } = require('table');

const parsed_gedcom = [
    2,
    2,
    'fish'
];

data = [
    ['left', 'right', 'sum'],
    parsed_gedcom
];

console.log(table(data));
US01(...parsed_gedcom);