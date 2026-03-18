function solution(k, tangerine) {
    const frequency = tangerine.reduce((acc, curr) => {
        acc[curr] = (acc[curr] || 0) + 1;
        return acc;
    }, {}); 

    const sortedCounts = Object.values(frequency).sort((a, b) => b - a);

    let answer = 0; 
    let sum = 0;    

    for (const count of sortedCounts) {
        sum += count;
        answer++; 
        
        if (sum >= k) break;
    }

    return answer;
}
