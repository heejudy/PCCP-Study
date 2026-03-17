function solution(n) {
    let result = "";
    let i = 1;
    while(i <= n){
        if(i % 2 === 0){
            result += "박";
        }else{
            result += "수";
        }
        i++
    }
    
    return result;
}
