function solution(arr) {
    const gcd = (a, b) => b === 0 ? a : gcd(b, a % b);
    const lcm = (a, b) => (a * b) / gcd(a, b);
    let T = arr[0];
    
    for(let i = 1; i < arr.length; i++){
        T = lcm(T, arr[i]);
    }
    
    return T;
    
}
