function solution(topping) {
    const leftSet = new Set();
    const countArray = new Array(10001).fill(0);
    let rightTypeCount = 0;
    let cnt = 0;
    
    for(let i = 0; i < topping.length; i++){
        countArray[topping[i]]++;
        if(countArray[topping[i]] === 1){
            rightTypeCount++;
        }
    }
    for(let j = 0; j < topping.length; j++){
        leftSet.add(topping[j]);
        countArray[topping[j]]--;
        if(countArray[topping[j]] === 0){
            rightTypeCount--;
        }
        
        if(leftSet.size === rightTypeCount){
            cnt++;
        }
    }
    return cnt;
    
}

