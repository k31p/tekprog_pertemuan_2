package org.example.soal5;

import java.util.Scanner;

/**
 * Class ini berisi penyelesaian dari soal no 5
 * @author Yobel El'Roy Doloksaribu
 * @since 2024-02-15
 */
public class Soal5 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        int panjangAdanB = inputA.length() + inputB.length();

        int kondisi = inputA.compareTo(inputB);

        inputA = inputA.substring(0,1).toUpperCase() + inputA.substring(1);
        inputB = inputB.substring(0,1).toUpperCase() + inputB.substring(1);
        String concatenated = inputA + " " + inputB;

        System.out.println(panjangAdanB);
        if(kondisi >= 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(concatenated);
    }
}
