package com.example;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.xml.internal.ws.encoding.xml.XMLMessage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
class Random
{
    int seed;int mult;int inc;int mod;
    Random(int seed,int mult,int inc,int mod)
    {
        this.seed=seed;
        this.mult=mult;
        this.inc=inc;
        this.mod=mod;

    }
    int rand()
    {
        seed=((mult*seed+inc)%mod);
        return seed;
    }


}
class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int seed=sc.nextInt();
        int mult=sc.nextInt();
        int inc=sc.nextInt();
        int mod=sc.nextInt();
        Random r=new Random(seed, mult,inc,mod);
        while (n-->0)
        {
            int ans=r.rand();
            System.out.println(ans);
        }

    }
}