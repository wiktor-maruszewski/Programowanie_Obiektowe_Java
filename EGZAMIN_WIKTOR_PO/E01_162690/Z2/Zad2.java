package E01_162690.Z2;

import java.util.*;

public class Zad2 {
    public static <E, T extends Iterable<E>> void printMarginal(T a){
        Iterator<E> it = a.iterator();

        System.out.println("Pierwszy: " + it.next());

        int ile = 0;
        while(it.hasNext()){
            ile++;
            it.next();
        }

        it = a.iterator();
        for(int i = 0; i < ile; i++){
            it.next();
        }

        System.out.println("Ostatni: " + it.next());
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList(4);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        printMarginal(A);

        Stack<String> B = new Stack();
        B.add("a");
        B.add("b");
        B.add("c");
        B.add("d");

        printMarginal(B);

        Vector<String> C = new Vector();

        C.add("q");
        C.add("w");
        C.add("e");
        C.add("r");

        printMarginal(C);

        LinkedList<Integer> D = new LinkedList();
        D.add(1);
        D.add(2);
        D.add(3);
        D.add(4);

        printMarginal(D);

    }
}