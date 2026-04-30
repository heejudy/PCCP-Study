function solution(s) {
    let answer = 0;
    let first = "";
    let count1 = 0;
    let count2 = 0; 

    for (let i = 0; i < s.length; i++) {
        if (count1 === 0) {
            first = s[i];
            count1++;
        } else {
            if (s[i] === first) {
                count1++;
            } else {
                count2++;
            }
        }

        if (count1 === count2) {
            answer++;
            count1 = 0;
            count2 = 0;
        }
    }

    if (count1 > 0) {
        answer++;
    }

    return answer;
}
