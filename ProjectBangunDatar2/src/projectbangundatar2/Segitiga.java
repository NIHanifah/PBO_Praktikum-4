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
public class Segitiga {
    int LuasSegitiga(int alas, int tinggi){
        return (alas*tinggi)/2;
    }
    double LuasSegitiga(int alas, double tinggi){
        return (alas*tinggi)/2;
    }
    double LuasSegitiga(double alas, int tinggi){
        return (alas*tinggi)/2;
    }
    double LuasSegitiga(double alas, double tinggi){
        return (alas*tinggi)/2;
    }
    //Sisi miring segitga
    double MiringSegitiga(double alas, double tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    double MiringSegitiga(int alas, double tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    double MiringSegitiga(double alas, int tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    double MiringSegitiga(int alas, int tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    
    //Keliling segitiga
    double KelilingSegitia(int alas, int tinggi){
        double KelilingSegitiga = alas + tinggi + MiringSegitiga(alas, tinggi);
        return KelilingSegitiga;
    }
    double KelilingSegitiga(int alas, double tinggi){
        double KelilingSegitiga = alas + tinggi + MiringSegitiga(alas, tinggi);
        return KelilingSegitiga;
    }
    double KelilingSegitiga(double alas, int tinggi){
        double KelilingSegitiga = alas + tinggi + MiringSegitiga(alas, tinggi);
        return KelilingSegitiga;
    }
    double KelilingSegitiga(double alas, double tinggi){
        double KelilingSegitiga = alas + tinggi + MiringSegitiga(alas, tinggi);
        return KelilingSegitiga;
    }
}
