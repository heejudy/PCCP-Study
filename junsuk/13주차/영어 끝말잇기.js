function solution(n, words) {
    const wordCount = new Set(); // 단어 중복 체크
    let result = [0, 0];
    
    wordCount.add(words[0]);
    
    for(let i = 1; i < words.length; i++) {
        const currentWord = words[i];
        const prevWord = words[i-1];
        
        if(wordCount.has(currentWord)) {
            const n1 = i % n + 1;
            const n2 = Math.ceil((i + 1) / n);
            result = [n1, n2];
            return result;
        }
        
        if(currentWord.at(0) !== prevWord.at(-1)){
            const n1 = i % n + 1;
            const n2 = Math.ceil((i + 1) / n);
            result = [n1, n2];
            return result;
        }
        
        wordCount.add(currentWord);
        
    }
    return [0, 0];
}
