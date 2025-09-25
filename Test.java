public class Test {
    public static void main(String[] args) {
        String letters = "AttilaMihalyJuhasz";
        int num = 7;
        double rand = Math.random();
        int spot = (letters.length() - (int)(rand * (letters.length() - num + 1))) - num;
        letters = letters.substring(0,spot) + letters.substring(spot + num);
        System.out.println(letters);
    }
}