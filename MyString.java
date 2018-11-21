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

  public char charAt(int index){
    return Character();//Turn String substring into char
  }
  //THIS IS A STRING LMAOOAOAOAAOOA
  //String substring
  public CharSequence subSequence(int start, int end){
    String s = "";
    for (int i=0;i<end;i++){
      s=s+charAt[i];
    }
    return s;
  }


  public static void main(String[] args){
    System.out.println('a');
  }
}
