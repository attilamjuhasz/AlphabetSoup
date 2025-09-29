//Name: Attila Juhasz
//Date: 09/29/25
//Description: This program will do a bunch of stuff with the letters and company strings to hide secret messages/



public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){

        // You have to have letters defined and you have to give a word as an input.
        // You will receive a redefined letter string that has the original letters along with word added to it.

        // Adds word into letters.
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){

        // This needs letters to be defined before it's called
        // Returns a random character from the letters string

        // It creates randChar which uses Math.random to find a random char in the code and then returns that char.
        int randChar = (int)(Math.random() * letters.length());
        return letters.charAt(randChar);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){

        // This needs letters and company to be defined before this funciton is run
        // This returns letters with the company name added right into the middle

        // This creates an letHalf which just represents the middle of the letters string. Then it creates to halves using
        // the substring methods, and then takes those and changes letters to be the
        // two havles with the company name in the middle.
        int letHalf = letters.length() / 2;
        String letOne = letters.substring(0, letHalf + 1);
        String letTwo = letters.substring(letHalf);
        letters = letOne + company + letTwo;
        return letters;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        
        // Needs letters to be defined before it is run
        // Returns letter but the first vowel is removed

        // Redeclares letters as letters but the first appearance of A, E, I, O, U, a, e, i, o, or u is removed.
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){

        // Needs letters to be defined and the user needs to give a random number for the function that is smaller than the overall string
        // Returns letters but a num amount of letters are removed from a random spot within letters.
        
        // Creates ran varialbe which is just a random number. Then it finds a random spot within letters making
        // sure num fits in it. Finally, it removes num letters from the spot using substrings.
        double rand = Math.random();
        int spot = (letters.length() - (int)(rand * (letters.length() - num + 1))) - num;
        letters = letters.substring(0,spot) + letters.substring(spot + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){

        // Needs letters to be defined and you need to give the function a random word that is found within letters
        // Returns letters but word is removed

        // Checks if the letters contains the word. If it does, it will find out where the word is in the
        // letter using indexOf() and then it uses substring() to cut out the word.
        boolean contains = letters.contains(word);
        if (contains == true){
            int loc = letters.indexOf(word);
            letters = letters.substring(0, loc) + letters.substring(loc + word.length());
        }
    }
}
