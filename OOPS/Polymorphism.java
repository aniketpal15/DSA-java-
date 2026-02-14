//Polymorphism
/* 
- Compile Time Polymorphism
   · Method Overloading
- Run Time Polymorphism
   · Method Overriding
*/
/*
# Method Overloading........
     Multiple functions with the same name but different
    parameters

# Method Overriding.........
     Parent and child classes both contain the same function with a
    different definition.
*/

public class Polymorphism {
    public static void main(String args[]){
    pen p1 =new pen();
    //setting tip and color through settip() and setcolor() function......... 
    p1.setcolor("blue");
    p1.settip(5);
    System.out.println("color= "+p1.color+" Tip = "+p1.tip);
    
    //setting tip and color through both() function.........
    //If i pass string in both() then both(string) and if i pass int in both() then both(int) will execute...........
    p1.both("red");
    p1.both(10);
    System.out.println("color= "+p1.color+" Tip = "+p1.tip);
    p1.erase();
    //at last color =red and tip =10 is seted in object p1....
    //here both() is a function of Method Overloading 
    // same name function just inside parameter is diffrent both(string) and both(int)..
    
    pencil pencil1 = new pencil();
    pencil1.both("black");
    pencil1.both(2);
    System.out.println("color= "+pencil1.color+" Tip = "+pencil1.tip);
    pencil1.erase();

    }

}

class pen{
    String color;
    int tip;
    void setcolor(String col){   //setter
        this.color=col;
    }
    void settip(int newtip){    //setter
        this.tip =newtip;
    }
    void both(String color){
        this.color = color;
    }
    void both(int tip){
        this.tip = tip;
    }
    void erase(){
        System.out.println("cannot erase");
    }
    
} 
class pencil extends pen{
    void erase(){
        System.out.println("can erase");    
         //this erase function is also present in parent menas pen function 
         //but always child function is called rather than parent function
         //this is called method overriding.........
    }
}