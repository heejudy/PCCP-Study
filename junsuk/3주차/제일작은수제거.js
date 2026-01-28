function solution(arr) {
    const idx = arr.indexOf(Math.min(...arr));
    const newArr = arr;
    newArr.splice(idx, 1)
    if(newArr.length === 0){
        newArr.push(-1);
    }
    return newArr;
}
