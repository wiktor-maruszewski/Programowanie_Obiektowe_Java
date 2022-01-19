package lab8;
import java.util.ArrayList;
import java.util.Collections;

public class zad3 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            lista.add(args[i]);
        }

        Collections.sort(lista);
        System.out.println(lista);

    }
}
