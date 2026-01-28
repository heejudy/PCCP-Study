function solution(n) {
  let left = 1;
  let right = 1;
  let sum = 1;
  let cnt = 0;

  while (left <= n) {
    if (sum === n) cnt++;

    if (sum >= n) {
      sum -= left;
      left++;
    } else {
      right++;
      sum += right;
    }
  }
  return cnt;
}
