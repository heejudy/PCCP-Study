function solution(s) {
    let answer = '';
    let index = 0;
    
    for(let i = 0; i < s.length; i++){
        if(s[i] === ' '){
            answer += ' ';
            index = 0;
        }else{
            answer += (index % 2 === 0) ? s[i].toUpperCase() : s[i].toLowerCase();
            index++;
        }
    }
    return answer;
}
