function solution(k, dungeons) {
    let maxCount = 0;
    const visited = new Array(dungeons.length).fill(false);

    function dfs(current, count) {
        maxCount = Math.max(maxCount, count);

        for (let i = 0; i < dungeons.length; i++) {
            const [min, consume] = dungeons[i];

            if (!visited[i] && current >= min) {
                visited[i] = true;
                dfs(current - consume, count + 1);
                visited[i] = false; 
            }
        }
    }

    dfs(k, 0);
    return maxCount;
}
