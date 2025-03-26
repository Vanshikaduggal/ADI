class Result {
  // Return the updated string
  static String getDesiredString(String str) {
    // Write your code here
      StringBuilder result = new StringBuilder();
      
      for(int i=0;i<str.length();i++)
      {
          if(i==0 || str.charAt(i)!=str.charAt(i-1))
          {
              result.append(str.charAt(i));
          }
      }
    return result.toString();
  }
}
