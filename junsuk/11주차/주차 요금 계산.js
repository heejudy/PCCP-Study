function solution(fees, records) {
    const [baseTime, baseFee, unitTime, unitFee] = fees;
    const Map1 = new Map(); // 입차 관리용 Map
    const Map2 = new Map(); // 총 누적시간 Map

    records.forEach(record => {
        const [time, carNumber, status] = record.split(" ");
        const [hour, min] = time.split(":").map(Number);
        const totalMin = hour * 60 + min;

        if (status === "IN") {
            Map1.set(carNumber, totalMin);
        } else {
            const parkingTime = totalMin - Map1.get(carNumber);
            Map2.set(carNumber, (Map2.get(carNumber) || 0) + parkingTime);
            Map1.delete(carNumber); 
        }
    });

    // 미출차 차량 처리
    const lastTime = 23 * 60 + 59;
    for (const [carNumber, inTime] of Map1) {
        const duration = lastTime - inTime;
        Map2.set(carNumber, (Map2.get(carNumber) || 0) + duration);
    }

    // 요금 계산
    const result = [...Map2.entries()]
        .sort((a, b) => a[0] - b[0]) 
        .map(([carNumber, totalTime]) => {
            if (totalTime <= baseTime) return baseFee;
            const extraTime = totalTime - baseTime;
            return baseFee + Math.ceil(extraTime / unitTime) * unitFee;
        });

    return result;
}
