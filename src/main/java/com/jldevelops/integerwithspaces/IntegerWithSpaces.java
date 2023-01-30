/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.integerwithspaces;

import java.util.Scanner;

/**
 *
 * @author johnsonli
 */
public class IntegerWithSpaces {
    
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = Keyboard.next();
        int size = input.length();
        String[] arr = new String[size];
        arr = input.split("");
        for(String a: arr)
            System.out.print(a + "   ");
    }
    
}
