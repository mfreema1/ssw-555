const US01 = require('../UserStories/US01').get_results;

test('Tests simple addition', () => {
    expect(US01(2, 2, 4)).toEqual([]);
});

test('Tests complex addition', () => {
    expect(US01(167, 513, 680)).toEqual([]);
});

test('Tests wrong addition', () => {
    expect(US01(2, 2, 'fish')).toEqual([2, 2, 'fish']);
});