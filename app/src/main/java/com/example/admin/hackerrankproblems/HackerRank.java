package com.example.admin.hackerrankproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 8/11/2016.
 */
public class HackerRank {

    public static void main(String... args){

        int[] input = new int[]{3,1,4,5,6,3,2,3,4,4,5,5,5,5,5,5,7};
        System.out.println("Numbers repeated: " + countRepeatedValues(input));

        int[] input2 = new int[]{5,1,2,3,3,6};
        System.out.println("Equilibrium result: " + collectionEquilibrium(input2));

        int[] input3 = new int[]{7,2,3,10,2,4,8,1};
        int[] input4 = new int[]{6,7,9,5,6,3,2};
        System.out.println("Largest range: " + largestRange(input3));
        System.out.println("Largest range: " + largestRange(input4));
    }

    private static int largestRange(int[] array) {
        int result = -1;
        int max = 0;
        for(int a=1; a<array[0]; a++){
            //System.out.println("xa " + array[a]);
            for(int b=a+1; b<=array[0]; b++){
                //System.out.println("xb " + array[b]);
                int diff = array[b] - array[a];
                //System.out.println("diff " + diff);
                if(max < diff)
                    max = diff;
            }
        }
        if (max>0)
            result = max;
        return result;
    }

    private static int countRepeatedValues (int[] numbers){
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> repeated = new HashSet<Integer>();
        for (int num : numbers)
        {
            if(!set.add(num))
            {
                repeated.add(num);
            }
        }
        return repeated.size();
    }

    private static int collectionEquilibrium (int[] elements) {
        int result = 0;
        for(int i=2; i<elements[0]; i++){
            int sumleft=0;
            for(int j=1; j<i; j++){
                sumleft += elements[j];
            }
            int sumright=0;
            for(int j=i+1; j<=elements[0]; j++){
                sumright += elements[j];
            }
            if(sumleft == sumright)
                return 1;
        }
        return result;
    }
}
