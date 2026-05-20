function solution(progresses, speeds) {
    let daysLeft = [];
    let answer = [];
    let count = 1;            // 오늘 배포될 기능 개수
    
    // 남은 일 수 계산
    for(let i = 0; i < progresses.length; i++){
        daysLeft.push(Math.ceil((100 - progresses[i]) / speeds[i]));   
    }
    
    let maxDay = daysLeft[0]; // 첫 번째 기능의 남은 일수

    // 기능 배포 개수 계산
    for(let j = 1; j < daysLeft.length; j++){
        if(daysLeft[j] <= maxDay){
            // 기준일보다 작거나 같으면 오늘 같이 배포해야함
            count++; // 배포할 기능 개수 증가
        } else{ // 더 오래 걸리는 기능을 만나면 이전까지 쌓인 기능 배포 후 기준일 변경
            answer.push(count);
            maxDay = daysLeft[j];
            count = 1;
        }
    }
    // 마지막으로 계산한 count도 넣어줌
    answer.push(count); 
    return answer;
}
