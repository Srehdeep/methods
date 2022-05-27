package methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first = in.nextInt();
        System.out.println("Enter your Second number: ");
        int second = in.nextInt();
        System.out.println("enter your third: ");
        int third= in.nextInt();
        int largest=largest(first,second,third);
        int smallest=smallest(first,second,third);
        System.out.println("The largest number is: "+largest);
        System.out.println("the smallest number is: "+smallest);


    }



    public static int largest(int first,int second,int third){
        int max= first;
        if(second>max){
            max=second;

        }
        if(third>max){
            max=third;

        }
        return max;


     }
    public static int smallest(int first, int second, int third) {
        int min= first;
        if(second<min){
            min=second;

        }
        if(third<min){
            min=third;
        }
        return min;


    }
    }




