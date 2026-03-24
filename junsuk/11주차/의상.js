function solution(clothes) {
    let answer = 1;
    const map = new Map();
    for(const [name, category] of clothes){
       if(map.has(category)){
          map.set(category, map.get(category) + 1);
       } else {
           map.set(category, 1);
       }
    }
    
    for(const [category, count] of map){
        answer *= count + 1;
    }
    return answer - 1;
}

// 1. 의상별로 개수를 센다.
// 2. 만들 수 있는 조합의 경우의 수를 구함(의상별 개수 + 1)
//   - 여기서 +1은 해당 종류의 의상을 입지 않은 경우
// 3. 아무것도 입지 않은 경우를 뺌
// answer - 1;
