package altrocore.hardTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class VowelsAndNot {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.replaceAll("\\s", "");
        char[] ch = new char[s.length()];
        String newSV = "";
        String newSNV = "";
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
            if(isVowel(ch[i])) {
                newSV += ch[i] + " ";
            }
            if(!isVowel(ch[i])) {
                newSNV += ch[i] + " ";
            }
        }
        System.out.println(newSV);
        System.out.println(newSNV);

    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
