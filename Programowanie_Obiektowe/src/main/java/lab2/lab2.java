package lab2;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;


public class lab2 {
    
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        Random generator = new Random();
        
        for(int i = 0; i < n; i++){
            tab[i] = generator.nextInt(Math.abs(minWartosc - maxWartosc + 1)) + minWartosc;
        }
    }
    
    public static void wyswietl(int tab[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }
    
    public static int ileNieparzystych(int tab[]){
        int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 != 0){
                temp = temp + 1;
            }
        }
        return temp;
    }
    
    public static int ileParzystych(int tab[]){
        int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                temp = temp + 1;
            }
        }
        return temp;
    }
    
    public static int ileDodatnich(int tab[]){
        int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                temp = temp + 1;
            }
        }
        return temp;
    }
    
    public static int ileUjemnych(int tab[]){
        int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                temp = temp + 1;
            }
        }
        return temp;
    }
    
    public static int ileZerowych(int tab[]){
        int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                temp = temp + 1;
            }
        }
        return temp;
    }
    
    public static int ileMaksymalnych(int tab[]){
        int max = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        
        int ile = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == max){
                ile = ile + 1;
            }
        }
        return ile;
    }
    
    public static int sumaDodatnich(int tab[]){
       int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                temp = temp + tab[i];
            }
        }
        return temp; 
    }
    
    public static int sumaUjemnych(int tab[]){
       int temp = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                temp = temp + tab[i];
            }
        }
        return temp; 
    }
    
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int max = 0;
        int nastepny = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                nastepny = nastepny + 1;
            }
            else{
                if(nastepny > max){
                    max = nastepny;
                    nastepny = 0;
                }
            }
        }
        
        //jesli wszystkie beda dodatnie
        if(nastepny > max){
            return nastepny;
        }
        
        return max; 
    }
    
    public static void signum(int tab[]){
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                tab[i] = -1;
            }
            else if(tab[i] > 0){
                tab[i] = 1;
            }
        }
        lab2.wyswietl(tab, tab.length);
    }
    
    public static void odwrocFragment(int tab[], int lewy, int prawy){
        if(lewy < 1 || lewy >= tab.length){
            System.out.println("Zly lewy!");
        }
        if(prawy < 1 || lewy >= tab.length){
            System.out.println("Zly prawy!");
        }
        
        int temp = 0;
        while(lewy < prawy){
            temp = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = temp;
            lewy++;
            prawy--;
        }
    }
    
    public static void zad3(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj m: ");
        int m = sc.nextInt();
        
        System.out.print("Podaj n: ");
        int n = sc.nextInt();
        
        System.out.print("Podaj k: ");
        int k = sc.nextInt();
        
        if(m < 1 || m > 10 || n < 1 || n > 10 || k < 1 || k > 10){
            System.out.println("Zle liczby!");
        }
        
        int a[][] = new int[m][n];
        int b[][] = new int[n][k];
        
        Random generator = new Random();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = generator.nextInt(21) - 10;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                b[i][j] = generator.nextInt(21) - 10;
            }
        }
        
        for(int i = 0; i < m; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + ", ");
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < k; j++){
                System.out.print(b[i][j] + ", ");
            }
        }
        
        int c[][] = new int[m][k];
        
        for(int i = 0; i < m; i++){
            
            for(int j = 0; j < k; j++){
                int temp = 0;
                
                for(int l = 0; l < n; l++){
                    
                    temp = temp + a[i][l]*b[l][j];
                }
                c[i][j] = temp;
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < m; i++){
            System.out.println();
            for(int j = 0; j < k; j++){
                System.out.print(c[i][j] + ", ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        lab2.zad3();
        
        
        
        /*
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = sc.nextInt();
        if(n <= 1 || n >= 100){
            System.out.println("Zle n!");
        }
        
        int array[] = new int[n];
        PO.generuj(array, n, -999, 999);
        PO.wyswietl(array, n);
        System.out.println("Nieparzystych: " + PO.ileNieparzystych(array));
        System.out.println("Parzystych: " + PO.ileParzystych(array));
        System.out.println("Dodatnich: " + PO.ileDodatnich(array));
        System.out.println("Ujemnych: " + PO.ileUjemnych(array));
        System.out.println("Zerowych: " + PO.ileZerowych(array));
        System.out.println("Maksymalnych: " + PO.ileMaksymalnych(array));
        System.out.println("Suma dodatnich: " + PO.sumaDodatnich(array));
        System.out.println("Suma ujemnnych: " + PO.sumaUjemnych(array));
        System.out.println("Dl. max. ciagu dod.: " + PO.dlugoscMaksymalnegoCiaguDodatnich(array));
        //PO.signum(array);
        PO.odwrocFragment(array, 1, 5);
        PO.wyswietl(array, n);
        
        */
        
        
    }
    
}