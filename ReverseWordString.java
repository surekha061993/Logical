public class ReverseWordString {  
    public static void main(String[] args) {  
      String str= "My name is Surekha";
      String rev= "";
      String a[]=str.split(" ");
    for(int i=a.length-1;i>=0;i--)
     {
     System.out.print(a[i]+" ");
     }
  
}
}