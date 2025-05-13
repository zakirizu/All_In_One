package Java_Interview;

public class String_all_methods {

    public static void main(String[] args) {
        String str = "aman";
        
        // Using methods with return types
        //1.Length
        System.out.println("Length: " + getLength(str));
       //2.Char
        System.out.println("Character at index 1: " + getCharAt(str, 1));
        //3.Substring
        System.out.println("Substring (1-3): " + getSubstring(str, 1, 4));
        //4.Contains
        System.out.println("Contains 'ma': " + containsSubstring(str, "k"));
        //5.starts
        System.out.println("Starts with 'am': " + startsWith(str, "ma"));
        //6.
        System.out.println("Ends with 'n': " + endsWith(str, "n"));
        
        }
        
      public static int getLength(String str) {
        return str.length();
    }

    public static char getCharAt(String str, int index) {
        return str.charAt(index);
    }

    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    public static boolean startsWith(String str, String prefix) {
        return str.startsWith(prefix);
    }

    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }


}