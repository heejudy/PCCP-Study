function solution(array, commands) {
    return commands.map(command => {
        const [i, j, k] = command;
        
        const slicedArr = array.slice(i - 1, j);
        
        slicedArr.sort((a, b) => a - b);
        
        return slicedArr[k - 1];
    })
}
