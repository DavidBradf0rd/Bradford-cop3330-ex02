package org.example;

import java.util.Scanner;



/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
public class CountingtheNumberofCharacters

{
    public static void main(String[] args) {


    {
        System.out.print( "What is the input string? " ); //asks user for input
        Scanner scan = new Scanner(System.in); //imports scanner
        String userinput = scan.nextLine(); //scans users response
        int length = userinput.length(); //creates length variable from scanned response
        System.out.println(userinput+" has "+length+" characters."); //outputs scanned variable and the length of it

    }

}
}
