import java.util.*;

public class hashmapImplementation {
    static class hashmap<k,v>{
        public class node{
            k key;
            v val;
            node(k key,v val){
                this.key = key;
                this.val = val;
            }
        }
        private int size;
        private int N;
        private LinkedList<node> buckets[];
        @SuppressWarnings("unchecked")
        public hashmap(){
            this.N =4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] =new LinkedList<>();
            }

        }
        private int hashfunc(k key){
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }
        private int searchinll(k key,int bi){
            LinkedList<node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                node n = ll.get(i);
                if(n.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<node> oldbuk[] = buckets;
            buckets = new  LinkedList[N*2];
            N =N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]= new LinkedList<>();
            }

            for(int i=0 ;i<oldbuk.length;i++){
                LinkedList<node> ll = oldbuk[i];
                for(int j=0;j<ll.size();i++){
                    node nd = ll.remove();
                    put(nd.key, nd.val);
                }
            }
        }
        public void put(k key, v val){
            int bi = hashfunc(key);
            int di = searchinll(key,bi);
            if(di != -1){
                node n = buckets[bi].get(di);
                n.val = val;
            }else{
                buckets[bi].add(new node(key,val));
                size++;
            }
            double lambda = (double)size/N;
            if(lambda >2.0){
                rehash();
            }

        }
        public Boolean containskey(k key){
            int bi = hashfunc(key);
            int di = searchinll(key,bi);
            if(di != -1){
                return true;
            }else{
                return false;
            }
        }

        public v get(k key){
            int bi = hashfunc(key);
            int di = searchinll(key,bi);
            if(di != -1){
                node n = buckets[bi].get(di);
                return n.val;
            }else{
                return null;
            }
        }

        public v remove(k key){
            int bi = hashfunc(key);
            int di = searchinll(key,bi);
            if(di != -1){
                node n = buckets[bi].remove(di);
                return n.val;
            }else{
                return null;
            }
        }

        public ArrayList<k> keyset(){
            ArrayList<k> keys =  new ArrayList<>();
            for(int i=0; i <buckets.length;i++){
                LinkedList<node> ll = buckets[i];
                for(node nl : ll){
                    keys.add(nl.key);
                }
            }
            return keys;
        }

        public Boolean isempty(){
            return size==0;
        }
    }
    public static void main(String args[]){
        hashmap<String,Integer> hm = new hashmap<>();
        hm.put("Aniket", 100);
        hm.put("Riju", 150);

        ArrayList<String> keys = hm.keyset();
        for(String key:keys){
            System.out.print(key+" ");
        }
    }
}
