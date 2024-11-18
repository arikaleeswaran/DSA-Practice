import java.util.HashMap;

public class NonRepeating {
    static char nonRepeatingChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (hm.get(c) == 1) return c;
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "swiss";
        char result = nonRepeatingChar(s);

        if (result != '$') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
