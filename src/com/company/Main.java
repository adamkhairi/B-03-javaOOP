package com.company;

public class Main {

    public static void main(String[] args) {
//     I-
        Dog Rex = new Dog("Rex");
        Rex.bark();
        Rex.eat();

        Dog Max = new Dog("Max");
        Max.bark();
        Max.eat();
        String filePath = "dogSound.mp3";
        Max.playSound(filePath);

//     II-
//        Dog Rex = new Dog("Rex");
//        Rex.bark("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !!");
//        Rex.eat("Je mange de la viande.");
//
//        Dog Max = new Dog("Max");
//        Max.bark("Je ne suis pas du tout en colère. Iwiw !! awaw !!");
//        Max.eat("Je mange du poisson.");

//     III-
//        Account acc1 = new Account("El Alami Hassan", "Safi", 14765.8);
//        System.out.println(acc1.getName() + " habite à (" + acc1.getAddress() + ") - Infos du Solde " + acc1.getBalance() + " DH.");
//
//        Account acc2 = new Account("Karimi Khalid", "Casablanca", 7654.0);
//        System.out.println(acc2.getName() + " habite à (" + acc2.getAddress() + ") - Infos du Solde " + acc2.getBalance() + " DH.");
//        System.out.println("Resultat Interet : " + acc2.calculateInteret(7) + " DH");
//        acc2.withdraw(1000);
//        System.out.println(acc2.getBalance());
//     IV-


    }
}
