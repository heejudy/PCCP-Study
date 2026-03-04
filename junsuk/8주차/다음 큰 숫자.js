function solution(n) {
    const targetCount = [...n.toString(2)].filter((char) => char === '1').length;
    let nnum = n+1;
    while(true){
        const currentCount = [...nnum.toString(2)].filter((char) => char === '1').length;

        if(targetCount === currentCount){
            return nnum;
        }
        nnum += 1;
    }
}
