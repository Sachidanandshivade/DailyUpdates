package Dsa;

import java.util.*;

public class NextGreaterNumber {

    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for( int num:nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1 size");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(nums1,nums2);
        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
