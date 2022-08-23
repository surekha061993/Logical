public class StringEqual{//nb=
public static void main(String args[]){

String a1="Surekha";
String a2="Surekha";

String a3=new String("Surekha");
System.out.println(a1==a2);//true
System.out.println(a1==a3);//false
System.out.println(a1.equals(a2));//true
System.out.println(a1.equals(a3));//true

System.out.println("a3 "+a3);//
System.out.println("a1 "+a1);//
System.out.println("a2 "+a2);//


StringEqual a4=new StringEqual();
StringEqual a5=new StringEqual();

System.out.println(a4==a5);//false
System.out.println(a4.equals(a5));//false


String f1="Surekha";
//String f1="Mahesh";

System.out.println(f1);//o/p-variable f1 is already defined in method main(String[])

String s1="Surekha";
s1="Mahesh";

System.out.println(s1);//o/p-Mahesh
System.out.println('a' == 'a');//true
//System.out.println(a == 'a');//error
//System.out.println(2 == '2');//error
//System.out.println(a === 'a');//error
//System.out.println(2 === '2');//error
System.out.println(10 == 10);//true
}
}

