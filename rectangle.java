import java.util.Scanner;
public class rectangle{
   public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the length of the rectangle");
          System.out.println("Enter the breadth of the rectangle");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int area=a*b;
          System.out.print(area);
      }
  } 