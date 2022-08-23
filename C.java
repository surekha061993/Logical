interface A{
   public static void add(){
   System.out.println("static m1");
}

 public default void minus(){
   System.out.println("static m1");
}
}
interface B{
   public static void add(){
   System.out.println("static m1");
}
 public default void minus(){
   System.out.println("static m1");
}
}
public class C implements A,B{

}