package com.example.CodeChef.cp2020.july_cook_off;

import java.util.*;

public class EVENTUAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            HashMap<Character,Integer> map= new HashMap<>();
            for(int i=0;i<n;i++) {
                char ch =s.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch,map.get(ch)+1);
                }
                else
                {
                    map.put(ch,1);
                }
            }
            Set<Map.Entry<Character,Integer>> set= map.entrySet();
            int flag=0;
            for(Map.Entry<Character,Integer> i:set)
            {
                if(i.getValue()%2==0)
                    continue;
                else
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
