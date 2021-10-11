package com.mandeep;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for(int i=0;i<t;i=i+1){
//            int A;
//            int B;
            int A = in.nextInt();
            int B = in.nextInt();
            if(A > 0 && B > 0) {
                System.out.println("Solution");
            }
            else if (A == 0) {
                System.out.println("Liquid");
            }
            else {
                System.out.println("Solid");
            }
        }
//
//        int a,b;
//        a = in.nextInt();
//        b = in.nextInt();
//        if(a>0 && b>0) System.out.println("a+b");
    }
}
