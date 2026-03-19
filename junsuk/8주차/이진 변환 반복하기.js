function solution(s) {
    let conversionCount = 0;
    let totalZeroCount = 0;
    const getZeroCount = (str) => [...str].filter(c => c === '0').length;
    const getOneCount = (str) => [...str].filter(c => c === '1').length;
    
    while(s !== '1'){
        conversionCount++;
        
        totalZeroCount += getZeroCount(s);
        
        const c = getOneCount(s);
        s = c.toString(2);
    }
    
    return [conversionCount, totalZeroCount];
}
