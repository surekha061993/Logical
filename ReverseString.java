public class ReverseString {  
    public static void main(String[] args) {

String str = "Hi Surekha ";
String  str1="";

System.out.println("Original String: "+str);
char ch[]=str.toCharArray();

for(int i=ch.length-1;i>=0;i--)
{
str1=str1+ch[i];
}  
System.out.println("Reverse String: "+str1);
}
}