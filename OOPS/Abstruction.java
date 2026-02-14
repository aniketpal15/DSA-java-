//Abstraction
/* 
Hiding all the unnecessary details and showing only the
important parts to the user.
- Cannot create create an instance of abstract class
- Can have abstract/non-abstract methods
- Can have constructors
*/
public class Abstruction {
    public static void main(String args[]){
      //animal a1 = new animal();we cannot invoke animal class as it is abstract and
      //  we can nt make object fromm it but can use in diffrent class 
      bird b1 = new bird();
      //a1.eat();   animal and a1 is cannot defied
      //a1.walk();
      b1.eat();
      b1.walk();
     //we can use eat() function from abstruct animal and we have to initialise walk function in bird as walk is abstruct in animal 
    }
}

abstract class animal{
    void eat(){
        System.out.println("can eat");
       }
    abstract void walk();
}
class bird extends animal{
    void walk(){
        System.out.println("cannot walk");
    }
}
