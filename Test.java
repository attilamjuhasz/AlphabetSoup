public class Test {
    public static void main(String[] args) {
        String letters = "Attila";
        int ranChar = (int)(Math.random() * (letters.length()));
        System.out.println(letters.charAt(ranChar));
        System.out.println(letters.length());
    }
}