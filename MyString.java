public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  //charseq is basucally substring
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0;i<s.length();i++){
      data[i]=s.charAt(i);
    }
  }//Puts individual characters into data

  public String toString(){
    String s = "";
    for (int i = 0;i<data.length;i++){
      s=s+data[i];
      }
    return s;
  }//Places items in data into a string

  public String subSequence(int start,int end) throws IndexOutOfBoundsException{
    if (start>end||start<0||end>data.length||end<0){
      throw new IndexOutOfBoundsException("Index Is Out of Bounds");
    }
    String newSequence = "";
    for (int i=start;i<end;i++){
      newSequence=newSequence+data[i];
    }
    return newSequence;
  }//returns string of items from data[start] up to and not including data[end]

  public char charAt(int index) throws IndexOutOfBoundsException{
    if (index<0||index>data.length-1){
      throw new IndexOutOfBoundsException("Index Is Out of Bounds");
    }
    return data[index];
  }//simply returns item at that index in data

  public int length(){
    return data.length;
  }//simply return the length of the data arrays

  public int compareTo(CharSequence s) throws NullPointerException{
    if (s==null){
      throw new NullPointerException("Please Insert Proper CharSequence (Received Null)");
    }
    for (int i=0;i<data.length&&i<s.length();i++){
      if (data[i]!=s.charAt(i)){
        if (data[i]>s.charAt(i)){
          return 1;
        }else if(data[i]<s.charAt(i)) {
          return -1;
        }else if (data[i]==s.charAt(i)){
          return 0;
        }
      }
    }
    if (s.length()<data.length){
      return 1;
    }else if(data.length<s.length()){
      return -1;
    }
    return 0;
  }


}
