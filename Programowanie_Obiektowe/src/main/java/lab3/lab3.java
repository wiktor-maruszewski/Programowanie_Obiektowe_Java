package lab3;

import java.lang.Character;

public class lab3 {

    public static int countChar(String str, char c){
        int ile = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                ile++;
            }
        }
        return ile;
    }

    public static int countSubStr(String str, String subStr){
        int i = 0;
        int ile = 0;
        while(str.indexOf(subStr, i) != -1){
            i = str.indexOf(subStr,i) + subStr.length();
            ile++;
        }
        return ile;
    }

    public static String middle(String str){
        if(str.length() % 2 == 1){
            return String.valueOf(str.charAt((str.length() - 1) / 2));
        }
        else{
            return String.valueOf(str.charAt((str.length() / 2) - 1)) + String.valueOf(str.charAt((str.length() / 2)));
        }
    }

    public static String repeat(String str, int n){
        String temp = "";
        for(int i = 0; i < n; i++){
            temp += str;
        }
        return temp;
    }

    public static int[] where(String str, String subStr){
        int i = 0;
        int j = 0;
        int[] array = new int[countSubStr(str, subStr)];
        while(str.indexOf(subStr, i) != -1){
            array[j] = str.indexOf(subStr,i);
            i = str.indexOf(subStr,i) + subStr.length();
            j++;
        }
        return array;
    }
    
    public static String change(String str){
        StringBuffer s = new StringBuffer();
        
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                s.append(Character.toLowerCase(str.charAt(i)));
            }
            
            if(Character.isLowerCase(str.charAt(i))){
                s.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        
        return s.toString();
    }

    public static void main(String[] args) {

        String s1 = "qwijfcjkeckec";
        System.out.println(countChar(s1,'k'));

        String s2 = "abcqwertyabcqwertyabcqwertyqwerty";
        String s3 = "qwerty";
        System.out.println(countSubStr(s2, s3));

        System.out.println(middle(s3));
        System.out.println(repeat("ho", 3));
        
        String s4 = "AbCdEfghIJK";
        System.out.println(change(s4));
        
    }

}