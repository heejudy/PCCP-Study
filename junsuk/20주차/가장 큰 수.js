function solution(numbers) {
    // 모든 수를 문자열로 변환 후, 이어 붙였을 때 더 큰 순서대로 정렬
    const answer = numbers
        .map(num => String(num))
        .sort((a, b) => (b + a) - (a + b))
        .join('');
    
    // 정렬했을 때 첫 글자가 0이라면, 0반환
    return answer[0] === '0' ? '0' : answer;
}

// 붙여서 비교 후 정렬하면 될 것 같은데

