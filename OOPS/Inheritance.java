//Inheritance
/* 
Inheritance is when properties & methods of base class are
passed on to a derived class.
*/

public class Inheritance {
    public static void main (String args[]){
        bird parrot = new bird();
        parrot.eat();
        parrot.breath();
        parrot.fly();
        //it work even animal functions but it is a object of animal    single level inheritance.......
        pecock p1 = new pecock();
        p1.eat();
        p1.breath();
        p1.fly();
        p1.walk();
        //it work even animal functions and also bird function but p1 is a object of bird     multilevel level inheritance.......
    }
}

class animal{
    void eat(){
        System.out.println("Eat");
    }
    void breath(){
        System.out.println("Breath");
    }
}
class bird extends animal{            //single level ineritance
     //it extenda the animal properties and functions to bird class
    void fly(){
        System.out.println("Fly");
    
    }
}
class pecock extends bird{          //multilevel inheritance ; animal-->bird--->pecock
    void walk(){
        System.out.println("walk");
    }
}
