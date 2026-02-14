/*Constructors
        Constructor is a special method which is invoked automatically at the
        time of object creation.

- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void)
- Constructors are only called once, at object creation.
- Memory allocation happens when constructor is called.
 */

public class Constructor {
    public static void main (String args[]){
        student s1 = new student();
        student s2 = new student("Aniket Pal");
        student s3 = new student(10);
        //student s4 = new student(s1);
        // if i write this before initialize s1 data then in s4 
        // the data will show 0 not the s1 marks or roll as s4 is created before s1 data putting.
        //setting the remaining variable....name or roll or both.......
        s1.name ="Riju pal";
        s1.roll =81;
        s1.marks = 100;
        s2.roll=80;
        s2.marks = 80;
        s3.name="hrishita biawas";
        s3.marks = 200;
        student s4 = new student(s1);//so after initialise the s1 data then s4 is created so the s1 data will show in s4
        s4.name = "srija biswas";
        //printing the all data............
        System.out.println("the name is = "+s1.name+" ;Roll = "+s1.roll+" ;Marks = "+s1.marks);
        System.out.println("the name is = "+s2.name+" ;Roll = "+s2.roll+" ;Marks = "+s2.marks);
        System.out.println("the name is = "+s3.name+" ;Roll = "+s3.roll+" ;Marks = "+s3.marks);
        System.out.println("the name is = "+s4.name+" ;Roll = "+s4.roll+" ;Marks = "+s4.marks);
    }
}

class student{
    String name;
    int roll;
    int marks;

    student(){         //non paramiterized constructor.............  
        System.out.println("Constructor1 is called.....");
    }

    student(String name){   //paramiterized constructor.............  
         System.out.println("Constructor2 for name is called.....");
        this.name=name;
    }

    student(int roll){       //paramiterized constructor.............  
        System.out.println("Constructor3 for roll is called.....");
        this.roll=roll;
    }
    
    student(student stunew){    //copy constructor.............  
        System.out.println("Constructor3 for roll is called.....");
        this.roll=stunew.roll;
        this.marks=stunew.marks;

    }

   
}