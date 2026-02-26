function solution(n) {
    let ternary = n.toString(3);
    let reversed = ternary.split('').reverse().join('');
    return parseInt(reversed, 3);
}
