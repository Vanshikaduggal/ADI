class Result {
  static String revWordsOrder(String str) {
    // Write your code here
      if(str==null||str.isEmpty())
      {
          return str;
      }
      
      String[] word=str.split(" ");
      int left=0,right=word.length-1;
      
      while(left<right)
      {
          String temp=word[left];
          word[left]=word[right];
          word[right]=temp;
          left++;
          right--;
      }
      
      return String.join(" ",word);
  }
}
