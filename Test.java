public class Test {
    public static void main(String[] args) {
        String letters = "Attila";
        String word = "ttil";
        boolean contains = letters.contains(word);
        if (contains == true){
            int loc = letters.indexOf(word);
            letters = letters.substring(0, loc) + letters.substring(loc + word.length());
            System.out.println(letters);
        }
    }
}