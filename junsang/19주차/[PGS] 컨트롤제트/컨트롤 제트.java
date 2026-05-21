class Solution {
    public int solution(String s) {
        String[] array = s.split(" ");
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Z")) {
                answer -= Integer.parseInt(array[i - 1]);
                continue;
            }
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }
}