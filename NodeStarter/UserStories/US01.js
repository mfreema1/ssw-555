const get_results = (left, right, sum) => {
    if(left + right != sum)
        return [left, right, sum];
    return [];
}

const print_results = (left, right, sum) => {
    console.log(`ERROR US01: ${left} and ${right} do not sum to ${sum}`);
}

module.exports = {
    get_results,
    print_results
}