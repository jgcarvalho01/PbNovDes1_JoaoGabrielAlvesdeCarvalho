package application;

import model.entities.Adult;
import model.entities.Child;
import model.entities.FerrisWheel;
import model.entities.Gondola;

public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel(); // Creating a new Ferris wheel
        Adult paulo = new Adult("Paulo", 42); // Adult named Paulo
        Adult caio = new Adult("Caio", 42); // Adult named Paulo
        Adult ana = new Adult("Ana", 42); // Adult named Paulo
        Adult braga = new Adult("Braga", 42); // Adult named Paulo
        // Paulo's children
        Child joao = new Child("Joao", 5, paulo); // New child with Paulo as the father
        Child maria = new Child("Maria", 12, paulo); // This is Paulo's daughter
        Child ieda = new Child("Ieda", 15, caio); // This is Paulo's daughter
        Child eva = new Child("Eva", 12, ana); // This is Paulo's daughter
        Child gancia = new Child("Gancia", 12, braga); // This is Paulo's daughter
        // Child without defined father
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);
        Child jose = new Child("Jose", 18);
        Child paula = new Child("Paula", 16);
        Child vitoria = new Child("Vitoria", 16);
        Child geicy = new Child("Geicy", 16);
        Child manel = new Child("Manel", 16);
        Child otavio = new Child("Otavio", 16);
        Child jayder = new Child("Jayder", 16);
        Child abelha = new Child("abelha", 16);
        Child rivolts = new Child("Rivolts", 16);
        Child bernan = new Child("Bernan", 16);
        Child gabs = new Child("Gabs", 16);
        Child juss = new Child("Juss", 16);
        Child slip = new Child("Slip", 16);
        Child knot = new Child("knot", 16);
        Child chad = new Child("Chad", 16);

        Child zyzz = new Child("Zyzz", 16);
        Child smith = new Child("Smith", 16);
        Child kaik = new Child("Kaik", 16);
        Child gass = new Child("Gass", 16);
        Child poli = new Child("Poli", 16);
        Child anna = new Child("anna", 16);
        Child zang = new Child("Zang", 16);
        Child yin = new Child("Yin", 16);
        Child yang = new Child("Yang", 16);
        Child yo = new Child("Yo", 16);
        Child yeah = new Child("Yeah", 16);
        Child test = new Child("Test", 16);
        /*
         * Now comes the fun part. A rule has been created in the park:
         * - Children under 12 years old can only ride accompanied by their father!
         */

        ferrisWheel.board(2, joao, maria); // ERROR: Joao is under 12 and the father is not present
        ferrisWheel.board(1, joao, paulo); // OK: Now the father is present
        ferrisWheel.board(2, maria); // OK: Maria is 12 years old and can ride alone
        ferrisWheel.board(3, pedro); // OK: Pedro rides alone
        ferrisWheel.board(4, jose); // OK: Pedro rides alone
        ferrisWheel.board(5, jayder); // OK: Pedro rides alone
        ferrisWheel.board(6, manel); // OK: Pedro rides alone
        ferrisWheel.board(7, geicy); // OK: Pedro rides alone
        ferrisWheel.board(8, otavio); // OK: Pedro rides alone
        ferrisWheel.board(9, vitoria); // OK: Pedro rides alone
        ferrisWheel.board(10, paula); // OK: Pedro rides alone
        ferrisWheel.board(11, rivolts); // OK: Pedro rides alone
        ferrisWheel.board(12, bernan); // OK: Pedro rides alone
        ferrisWheel.board(13, abelha); // OK: Pedro rides alone
        ferrisWheel.board(14, ieda, caio); // OK: Pedro rides alone
        ferrisWheel.board(15, eva, ana); // OK: Pedro rides alone
        ferrisWheel.board(16, gancia, braga); // ERROR: Henrique is under 12 and we don't know who the father is (should be Silvio, but he didn't assume responsibility!)
        ferrisWheel.board(17, gabs, juss);
        ferrisWheel.board(18, slip, knot);
        ferrisWheel.board(19, maria, pedro);
        ferrisWheel.board(10, chad);
        ferrisWheel.board(2, zyzz);
        ferrisWheel.board(3, gabs);
        ferrisWheel.board(4, kaik);
        ferrisWheel.board(5, gass);
        ferrisWheel.board(6, poli);
        ferrisWheel.board(7, anna);
        ferrisWheel.board(8, zang);
        ferrisWheel.board(9, paulo);
        ferrisWheel.board(11, yang);
        ferrisWheel.board(12, yo);
        ferrisWheel.board(13, yeah);
        ferrisWheel.board(13, test);
        ferrisWheel.status();
    }
}