class Result{
  // Return true if the str2 is a subsequence of str1, else return false
  static boolean strSubsequence(String str1, String str2) {
    // Write your code here
      int n=str1.length(),m=str2.length();
      int j=0;
      for(int i=0;i<n&&j<m;i++)
      {
          if(str1.charAt(i)==str2.charAt(j))
          {
              j++;
          }
      }
    return j==m;
  }
}
