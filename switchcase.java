/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ap
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       
       Scanner input1= new Scanner(System.in) ;
   Scanner input2= new Scanner(System.in);
Scanner input3= new Scanner(System.in);
   System.out.println("enter two numbers");
   int num1 = input1.nextInt();
   int num2 = input2.nextInt();
   


      System.out.println("Enter the choices");
      int num3 = input3.nextInt();
   
   
    // Evaluating the expression that will return true or false
    switch (num3) {
      case 1:
        System.out.println("Addition is"+(num1+num2));
        break;
      case 2:
        System.out.println("multiplication is"+(num1*num2));
        break;
      case 3:
        System.out.println("Division is"+(num1/num2));
        break;
      default:
        System.out.println("else block");
        break;
    }
  }
}

   
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
    
