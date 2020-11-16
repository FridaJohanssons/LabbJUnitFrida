package com.exempel;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        System.out.println("Write something: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        toUpperCase(word);
        toLowerCase(word);
        System.out.println("Reverse: " + reverse(word));

    }
    public static void toUpperCase (String word){
        String wordUpp = (word);

        System.out.print("Upper Case: " );
        System.out.println(wordUpp.toUpperCase() );
    }
    public static void toLowerCase (String word){
        String wordLow = (word);

        System.out.print("Lower Case: " );
        System.out.println(wordLow.toLowerCase() );
    }
    public static StringBuilder reverse (String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse();
    }
}
