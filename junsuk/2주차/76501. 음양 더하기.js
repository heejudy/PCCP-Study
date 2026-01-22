function solution(absolutes, signs) {
    let sum = 0;
    for(let i = 0; i < absolutes.length; i+=1){
        if(signs[i] === false){
             absolutes[i] = absolutes[i] * -1;
        }
    }
    for(const item of absolutes){
        sum += item;
    }
   return sum;
}
