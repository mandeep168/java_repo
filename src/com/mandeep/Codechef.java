package com.mandeep;

import java.util.Scanner;

class Codechef {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for(int i=0;i<t;i=i+1){
            int N = in.nextInt();
            int temp = (int) Math.floor(Math.log(N)/Math.log(2));
            int ans = (int) Math.max(N - Math.pow(2,temp) + 1, Math.pow(2, temp-1));

            System.out.println(ans);
        }
    }
}
