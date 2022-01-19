package lab9;

import java.util.Collections;
import java.util.LinkedList;

public class Lista {

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        for(int i = n - 1; i < pracownicy.size(); i = i + n - 1){
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        int lewy = 0;
        int prawy = lista.size() - 1;
        while(lewy < prawy){
            T temp = lista.get(lewy);
            lista.set(lewy, lista.get(prawy));
            lista.set(prawy, temp);

            lewy++;
            prawy--;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<>();
        LinkedList<Integer> test2 = new LinkedList<>();
        test.add("abc");
        test.add("abcd");
        test.add("abcde");
        test.add("abcdef");
        test.add("abcdefg");
        test.add("abcdefgh");
        test.add("abcdefghi");
        test.add("abcdefghij");
        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(4);
        test2.add(5);
        test2.add(6);
        test2.add(7);
        test2.add(8);
        System.out.println(test);
        System.out.println(test2);
        Lista.<String>redukuj(test, 5);
        Lista.<Integer>redukuj(test2, 5);
        System.out.println(test);
        System.out.println(test2);
        Lista.<String>odwroc(test);
        Lista.<Integer>odwroc(test2);
        System.out.println(test);
        System.out.println(test2);
    }
}
