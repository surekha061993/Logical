public class TargetArray {  
    public static void main(String[] args) {  

int arr[]={1,3,5,7};

int target=5;
int i;
for(i=1;i<=arr.length;i++)
{
System.out.print(" "+i);

}

System.out.println(" "); 
if(target==i)
{
System.out.println("Number is preseNt");  
}
else if(target!=i){
System.out.println("Number is Not preseNt" );  
}
}
}