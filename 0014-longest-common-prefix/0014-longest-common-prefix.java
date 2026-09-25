class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);

        for (int i = 1; i < strs.length; i++) {

            int min = Math.min(sb.length(), strs[i].length());

            int j = 0;

            while (j < min && sb.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            sb.setLength(j);

            if (sb.length() == 0) {
                return "";
            }
        }

        return sb.toString();
    }
}