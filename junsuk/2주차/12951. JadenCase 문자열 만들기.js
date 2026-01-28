function solution(s) {
    const newArr = s.split("");
    for(let i = 0; i < newArr.length; i+=1){
        if(i === 0 || newArr[i - 1] === " "){
            if(typeof(newArr[i]) === Number){
                continue;
            }
            newArr[i] = newArr[i].toUpperCase();
        }else{
            newArr[i] = newArr[i].toLowerCase();
        }
    }
    return newArr.join("");
}
