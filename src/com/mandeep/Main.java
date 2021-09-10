package com.mandeep;

import java.util.Scanner;  //scanner class for input

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);   //to take input from keyboard
            //       new keyword creates a new object
//        out, in are null by default that means they are comandline
//        if we define out as a file it will write the output to that file
        System.out.println(input.nextInt());
    }
}
