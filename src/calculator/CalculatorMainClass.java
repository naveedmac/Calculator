package calculator;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NaveedRaza
 */
public class CalculatorMainClass {
float a=0.0f, b=0.0f; 
    
public float div(float variable1, float variable2){
    return (variable1 / variable2);
}
public float mul(float variable1, float variable2){
    return (variable1 * variable2);
}
public float add(float variable1, float variable2){
    return (variable1 + variable2);
}
public float sub(float variable1, float variable2){
    return (variable1 - variable2);
}
public float Input()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Input Value for Variable:");return(input.nextFloat());
    
    }
    public void Display()
    {
        System.out.println("Here is your output");
        System.out.println("Addition          :"+ add(Input(),Input()));
        System.out.println("Substraction      :"+ sub(Input(),Input()));
        System.out.println("Division          :"+ div(Input(),Input()));
        System.out.println("Multiplication    :"+ mul(Input(),Input()));
    }
    
    
}
