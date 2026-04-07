function solution(weights) {
    let answer = 0;
    const store = {}; 

    weights.sort((a, b) => a - b);
    
    for (const w of weights) {
        [1, 2/3, 2/4, 3/4].forEach(r => {
            const target = w * r;
            if (store[target]) {
                answer += store[target];
            }
        });
        
        store[w] = (store[w] || 0) + 1;
    }

    return answer;
}
