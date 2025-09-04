package com.xworkz.calci;
//Parent / Super/ Base
public class Calculator {

    public  int add(int num1, int num2){

        System.out.println("Addition : ");
        int total = num1 + num2;
        System.out.println(total);

        return total;

    }

    public  int sub(int num1, int num2){

        System.out.println("Subtraction:");
        int min = num1 - num2;
        System.out.println(min);

        return min;
    }

    public  int div(int num1, int num2){

        System.out.println("Division: ");
        int ans = num1 / num2;
        System.out.println(ans);

        return ans;

    }

    public  int multi(int num1, int num2){

        System.out.println("Multilpication: ");
        int mul = num1 * num2;
        System.out.println(mul);

        return mul;

    }


}
