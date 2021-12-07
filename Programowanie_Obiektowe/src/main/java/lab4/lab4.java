import java.util.ArrayList;
import java.util.Collections;

public class lab4 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = a;

        temp.addAll(b);

        return temp;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>();

        if(a.size() > b.size()){
            for(int i = 0; i < b.size(); i++){
                temp.add(a.get(i));
                temp.add(b.get(i));
            }
            for(int i = b.size(); i < a.size(); i++){
                temp.add(a.get(i));
            }
        }
        else{
            for(int i = 0; i < a.size(); i++){
                temp.add(a.get(i));
                temp.add(b.get(i));
            }
            for(int i = a.size(); i < b.size(); i++){
                temp.add(b.get(i));
            }
        }

        return temp;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(a);
        temp.addAll(b);

        Collections.sort(temp);
        return temp;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            temp.add(a.get(i));
        }

        return temp;
    }

    public static void reverse(ArrayList<Integer> a){

        int j = a.size() - 1;
        int temp = 0;
        for(int i = 0; i < a.size()/2; i++){
            temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            j--;
        }
    }

    public static void main(String... args) {

        ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(1);
        t1.add(4);
        t1.add(9);
        t1.add(16);


        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(1);
        t2.add(2);
        t2.add(3);
        t2.add(4);
        t2.add(5);

        reverse(t2);

        for(int i = 0; i < t2.size(); i++){
            System.out.println(t2.get(i));
        }
    }
}