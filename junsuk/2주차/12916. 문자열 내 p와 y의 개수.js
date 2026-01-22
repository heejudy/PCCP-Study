function solution(s){
    const newArr = Array.from(s);
    let cnt = 0;

    newArr.forEach(
        (i)=>{
        if(i === "p" || i === "P"){
            cnt += 1;
        }else if(i === "y" || i === "Y"){
            cnt -= 1;
        }
    })
    return cnt === 0 ? true : false
}
