package org.example.soal1;

//import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger realInput;
        long inputUser;
        byte counter = 1;

        int n = scanner.nextInt();

        while(counter <= n){
            realInput = scanner.nextBigInteger();
            if(realInput.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0){
                System.out.println(realInput + " can't be fitted anywhere.");
                continue;
            }

            inputUser =  realInput.longValue();

            System.out.println(inputUser + " can be fitted in:");
            if(inputUser >= Byte.MIN_VALUE && inputUser <= Byte.MAX_VALUE){
                System.out.println("* byte");
            }
            if(inputUser >= Short.MIN_VALUE && inputUser <= Short.MAX_VALUE){
                System.out.println("* short");
            }
            if(inputUser >= Integer.MIN_VALUE && inputUser <= Integer.MAX_VALUE){
                System.out.println("* int");
            }

            System.out.println("* long");
            counter++;
        }
    }
}