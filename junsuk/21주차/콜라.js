function solution(a, b, n) {
    let total = 0;

    while (n >= a) {
        let count = Math.floor(n / a); 
        let newCola = count * b;

        total += newCola;
        n = (n % a) + newCola;
    }

    return totalCola;
}
