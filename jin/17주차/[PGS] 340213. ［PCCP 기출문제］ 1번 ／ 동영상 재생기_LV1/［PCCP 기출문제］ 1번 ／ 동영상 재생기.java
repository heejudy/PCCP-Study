class Solution {
    private int toSeconds(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    private String toTime(int totalSeconds) {
        return String.format("%02d:%02d", totalSeconds / 60, totalSeconds % 60);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLimit = toSeconds(video_len);
        int current = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);

        if (current >= opStart && current <= opEnd) current = opEnd;

        for (String c : commands) {
            if (c.equals("prev")) {
                current = Math.max(0, current - 10);
            } else {
                current = Math.min(videoLimit, current + 10);
            }
            if (current >= opStart && current <= opEnd) current = opEnd;
        }

        return toTime(current);
    }
}