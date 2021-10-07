/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ASUS
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operasi A = new Operasi();
        System.out.println("Total Penjumlahan A: " + A.jumlahkan(3, 4));
        System.out.println("Total Penjumlahan B: " + A.jumlahkan(4, 7, -9));
        System.out.println("Total Penjumlahan C: " + A.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println("Total Perkalian A: " + A.perkalian(3, 4));
        System.out.println("Total Perkalian B: " + A.perkalian(4, 7, -9));
        System.out.println("Total Perkalian C: " + A.perkalian(3.4, -0.002, 0.12313));
    }
    
}
