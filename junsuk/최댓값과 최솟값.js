function solution(s) {
    const newN = s + "";
    const newArr = newN
    .split(" ")
    .sort((a, b) => a - b);
    let Min = newArr.shift();
    let Max = newArr.pop();
    
    return Min + " " + Max  
}
