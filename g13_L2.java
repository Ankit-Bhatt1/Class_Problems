package leetcode;

import java.util.ArrayList;

public class g13_L2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {8,7,1,9,4};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        System.out.println(list);
    }
}
