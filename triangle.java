import java.util.Scanner;
public class triangle{
   public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the  of the triangle");
          System.out.println("Enter the height of the triangle");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int area=(a*b)/2;
          System.out.print(area);
      }
  } 