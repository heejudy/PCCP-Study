function solution(n){
    let ans = 0;
    while(n > 0){
        if(n % 2 === 1){
            ans += 1;
            n--;
        } else {
            n /= 2;
        }
    }
    return ans;
    
}

// K 칸 앞으로 점프 or (현재까지 온 거리) x 2 순간이동
// 점프만 건전지 사용함
// 거리가 N만큼 떨어져 있는 장소로 감
// 점프로 이동하는것은 최소로
// 건전지 사용량의 최솟값 return
// N에서 거꾸로 계산해야함 
