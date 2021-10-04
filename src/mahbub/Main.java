package mahbub;

public class Main {

    public static void main(String[] args) {

        Student S1= new Student();
        S1.name= "Mahbub Alam";
        S1.id= 101;
        System.out.println("Name: "+S1.name + "\nId No: "+S1.id);
        S1.display();

        Student S2= new Student();
        S2.name= "Ahmed Arafat";
        S2.id= 102;
        System.out.println("Name: "+S2.name + "\nId No: "+S2.id);
        S2.display();
    }
}
/**
 Name   : Md. Mahbub Alam
 Id N0  : 2012020127
 Section: C
 Email  : cse_2012020127@lus.ac.bd
 Date   : 08-8-2021
 */