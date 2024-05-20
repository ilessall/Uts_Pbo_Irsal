package com.mycompany.uts_pbo_irsal;

import java.util.Scanner;

public class uTS {
    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXX");
        System.out.println("UTS 20 mei 2024 oleh Irsal Fauzan Alfarizi NIM 23201268");
        System.out.println("XXXXXXXXXXXXXXXXXXX");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Masukan Nama Anda: ");
        String nama = myScanner.nextLine();

        System.out.println("Apakah Anda seorang:\n1. Laki-laki\n2. Perempuan");
        int pilihanJenisKelamin = myScanner.nextInt();

        // Membersihkan buffer
        myScanner.nextLine();

        String jenisKelamin;
        String panggilan;
        if (pilihanJenisKelamin == 1) {
            jenisKelamin = "Laki-laki";
            panggilan = "Mas:";
        } else if (pilihanJenisKelamin == 2) {
            jenisKelamin = "Perempuan";
            panggilan = "Mba: ";
        } else {
            jenisKelamin = "Tidak Valid";
            panggilan = "";
        }

        System.out.println("Selamat Datang " + panggilan + " " + nama + "\nJenis Kelamin Anda: " + jenisKelamin);
        System.out.println("Kalkulator");

        char lanjut = 'y';
        do {
            System.out.println("Masukkan bilangan 1: ");
            double bilangan1 = myScanner.nextDouble();

            System.out.println("Masukkan bilangan 2: ");
            double bilangan2 = myScanner.nextDouble();

           
            myScanner.nextLine();

            char operator;
            boolean operatorValid;
            do {
                System.out.println("Pilih Operator (+,-,*,/): ");
                operator = myScanner.next().charAt(0);

              
                operatorValid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
                if (!operatorValid) {
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                }
            } while (!operatorValid);

            double hasil = 0;

            if (operator == '+') {
                hasil = bilangan1 + bilangan2;
            } else if (operator == '-') {
                hasil = bilangan1 - bilangan2;
            } else if (operator == '*') {
                hasil = bilangan1 * bilangan2;
            } else if (operator == '/') {
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Tidak dapat membagi dengan nol.");
                    continue;
                }
            }

            System.out.println("Hasil perhitungan: " + bilangan1 + " " + operator + " " + bilangan2 + " = " + hasil);

            System.out.println("Lanjut Perhitungan (y/n)? ");
            lanjut = myScanner.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("Thank you for using the calculator. Goodbye!");

    }
}
