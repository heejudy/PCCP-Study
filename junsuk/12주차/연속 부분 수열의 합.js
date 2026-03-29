function solution(elements) {
    const n = elements.length;
    const arr = [...elements, ...elements];
    const sumSet = new Set();
    
    for(let i = 0; i < n; i++){
        let currentSum = 0;
        for(let j = 0; j < n; j++) {
            currentSum += arr[i + j];
            sumSet.add(currentSum);
        }
    }
    return sumSet.size;
    
}
