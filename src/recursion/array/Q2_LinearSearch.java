package recursion.array;

import java.util.ArrayList;

public class Q2_LinearSearch {
    static boolean linear(int[] arr, int idx, int target){
        if(idx==arr.length){
            return false;
        }
        return arr[idx] == target || linear(arr,++idx,target);
    }
    static int linearIdx(int[] arr, int idx, int target){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }else {
            return linearIdx(arr, ++idx, target);
        }
    }
    static int linearIdxLast(int[] arr, int idx, int target){
        if(idx==-1){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }else {
            return linearIdx(arr, --idx, target);
        }
    }

    static ArrayList<Integer> al=new ArrayList<>();
    static void findAllIndex(int[] arr, int idx, int target){
        if(idx==arr.length){
            return;
        }
        if(arr[idx] == target){
            al.add(idx);
        }
        findAllIndex(arr, ++idx, target);
    }

    static ArrayList<Integer> findAllIndexAl(int[] arr, int idx, int target, ArrayList<Integer> al){
        if(idx==arr.length){
            return al;
        }
        if(arr[idx] == target){
            al.add(idx);
        }
        return findAllIndexAl(arr, ++idx, target, al);
    }

    static ArrayList<Integer> findAllIndexAl2(int[] arr, int idx, int target){
        ArrayList<Integer> al=new ArrayList<>();
        if(idx==arr.length){
            return al;
        }
        if(arr[idx] == target){
            al.add(idx);
        }
        ArrayList<Integer> ansfromBelow = findAllIndexAl2(arr, ++idx, target);
        al.addAll(ansfromBelow);

        return al;
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,18,18,9};
        int target=18;
        System.out.println(linear(arr,0, target));
        System.out.println(linearIdx(arr,0, target));
        System.out.println(linearIdxLast(arr,arr.length-1, target));

        findAllIndex(arr,0,target);
        System.out.println(al.toString());

        System.out.println(findAllIndexAl(arr,0,target, new ArrayList<>()));
        System.out.println(findAllIndexAl2(arr,0,target));
    }
}
