import java.util.Scanner;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter type of sort:");
        System.out.println("1.selection sort");
        System.out.println("2.bubble sort");
        int sort=sc.nextInt();
        double salary[]={70000.5,34000.5,20000.3,12000.6,56000.8,30000.8,40000.9};
       switch(sort){
        case 1:
        System.out.println(Arrays.toString(selection(salary)));
        break;
        case 2:
        System.out.println(Arrays.toString(bubble(salary)));
       }
System.out.println("top 5 salaries:");
for(int i=salary.length-1;i>=salary.length-5;i--){
    System.out.println(salary[i]);
}
        }
        static double[] selection(double[] arr){
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if (arr[j]<arr[min]){
                        min=j;
                    }
                }
                double temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
            return arr;
        }
        static double[] bubble(double[] arr){
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                int flag=0;
                for(int j=0;j<n-1;j++){
                    if(arr[j]>arr[j+1]){
                        double temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        flag=1;
                    }
                }
                if(flag==0){
                    break;
                }
            }
            return arr;
        }
    }

