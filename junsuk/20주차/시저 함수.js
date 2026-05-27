function solution(s, n) {
    const arr = s.split("");
    
    for(let i = 0; i < arr.length; i++){
        if(arr[i] === ' ') continue;
        let ch = arr[i].charCodeAt();
        for(let j = 0; j < n; j++){
            if(ch === 122){
                ch = 97;
                continue;
            } 
            if(ch === 90){
                ch = 65;
                continue;
            }
            ch += 1;
        }
        arr[i] = String.fromCharCode(ch);
    }
    return arr.join("");
}
