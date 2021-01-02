package com.example.CodeChef.cp2020.dec_lunchtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(map.containsKey(ch))
                {
                    map.put(ch,map.get(ch)+1);
                }
                else
                {
                    map.put(ch,1);
                }
            }
            int one=0;int gtttwo=0;int three=0,two=0;
            Set<Map.Entry<Character,Integer>> set= map.entrySet();
            for(Map.Entry<Character,Integer> val:set)
            {
                if(val.getValue()==1)
                    one++;
                else if(val.getValue()>=2)
                {
//                    int res=val.getValue()/3;
//                    int ans=val.getValue()%3;
//                    int res1=ans/2;
//                    int ans1=ans%2;
//                    one=one+ans1;
//                    three=three+res;
//                    two=two+res1;
                    if(val.getValue()%2==1)
                    {
                        gtttwo=gtttwo+val.getValue()/2;
                        one++;
                    }
                    else
                    {
                        gtttwo=gtttwo+val.getValue()/2;

                    }
                }
            }
//            System.out.println(gtttwo);
//            System.out.println(one);
//            if(gtttwo*2==s.length())
//            {
//                System.out.println(s.length()/3);
//                continue;
//            }
//            if(gtttwo%3==0)
//            {
//                System.out.println((gtttwo*2)/3);
//                continue;
//            }
            if(one>=gtttwo)
            System.out.println(gtttwo);
            else {
                System.out.println(one+(2*gtttwo-2*one)/3);
            }

        }
    }
}
