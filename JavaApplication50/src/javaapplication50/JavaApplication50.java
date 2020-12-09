/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author M. RAFI DUTA ATTALA
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in); 
        String keretaA,keretaB,Tujuan;
        keretaA = "Kereta JAVA-TRANS-07.";
        keretaB = "kereta GATOT Express-58";
        System.out.println("Nama : ");
        input.nextLine();
        System.out.println("Nomor Identitas :");
        input.nextInt();
        System.out.println("Jumlah Orang : ");
        input.nextInt();
        System.out.println("  << STASIUN KERETA KEDIRI >>");
        System.out.println("Pilihan Tipe Kereta");
        System.out.println("Opsi 1 = " + keretaA);
        System.out.println("Opsi 2 = " + keretaB);
        System.out.println("Tujuan :");
        sc.nextLine(); 
        System.out.println("Pemberangkatan Awal :");
        sc.nextLine();
        
        System.out.println("opsi : ");
        int opsi = input.nextInt();
        System.out.println("Waktu : ");
        input.nextInt();
        System.out.println("jumlah yang dibayarkan : ");
        int uang = input.nextInt();
        
        if (opsi >= 2) {
            System.out.println(keretaA);
            if (uang < 1000) {
                System.out.println("uang anda kurang");
            }
            else if (uang == 1000) {
                System.out.println("uang anda pas");
            }
            else if (uang > 1000) {
                System.out.println("uang anda kelebihan");
            }
        }
        else if (opsi <2) {
            System.out.println(keretaB);
        }
        if (uang < 2000) {
            System.out.println("uang anda kurang");
        }
        else if (uang == 2000) {
            System.out.println("uang anda pas");
        }
        else if (uang > 2000) {
            System.out.println("uang anda kelebihan");
        }
    }
    
}
