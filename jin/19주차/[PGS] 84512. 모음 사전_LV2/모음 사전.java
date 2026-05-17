class Solution {
    public int solution(String word) {
        String current = "";
        int count = 0;
        
        while (!current.equals(word)) {
            count++;
            
            if (current.length() < 5) {
                current += "A";
            } else {
                while (current.endsWith("U")) {
                    current = current.substring(0, current.length() - 1);
                }
                
                char lastChar = current.charAt(current.length() - 1);
                current = current.substring(0, current.length() - 1) + getNextVowel(lastChar);
            }
        }
        
        return count;
    }
    
    private char getNextVowel(char c) {
        if (c == 'A') return 'E';
        if (c == 'E') return 'I';
        if (c == 'I') return 'O';
        return 'U';
    }
}