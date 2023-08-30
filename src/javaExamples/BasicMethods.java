package javaExamples;

import java.util.Date;

public class BasicMethods {

    public static final int PASSWORD_LENGTH = 8;

    public static double findSmallestNumber(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static double avgNumber(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static int countAllVowels(String s){
        int count = 0;

        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) =='a' ||
                    s.charAt(i)=='e' ||
                    s.charAt(i)=='i' ||
                    s.charAt(i)=='o' ||
                    s.charAt(i)=='u'){
            count++;

            }
        }
        return count;
    }

    public static int countAllWords(String s){
        int count = 0;

        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) ==' '){
                count++;

            }
        }
        count ++; //for the last word
        return count;
    }

    public static int sumOfDigits(int i){
        int sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();
        return sum;
    }

    /*Write a Java method to check whether a string is a valid password.
        Password rules:
    A   password must have at least 8 characters.
    A password consists of only letters and digits.
    A password must contain at least two digits and two letters.*/
    public static boolean validPassword(String password){

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            if(isLetter(ch)) charCount++;
            else if(isNumeric(ch)) numCount++;
            else return false;

        }

        return(charCount>=2 && numCount>=2);


    }

    private static boolean isLetter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    private static boolean isNumeric(char ch){
        return (ch >= '0' && ch <= '9');
    }

    public static Date currentDateTime() {
        Date date = new java.util.Date();
        return date;

    }


    public static void main(String[] args) {

        System.out.println("Smallest nr: " + findSmallestNumber( 7,5,1));
        System.out.println("Avrg nr: " + avgNumber(25,45,65));
        System.out.println("Vowels count: " + countAllVowels("w3resource"));
        System.out.println("Words count: " + countAllWords("The quick brown fox jumps over the lazy dog."));
        System.out.println("Sum of digits: " + sumOfDigits(123456789));
        System.out.println("Valid password " + validPassword("12fdjnwudll78"));

        System.out.println("Current date and time " + currentDateTime());

        MonthsEnum currentMonth = MonthsEnum.AUGUST;
        System.out.println(currentMonth);



    }

}
