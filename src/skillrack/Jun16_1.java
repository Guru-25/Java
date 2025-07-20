public class Jun16_1 {
    public static void main(String[] args) {
        String s = "pollution";
        int k = 2;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int vowelCount = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (isVowel(ch)) {
                    vowelCount++;
                }

                if (vowelCount == k) {
                    count++;
                    System.out.println(s.substring(i, j + 1));
                } else if (vowelCount > k) {
                    break; // no need to go further if we exceeded k vowels
                }
            }
        }

        System.out.println("Total substrings with exactly " + k + " vowels: " + count);
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
