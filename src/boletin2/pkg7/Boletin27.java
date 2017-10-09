/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg7;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int C , F , K;
        Scanner obx1 = new Scanner (System.in);
        C = obx1.nextInt();
        F=C*(9/5)+32;
        K=C+273;
        System.out.println(C+" celsius son "+F+" Farhenheit");
        System.out.println(C+" celsius son "+K+" Kelvin");
    }
    
}
