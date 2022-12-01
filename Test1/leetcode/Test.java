package leetcode;

import java.util.*;

public class Test {
    public static void main(String args []) {
        //int [] nums = {1,2,3,1,1,3};
        //numIdenticalPairs(nums);
        String[] image = {"d","b","c","b","c","a"};
        //kthDistinct(image,2);
        int[] t = {1,3};
        //buildArray(t,3);

        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        nextGreaterElement(num1, num2);
    }

    public static int[] nextGreaterElement(int[] num1, int[] num2) {

        int[] res = new int[num1.length];

        Stack<Integer> stack = new Stack();

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : num2){
            while (!stack.empty() && num > stack.peek()){
                map.put(stack.pop(), num);
            }
            stack.add(num);
        }

        for(int i =0; i < num1.length ; i++) {
            if(map.containsKey(num1[i])){
                res[i] = map.get(num1[i]);
            }else{
                res[i] = -1;
            }
        }

        return res;
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> stackList = new ArrayList<>();

        List<Integer> target_new = new ArrayList(Arrays.asList(target));

        List<Integer> listArray =  new ArrayList<>();

        int[] list = new int[n];
        for(int i=0 ; i < 3;i++) {
            list[i] = i + 1;
        }


        for(int l=0; l < list.length;l++) {
            if(target_new.contains(list[l])){
                stackList.add("Push");
                listArray.add(list[l]);
            }else{
                System.out.println("listArray" + listArray);
                listArray.add(l,list[l]);
                listArray.remove(l);
                stackList.add("Push");
                stackList.add("Pop");
            }
        }

        System.out.println(stackList + "--" + listArray + "--" + target_new );

        return stackList;

    }

    public static String kthDistinct(String[] arr, int k) {

        Map<String,Integer> map = new HashMap<>();

        for (int i=0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], 1 + map.get(arr[i]));
            } else {
                map.put(arr[i], 1);
            }
        }
        int i =0;

        for(String str:arr) {
            if(map.get(str) == 1 && ++i == k){
                return str;
            }
        }

        return "";
    }

    public static int numIdenticalPairs(int[] nums) {
        int [] count = new int[101];
        int result = 0;
        for(int i=0;i<nums.length;i++) {
            count[nums[i]]++;
        }

        for (int i =0 ; i < count.length ; i ++) {
            System.out.print(count[i] + " ");
        }
        System.out.println("");


        for (int i =0 ; i < count.length ; i ++) {
            if (count[i] == 2) {
                result += 1;
                System.out.println(" => " + result);
            } else if (count[i] > 2) {
                result += (count[i] -1) * (count[i] -2);
                System.out.println(" : " + result);
            }
        }


        return result;


        // 1389 Create Target Array in the Given Order

//        int[] target = new int[nums.length];
//
//        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
//
//        List<Integer> list = new ArrayList<>();
//
//
//        for(int i=0; i<index.length;i++) {
//
//            list.add(nums[i]);
//            map.put(index[i],list);
//
//        }
//
//        for(Map.Entry<Integer,List<Integer>> m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//
//
//
//        return target;

    }

    public static int flipAndInvertImage(int[] gain) {

        System.out.println(gain);
        int n = gain.length;

        List<Integer> altitudes = new ArrayList();

        int a = 0;
        altitudes.add(a);

        for(int i =0; i < n;i++) {
           // if(gain[i] > 0){
                altitudes.add(altitudes.get(altitudes.size() - 1) + gain[i]);
           // } else if(gain[i] < 0) {
              //  altitudes.add(altitudes.get(altitudes.size() - 1) - Math.abs(gain[i]));
          //  }else{
              //  altitudes.add(altitudes.get(altitudes.size() - 1) - 0);
          //  }
        }
        System.out.print("ArrayList: " + altitudes);
        return Collections.max(altitudes);
    }
}

