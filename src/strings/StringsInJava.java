package strings;
public class StringsInJava {
    public static void main(String[] args) {
        char[] letters = {'M','A','M','A','T','H','A'};
        // String name = letters.toString(); this is incorrect
        String name = new String(letters);
        System.out.println(name); // MAMATHA
        String jumbled = "Ranjan1is1from1CSD1Sem17";
        // Ranjan is from CSD Sem 7
        String[] words = jumbled.split("1");
        System.out.println(words[0]);
        System.out.println(words[4]);
        String str = "biet";
        System.out.println(str.toUpperCase());
        System.out.println("Original: " + str);
    }
}
