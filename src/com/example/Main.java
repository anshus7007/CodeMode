package com.example;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
class Main
{
        public static void main (String args[])
        {
            A threadA  = new A();
            B threadB  = new B();
            C threadC  = new C();

            System.out.println("Start thread A");
            threadA.start();

            System.out.println("Start thread B");
            threadB.start();

            System.out.println("Start thread C");
            threadC.start();
        }


}