public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  //charseq is basucally substring
  public MyString(CharSequence s){
    for (int i = 0;i<s.length();i++){
      data[i]=s.charAt(i);
    }
  }

  public String toString(){
    String s = "[";
    for (int i = 0;i<data.length;i++){
      s=s+data[i];
      if (i<data.length-1){
        s=s+", ";
      }
    }
    return s+"]";
  }

  public CharSequence subSequence(int start,int end){
    String newSequence = "";
    for (int i=start;i<end;i++){
      newSequence=newSequence+data[i];
    }
    return newSequence;
  }

  public char charAt(int index){
    return data[index];
  }

  public int length(){
    return data.length;
  }

  public boolean compareTo(MyString s){
    if (
    for (int i=0;i<)
    return true;
  }

  public static void main(String[] args){
    System.out.println('a');
  }
}
