/**
 * @param {number} n
 * @return {boolean}
 */
function getNext(n) {
    return n.toString().split('').reduce((sum, num) => {
        return sum + Math.pow(Number(num), 2);
    }, 0);
}

var isHappy = function (n) {

    let set = new Set();

    while (n !== 1 && !set.has(n)) {
        set.add(n);
        n = getNext(n); 
    }

    return n === 1;
};
