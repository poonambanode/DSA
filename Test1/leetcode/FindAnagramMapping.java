package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {

//    Given two lists A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
//We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
//These lists A and B may contain duplicates. If there are multiple answers, output any of them.

    //Input:  A = [12, 28, 46, 32, 50] and B = [50, 12, 32, 46, 28]
    //Output: [1, 4, 3, 2, 0]


    public static int[] AnagramMapping(int[] A, int[] B) {
        int [] output = new int[A.length];

//        for(int i=0; i < A.length ; i++) {
//            for(int j=0; j < B.length; j++) {
//                if(A[i] == B[j]) {
//                    output[i] = j;
//                }
//            }
//        }


        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<B.length; i++) {
            map.put(B[i],i);
        }

        for (int j=0; j < A.length; j++) {
            output[j] = map.get(A[j]);
        }

        return output;

    }


    public static void main(String args[]) {

        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        int[] output = AnagramMapping(A,B);
        for (int o : output) {
            System.out.println("OutPut: " + o);
        }

    }
}
