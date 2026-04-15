function solution(x) {
    let answer = true;
    const newN = x + "";
    const newArr = newN
    .split("");
    let sum = 0;
    for(const item of newArr){
        sum += +item;
        console.log(sum);
    }
    (x % sum === 0) ? answer = true : answer = false;
    return answer;
}
