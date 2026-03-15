function solution(s) {
    const map = new Map();
    const arr = s.split("");
    const result = [];
    
    for(let i = 0; i < s.length; i++){
        const ch = arr[i];
        if(map.has(ch)){
            result.push(i - map.get(ch));
        }else{
            result.push(-1);
        }
        map.set(ch, i);
        
    }
    return result;   
}
