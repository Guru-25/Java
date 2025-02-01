package kla;

import java.util.*;

public class Count_Letters{
    public static Map<Character,Integer> count(String str){
        String ALPHABET="abcdefghijklmnopqrstuvwxyz";
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:str.toLowerCase().toCharArray()){
            if(ALPHABET.indexOf(c)!=-1){
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
        }
        return freq;
    }
    public static String solve(int n, String[] arr){
        int max=0;
        String highrate= "";
        for(int i=0;i<n;i++){
            if(count(arr[i]).size()>max){
                max=count(arr[i]).size();
                highrate=arr[i];
            }
        }
        return highrate;
        
    }
    public static void main(String[] args){
        int n=5;
        String[] arr=new String[]{"GURU","RAJA","BALA","AKASH","SANTHOSH"};
        Arrays.sort(arr);
        System.out.println(solve(n,arr));
    }
}