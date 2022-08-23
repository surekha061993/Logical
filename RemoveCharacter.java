public class RemoveCharacter {  
    public static void main(String[] args) { 
String s="madam";
 String result="";
      for (int i=0 ;i<s.length();i++) {
          char ch = s.charAt(i);
          if (!result.contains(""+ch)) {
              result=result+ch;
          }
      }
System.out.println(result);

}
     // return result; 
     /* String str="AACCDDRHRPMKMM";
     str=str+" ";
     String duplicate="";

    for(int i=0;i<str.length()-1;i++)
     {
      char ch1=str.charAt(i);
      char ch2=str.charAt(i+1);

    if(ch1 !=ch2)
      { 
       duplicate=duplicate+ch1;
      }
     }
System.out.println(duplicate);
}*/
}