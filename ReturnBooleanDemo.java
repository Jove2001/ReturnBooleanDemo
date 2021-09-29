// Demo code showing how to return a boolean value
// Ian McElwaine, s3863018, RMIT University, Australia
// s3863018@student.rmit.edu.au

import java.util.Scanner;

public class ReturnBooleanDemo
{
   // Method to run the program
   public void run()
   {
      // Execute method maybeIWorked() and create boolean to see if the method was
      // successful
      boolean didIwork = maybeIWorked();

      // Print result to console
      if (didIwork == true)
         System.out.println("\n" + "True - You entered 1" + "\n");
      else if (didIwork == false)
         System.out.println("\n" + "False - You didn't enter 1" + "\n");

      // Start program again
      run();
   }

   // This method returns a boolean value to the calling method
   public boolean maybeIWorked()
   {
      // Initialise boolean as false
      boolean wasISuccessful = false;

      // Create scanner object for user data input
      Scanner scanner = new Scanner(System.in);

      // Prompt the user to enter data
      System.out.println("Enter 1 to return True," +
                         "\n" + "anything else returns False" + "\n");
      System.out.print("Enter a value: ");

      // Get data entry from user
      String userInput = scanner.nextLine();

      // If user entered '1' then make wasISuccessful = true
      if (userInput.contentEquals("1"))
      {
         wasISuccessful = true;
      }

      // If user didn't enter '1' then make wasISuccessful = false
      else if (!userInput.contentEquals("1"))
      {
         wasISuccessful = false;
      }

      // Return the value to the calling method
      return wasISuccessful;
   }

   // Main method
   public static void main(String[] args)
   {
      ReturnBooleanDemo demo = new ReturnBooleanDemo();

      // Heading text
      System.out.println("ReturnBooleanDemo" + "\n");

      // Run the program
      demo.run();
   }
}