package com.example.geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class InfixPostFix {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            System.out.println(new solve().infixToPostfix(br.readLine().trim()));
        }
    }
}//

class solve
{ static int Prec(char ch)
{
    switch (ch)
    {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
    }
    return -1;
}

    public static String infixToPostfix(String w) {

        Stack<Character> stack = new Stack<>();
        String s = "";

        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (Character.isAlphabetic(ch))
                s = s + ch;
            else if (ch == '(')
                stack.push(ch);

            else if (ch == ')')
            {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    s += stack.pop();

                stack.pop();
            }
            else // an operator is encountered
                {
                    while (!stack.isEmpty() && Prec(ch) <= Prec(stack.peek())) {

                        s += stack.pop();
                    }
                    stack.push(ch);

                }


            }

            while (!stack.isEmpty()) {
                s = s + stack.pop();
            }
            return s.toString();


    }
}