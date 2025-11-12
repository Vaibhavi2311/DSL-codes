import java.util.Scanner;
public class linear {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter type of search:");
System.out.println("1.linear");
System.out.println("2.binary");
int s=sc.nextInt();
    
    switch(s){
     case 1:
System.out.println("enter size of array:");
int size=sc.nextInt();
int[] customer=new int[size];
System.out.println("customer ids:");

for(int i=0;i<customer.length;i++){
customer[i]=sc.nextInt();
}
System.out.println("enter key to search:");
int key=sc.nextInt();
int ans=linearsearch(customer,key);
if(ans!=key){
    System.out.println("key found at index"+ans);
}
else{
    System.out.println("key not found");
}
    break;
    case 2:
    int[] cus={12,23,34,45,56,67,68};
    System.out.println("enter key to search");
    int Key=sc.nextInt();
    int Ans=binary(cus,Key);
    if(Ans!=Key){
System.out.println("key found at index"+Ans);
    }
    else{
        System.out.println("key not found ");
    }
    }
}
    public static int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
return -1;
    }
    
    public static int binary(int[] arr,int key){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+h/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                l=mid+1;
            } 
            else{
                h=mid-1;
            }
           
              }
          return -1;    
    }
    
}
