package InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        for(List<String> key : result){
            System.out.println(key);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> inner = new ArrayList<>();
        List<List<String>> outer = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){
            char[] chars = new char[26];
            for(int j = 0; j < strs[i].length(); j++){
                chars[(strs[i].charAt(j)-'a')]++;
            }
            String val = new String(chars);
            if(map.containsKey(val)){
                map.get(val).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(val,list);
            }

        }
        for(String key : map.keySet()){
            outer.add(map.get(key));
        }
        return outer;
    }
}
