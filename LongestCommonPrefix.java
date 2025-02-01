public class LongestCommonPrefix {

    //14. Longest Common Prefix
    public static String longestCommonPrefix(String[] strs) {

        int beginIndex = 0;
        int endIndex = -1;

        int minSize = strs[0].length();

        for (String str : strs) {
            minSize = Math.min(minSize, str.length());
        }

        for (int i = 0; i < minSize; i++) {

            boolean check = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    check = false;
                    break;
                }
            }
            if(check){
                endIndex = i;
            }else{
                break;
            }
        }

        return endIndex < 0 ? "" : strs[0].substring(beginIndex, endIndex + 1);
    }

    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "fight"};
        String[] strs = {"cir", "car"};

        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }

}
