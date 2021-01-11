public class PasswordVerifier{

   public static boolean correctLength(String str)
   {
      // passwords need to be at least 6 characters
      if(str.length() >= 6)
         return true;
      else
         return false;  
   }
   
   public static boolean hasUpperCase(String str)
   {
      // password needs to have at least 1 uppercase letter
      boolean hasUpper = false;
      
      // loop through each character in the string and check to see if it is upper case
      for(int i = 0; i < str.length(); i++)
      {
         // if the character is uppercase, change hasUpper status to true
         if(Character.isUpperCase(str.charAt(i)))
         {
            hasUpper = true;
         }
      }
      
      return hasUpper;
   }
   
   public static boolean hasLowerCase(String str)
   {
      // password needs to have at least 1 lowercase letter
      boolean hasLower = false;
      
      // loop through each character in the string and check to see if it is lower case
      for(int i = 0; i < str.length(); i++)
      {
         // if the character is lowercase, change hasLower status to true
         if(Character.isLowerCase(str.charAt(i)))
         {
            hasLower = true;
         }
      }
      return hasLower;
   }
   
   public static boolean hasDigit(String str)
   {
      // password needs to have at least 1 digit
      boolean hasDigit = false;
      
      // loop through each character in the string and check to see if it is a digit
      for(int i = 0; i < str.length(); i++)
      {
         // if the character is a digit, change hasDigit status to true
         if(Character.isDigit(str.charAt(i)))
         {
            hasDigit = true;
         }
      }
      
      return hasDigit;
   }
   
   // test to see if the password is valid
   public static boolean validPassword(String str)
   {
      // a valid password has the following:
         // min length of 6 characters
         // at least 1 uppercase letter
         // at least 1 lowercase letter
         // and at least 1 digit
   
      if(correctLength(str) && hasUpperCase(str) && hasLowerCase(str) && hasDigit(str))
      {
         return true;
      }
      else
      {
         return false;
      } 
   }
}