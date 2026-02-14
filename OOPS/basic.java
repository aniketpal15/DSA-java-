

public class basic {
    public static void main(String args[]){
    pen p1 =new pen();
    p1.setcolor("blue");
    p1.settip(5);
    System.out.println("color= "+p1.color+" Tip = "+p1.tip);

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

    String getcolor(){         //getter
        return this.color;
    } 

    int gettip(){         //getter
        return this.tip;
    } 

    
}