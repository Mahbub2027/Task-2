package mahbub;
public class Student {

        String name;
        int id;
        static String universityName = "Leading University";

        Student() //Default Constructor
        {
            System.out.println("Student Information: ");
        }

        Student(int id)
        {
            this.id = id;
        }
        Student(String name, int id){
            this.name = name;
            this.id = id;
        }

        void display()
        {
            System.out.println("University name: "+universityName);
        }
}
/**
 Name   : Md. Mahbub Alam
 Id No  : 2012020127
 Section: C
 Email  : cse_2012020127@lus.ac.bd
 Date   : 08-8-2021
 */

