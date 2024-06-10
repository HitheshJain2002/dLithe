package RemoveDuplicate;

public class removeDuplicate {
    public static void removeDuplicate(String str, int idx, StringBuffer newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String input = "hithesh";
        boolean[] map = new boolean[26]; // Assuming only lowercase alphabets
        StringBuffer newStr = new StringBuffer();
        removeDuplicate(input, 0, newStr, map);
    }
}
