class RachunekLiczbowy{
    private double rocznaStopaProcentowa;
    private double saldo;

    public RachunekLiczbowy(double saldo){
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki(){
        this.saldo = this.saldo + (this.saldo * (1.0 + this.rocznaStopaProcentowa/100.0))/12;
    }

    public void setRocznaStopaProcentowa(int n){
        this.rocznaStopaProcentowa = n;
    }

    public double getSaldo(){
        return this.saldo;
    }
}

class IntegerSet{

    public boolean [] tab;

    IntegerSet(){
        tab = new boolean[101];
        for(int i = 0; i < 101; i++){
            tab[i] = false;
        }
    }

    static public IntegerSet union(IntegerSet A, IntegerSet B){
        IntegerSet temp = new IntegerSet();
        for(int i = 0; i < 101; i++){
            if(A.tab[i] || B.tab[i]){
                temp.tab[i] = true;
            }
        }
        return temp;
    }

    static public IntegerSet intersection(IntegerSet A, IntegerSet B){
        IntegerSet temp = new IntegerSet();
        for(int i = 0; i < 101; i++){
            if(A.tab[i] && B.tab[i]){
                temp.tab[i] = true;
            }
        }
        return temp;
    }

    public void insertElement(int a){
        this.tab[a] = true;
    }

    public void deleteElement(int a){
        this.tab[a] = false;
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i < 101; i++){
            if(this.tab[i] == true){
                temp = temp + " " + i;
            }
        }
        return temp;
    }

    public boolean equals(IntegerSet A){
        for(int i = 0; i < 101; i++){
            if(this.tab[i] != A.tab[i]){
                return false;
            }
        }
        return true;
    }
}


public class lab5 {

    public static void main(String[] args) {

        RachunekLiczbowy saver1 = new RachunekLiczbowy(2000.0);
        RachunekLiczbowy saver2 = new RachunekLiczbowy(3000.0);

        saver1.setRocznaStopaProcentowa(5);
        saver2.setRocznaStopaProcentowa(5);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();

        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());


        IntegerSet test1 = new IntegerSet();

        test1.tab[5] = true;
        test1.tab[10] = true;
        test1.tab[12] = true;
        test1.tab[30] = true;
        test1.tab[35] = true;

        test1.insertElement(50);
        test1.deleteElement(10);

        IntegerSet test2 = new IntegerSet();
        test2.tab[5] = true;
        test2.tab[10] = true;
        test2.tab[12] = true;
        test2.tab[30] = true;
        test2.tab[35] = true;

        System.out.println(test1.toString());
        System.out.println(test2.toString());

        System.out.println(test1.equals(test2));

        test1.insertElement(10);
        test1.deleteElement(50);

        System.out.println(test1.equals(test2));
    }
}