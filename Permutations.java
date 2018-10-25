package com.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Permutations {
    public static void main(String[] args) { // make sure you get counts[] with values corresponding to the nums array values
        int[] nums = {1,2,3};
        int sizeOfNums = nums.length;
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        int[] counts = new int[map.keySet().size()];
        int j = 0;
        for(int i : map.keySet()){
            counts[j++] = map.get(i);
        }
        List<List<Integer>> answer = permutation(nums,counts,inner,outer,sizeOfNums);
        for(List<Integer> ans : answer){
            System.out.println(Arrays.toString(ans.toArray()));
        }
    }

    private static List<List<Integer>> permutation(int[] nums, int[] counts, List<Integer> inner, List<List<Integer>> outer, int sizeOfNums) {
        if(inner.size() == sizeOfNums){
            outer.add(new ArrayList<>(inner));
        }
        for(int i = 0 ; i < nums.length; i++){
            if(counts[i] != 0){
                inner.add(nums[i]);
                counts[i]--;
                permutation(nums,counts,inner,outer,sizeOfNums);
                counts[i]++;
                inner.remove(inner.size()-1);
            }
        }
        return outer;
    }
}
