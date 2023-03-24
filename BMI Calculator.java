/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
/**
 *
 * @author Rodayna
 */
public class Lab7 {



public static void main(String[] args) {
BMI();
}
public static void BMI(){
Scanner input=new Scanner (System.in);
System.out.println("Enter YOUR hight");
float hight=input.nextFloat();
System.out.println("Enter YOUR weight");
float weight=input.nextFloat();
float BMI=(weight/(hight*hight)*703);
System.out.println("BMI"+BMI);
if (BMI<18.5){
System.out.println("under weight");
}
else if (BMI>=18.5&&24.9>=BMI){
System.out.println("normal");
}
else if (BMI>=25.0&&29.9>=BMI){
System.out.println("over weight");
}
else if (BMI>=30.0){
System.out.println("obese");
}
} }