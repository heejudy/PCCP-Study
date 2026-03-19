function solution(t, p) {
    const tl = t.length
    const pl = p.length;
    const newArr = [];
    let count = 0;
    
    for(let i = 0; i < tl - pl + 1; i ++){
        newArr.push(t.slice(i, i + pl));
    }
    
    for(const item of newArr){
        if(item <= p){
            count += 1;
        }
    }
    return count;
   
}
