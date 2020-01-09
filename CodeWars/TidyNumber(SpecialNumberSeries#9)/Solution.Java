/*
  This attempt uses best practices learned from:
  Code Complete 2nd Edition by Steve McConnell (CC2E)

  See the comments below for references to the suggestions
*/

public class Solution
{
    public static boolean tidyNumber(int number)
    {
      //Initializing to true allows us to pass back true for single digit numbers
      var isTidyNumber = true;
      
      //Break number up into single digits
      var numberString = String.valueOf(number);
      
      for(int i = 1; i < numberString.length(); i++){
      
        // Using boolean variable we can make our conditionals easier to read, less complex, and imply the purpose of the conditional - CC2E Chapter 12.5 and 32.2
        boolean isPreviousDigitLarger = Character.getNumericValue(numberString.charAt(i)) < Character.getNumericValue(numberString.charAt(i - 1));
        if (isPreviousDigitLarger) {
          isTidyNumber = false;
        }
      }
      
      //Check each consequitive digit is smaller than the previous one
      return isTidyNumber;
    }
}