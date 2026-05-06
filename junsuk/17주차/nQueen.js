function solution(n) {
    let answer = 0;
    const board = new Array(n).fill(0);

    function isPossible(row) {
        for (let i = 0; i < row; i++) {
            if (board[row] === board[i]) return false;
            
            if (Math.abs(board[row] - board[i]) === row - i) return false;
        }
        return true;
    }

    function dfs(row) {
        if (row === n) {
            answer++;
            return;
        }

        for (let col = 0; col < n; col++) {
            board[row] = col; 
            if (isPossible(row)) {
                dfs(row + 1);   
            }
        }
    }

    dfs(0);
    return answer;
}
