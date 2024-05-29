package javaCodingTasks.week01.serife;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        //Write a method which can identifiers given number is even or odd
        // ex:identify(5) -->"Odd"
        // ex:identify(6) -->"Even"

        isEvenOrOdd(6);
        isEvenOrOdd(5);
    }

        public static void isEvenOrOdd(int num ){
            if(num % 2 == 0){
                System.out.println(num + " Number is even. ");
            }
            else{
                System.out.println(num + " Number is odd. ");
            }
        }
        
        
    }
   
    

