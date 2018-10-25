package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String str = "ABC";
        List<Character> inner = new ArrayList<>();
        List<List<Character>> outer = new ArrayList<>();
        int index = 0;
        int[] counts = new int[str.length()];
        Arrays.fill(counts,1);
        List<List<Character>> answer = subset(str,counts,inner,outer,index);
        for(List<Character> ans : answer){
            System.out.println(Arrays.toString(ans.toArray()));
        }
    }

    private static List<List<Character>> subset(String str, int[] counts, List<Character> inner, List<List<Character>> outer, int index) {
        outer.add(new ArrayList<>(inner));
//        System.out.println(inner);
        for(int i = index; i < str.length(); i++){
            if(counts[i] != 0){
                inner.add(str.charAt(i));
                counts[i]--;
                subset(str,counts,inner,outer,i);
                counts[i]++;
                inner.remove(inner.size()-1);
            }
        }
        return outer;
    }
}
