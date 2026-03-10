import java.util.*;
public class PriorityQueueObject {
    public static class student implements Comparable<student>{
        String name;
        int roll;
        student(String name,int roll){
            this.name=name;
            this.roll = roll;
        }
        @Override
        public int compareTo(student s2){
            return this.name.charAt(0)-s2.name.charAt(0);
        }
    }
    public static void main(String args[]){
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("viki", 1));
        pq.add(new student("aniket", 2));
        pq.add(new student("hrishu", 3));
        pq.add(new student("riju", 4));
        pq.add(new student("srija", 5));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name +"->"+ pq.peek().roll); //0(1)
            pq. remove(); //0(logn)
    }
}
}
