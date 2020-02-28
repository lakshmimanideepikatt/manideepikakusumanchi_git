package com.designprinciple.Calculator;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first operand: ");
        a=sc.nextFloat();
        System.out.print("Enter your operantor: ");
        String op=sc.next();
        System.out.print("Enter first operand: ");
        b=sc.nextFloat();
        if(op.equals("+")) {
        	Addition ad=new Addition(a,b);
        	System.out.println("resul of "+a+op+b+"is "+ad.add());
        }
        else if(op.equals("-")) {
        	Substraction sb=new Substraction(a,b);
        	System.out.println("resul of "+a+op+b+"is "+sb.substract());
        }
        else if(op.equals("*")) {
        	Multiplication mul=new Multiplication(a,b);
        	System.out.println("resul of "+a+op+b+"is "+mul.multiply());
        }
        else if(op.equals("/")) {
        	Division div=new Division(a,b);
        	if(b-0>0.0001)
        	System.out.println("resul of "+a+op+b+"is "+div.divide());
        	else {
        		System.out.println("A number should not be divided by zero");
        	}
        }
        else {
        	System.out.println("Not a correct operator check again... Enter + or - or / or *");
        }
    }
}
