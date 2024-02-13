import java.util.*;
class student_Grade
{
    public static void main(String args[])
    {
      double total =0; 
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of subjects : ");
      int num = input.nextInt();

      System.out.println();

      for (int i=0; i<num ;i++)
      { 
        System.out.print("Enter the Marks of " + (i+1)+ " subject : "); 
        int marks = input.nextInt();

        total = total + marks ;
      }

      double average_marks =total/num;

      String Grade ;

      if(average_marks>=75)
      {
          Grade ="A";
      }

      else if(average_marks<75 && average_marks>=65)
      {
          Grade ="B";
      }

      else if(average_marks<65 && average_marks>=55)
      {
          Grade ="C";
      }

      else if(average_marks<55 && average_marks>=35)
      {
          Grade ="S";
      }


      else
      {
          Grade ="F";
      }

      System.out.println();

      System.out.println("Total Marks of the subjects        : " + total);
      System.out.println("Average Marks of the subjects      : " + average_marks + " %");
      System.out.println("Corresponding grade to the Student : " + Grade);

    }
}