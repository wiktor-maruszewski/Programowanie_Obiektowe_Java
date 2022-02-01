package E01_162690.Z1;

import java.time.LocalTime;

public class ArrayUtil{
    static public <T extends Comparable<T>> boolean jestPalindromem(T[] a){
        int j = a.length - 1;
        for(int i = 0; i < a.length; i++){
            if(a[i].compareTo(a[j]) != 0){
                return false;
            }
            j--;
        }
        return true;

    }

    public static void main(String[] args){
        Integer[] A = new Integer[4];
        Integer[] B = new Integer[4];
        A[0] = 1;
        A[1] = 2;
        A[2] = 2;
        A[3] = 1;

        B[0] = 2;
        B[1] = 3;
        B[2] = 1;
        B[3] = 4;

        System.out.println(ArrayUtil.jestPalindromem(A));
        System.out.println(ArrayUtil.jestPalindromem(B));

        LocalTime[] C = new LocalTime[4];
        LocalTime[] D = new LocalTime[4];

        C[0] = LocalTime.of(10,20,30);
        C[1] = LocalTime.of(12,15,25);
        C[2] = LocalTime.of(12,15,25);
        C[3] = LocalTime.of(10,20,30);

        D[0] = LocalTime.of(12,22,17);
        D[1] = LocalTime.of(17,51,15);
        D[2] = LocalTime.of(11,29,12);
        D[3] = LocalTime.of(19,33,15);

        System.out.println(ArrayUtil.jestPalindromem(C));
        System.out.println(ArrayUtil.jestPalindromem(D));
    }
}