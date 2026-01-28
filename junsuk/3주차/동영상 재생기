function solution(video_len, pos, op_start, op_end, commands) {
    const posArr = pos.split(":");
    const vlArr = video_len.split(":");
    const startArr = op_start.split(":");
    const endArr = op_end.split(":");
    let posSec = posArr[0] * 60 + posArr[1]*1;
    let vlSec = vlArr[0] * 60 + vlArr[1]*1; 
    let startSec = startArr[0] * 60 + startArr[1]*1;
    let endSec = endArr[0] * 60 + endArr[1]*1;
    let idx = 0;
    let m;
    let s;
    let result;
    
    while(commands.length > idx){        
        if(posSec >= startSec && posSec <= endSec){
            posSec = endSec;
        }
        if(commands[idx] === "next"){
            posSec += 10;
            if(posSec >= vlSec){
                posSec = vlSec;
            }
        }else{
            posSec -= 10;
            if(posSec < 0){
                posSec = 0;
            }
        }
        if(posSec >= startSec && posSec <= endSec){
            posSec = endSec;
        }
        idx += 1;
       
    }
    m = Math.floor(posSec / 60);
    s = posSec % 60;
    if(m < 10 && m !== 0){
       m = "0" + m;
    }else if(m === 0){
        m = "00"
    }
    if(s < 10 && s !== 0){
       s = "0" + s;
    }else if(s === 0){
        s = "00"
    }
    result = m + ":" + s;
    return result;
}

// - pos 기준 - prev : 10초전 이동, next : 10초후 이동 
// 현재 위치가 10초 미만일 시 영상의 처음 위치(00:00)로 이동
// 남은 시간이 10초 미만일 시 영상의 마지막 위치(video_len)로 이동
// 현재 재생 위치가 오프닝 구간(op_start < pos < op_end)인 경우 
// 오프닝 끝나는 구간(op_end)으로 오프닝 건너뛰기
