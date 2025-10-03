//Name: Attila Juhasz
//Date: 09/29/25
//Description: This program will do a bunch of stuff with the letters and company strings to hide secret messages.



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

    //precondition: You have to have letters defined and you have to give a word as an input.
    //postcondition You will receive a redefined letter string that has the original letters along with word added to it.
    public void add(String word){
        letters += word;
    }


    //precondition: This needs letters to be defined before it's called
    //postcondition: Returns a random character from the letters string
    public char randomLetter(){
        int randChar = (int)(Math.random() * letters.length());
        return letters.charAt(randChar);
    }


    //precondition: This needs letters and company to be defined before this funciton is run
    //postcondition: This returns letters with the company name added right into the middle
    public String companyCentered(){
        int letHalf = letters.length() / 2;
        String letOne = letters.substring(0, letHalf + 1);
        String letTwo = letters.substring(letHalf);
        letters = letOne + company + letTwo;
        return letters;
    }


    //precondition: Needs letters to be defined before it is run
    //postcondition: Returns letter but the first vowel is removed
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
    }


    //precondition: Needs letters to be defined and the user needs to give a random number for the function that is smaller than the overall string
    //postcondition: Returns letters but a num amount of letters are removed from a random spot within letters.
    public void removeSome(int num){
        double rand = Math.random();
        int spot = (letters.length() - (int)(rand * (letters.length() - num))) - num;
        letters = letters.substring(0,spot) + letters.substring(spot + num);
    }

    //precondition: Needs letters to be defined and you need to give the function a random word that is found within letters
    //postcondition: Returns letters but word is removed
    public void removeWord(String word){
        boolean contains = letters.contains(word);
        if (contains == true){
            int loc = letters.indexOf(word);
            letters = letters.substring(0, loc) + letters.substring(loc + word.length());
        }
    }
}
