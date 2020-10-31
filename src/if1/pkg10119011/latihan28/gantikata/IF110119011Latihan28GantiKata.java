/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        String gantiKata;
        String menjadiKata;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Mengganti Nama=====");
        System.out.print("Masukan Kalimat : ");
        kalimat = sc.nextLine();
        System.out.print("Ganti kata : ");
        gantiKata = sc.nextLine();
        System.out.print("Menjadi kata : ");
        menjadiKata = sc.nextLine();
        
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat awal :" + kalimat);
        String kalimatBaru = kalimat.replace(gantiKata, menjadiKata);
        System.out.println("Kalimat baru :" + kalimatBaru);
    }
    
}
