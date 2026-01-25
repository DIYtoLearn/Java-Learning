package Concepts.OOPS;

class Person{
    String name;
    String emailaddress;

    Person(String nm, String ead)
    {
        name = nm;
        emailaddress = ead;
    }
}

class student extends Person{
    int Rank;
    String Department;

    student(int rn, String dept, String name, String emailaddress)
    {
        super(name, emailaddress);
        Rank = rn;
        Department = dept;
    }

      void Print()
    {
        System.out.println(" Name of Student = "+super.name+"\n Rank = "+Rank);
    }
}


class InheritanceShowcase {
     public static void main(String[] args) {

         student ps = new student(01,"Engineering","DeatHerTZ","ua@gmail.com");
         ps.Print();

         /* Person ps = new student();
         Here if we had created object in the heap memory for the class student with the reference variable type as
         Person it would have resulted in not being able to call the method Print which is unique to class student
         Compiler throws an error, because it cannot guarantee that ps will actually hold a Child object at runtime
         (it could hold a different subclass that doesn't have that method).

           The "Remote Control" Analogy
            Think of the Reference Type (Parent) as a remote control, and the Object (new Child()) as the actual TV.
            You are holding a Parent remote.
            You are pointing it at a Child TV.
            The Parent remote only has buttons defined in the Parent class.
            Even though the Child TV has extra features (methods), your remote doesn't have the buttons to trigger them.

         */
    }
}