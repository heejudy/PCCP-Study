function solution(s){
    var answer = true;
    const newN = s + "";
    const newArr = newN.split("");
    let match = 0;
    for(const item of newArr){
        if(item === "("){
            match += 1;
        }
        else if(item === ")"){
            match -= 1;
        }
        if(match === -1){
            break;
        }
    }
    console.log(match);
    if(match === 0){
        return true;
    }
    else{
        return false;
    }
}
