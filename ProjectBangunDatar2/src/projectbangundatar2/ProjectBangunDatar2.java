/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang A = new PersegiPanjang();
        Persegi B = new Persegi();
        Lingkaran C = new Lingkaran();
        Segitiga D = new Segitiga();
        System.out.println("Luas Persegi Panjang A : " + A.LuasPersegiPanjang(10, 5));
        System.out.println("Luas Persegi Panjang B : " + A.LuasPersegiPanjang(3.6, 8));
        System.out.println("Luas Persegi Panjang C : " + A.LuasPersegiPanjang(6, 8.3));
        System.out.println("Luas Persegi Panjang D : " + A.LuasPersegiPanjang(5.6, 8.8));
        System.out.println("Keliling Persegi Panjang A : " + A.KelilingPersegiPanjang(10, 5));
        System.out.println("Keliling Persegi Panjang B : " + A.KelilingPersegiPanjang(3.6, 8));
        System.out.println("Keliling Persegi Panjang C : " + A.KelilingPersegiPanjang(6, 8.3));
        System.out.println("Keliling Persegi Panjang D : " + A.KelilingPersegiPanjang(5.6, 8.8));
        System.out.println("Luas Persegi A : " + B.LuasPersegi(4.5));
        System.out.println("Luas Persegi B : " + B.LuasPersegi(7));
        System.out.println("Keliling Persegi A : " + B.KelilingPersegi(4.5));
        System.out.println("Keliling Persegi B : " + B.KelilingPersegi(7));
        System.out.println("Luas Lingkaran A : " + C.LuasLingkaran(5));
        System.out.println("Luas Lingkaran B : " + C.LuasLingkaran(7.4));
        System.out.println("Keliling Lingkaran A : " + C.KelilingLingkaran(5));
        System.out.println("Keliling Lingkaran B : " + C.KelilingLingkaran(7.4));
        System.out.println("Luas segitiga A : " + D.LuasSegitiga(8, 10));
        System.out.println("Luas segitiga B : " + D.LuasSegitiga(8, 11.5));
        System.out.println("Luas segitiga C : " + D.LuasSegitiga(12.2, 9));
        System.out.println("Luas segitiga D : " + D.LuasSegitiga(13.9, 20.7));
        System.out.println("Luas segitiga A : " + D.KelilingSegitiga(8.0, 10.0));
        System.out.println("Luas segitiga B : " + D.KelilingSegitiga(8, 11.5));
        System.out.println("Luas segitiga C : " + D.KelilingSegitiga(12.2, 9));
        System.out.println("Luas segitiga D : " + D.KelilingSegitiga(13.9, 20.7));
        
    }
    
}
