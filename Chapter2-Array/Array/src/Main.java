import java.util.*; 
public class Main {
    public static void main(String args[]) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        String[] b={"NA","C","O","NI"};
        int[] c =(int[]) a.clone();
        String[] d =b.clone();
        System.out.println("Change the first element in a from '1'=>'100'");
        a[0]=100;
        print(a);
        print(c);
        System.out.println("Change the first element from 'NA' to 'NACL'");
        b[0]="NACL";
        print(b);
        print(d);
        System.out.println("Working with Arrays Class");
        int[] numbers = {75,23,51,11,993,100,2};
        print(numbers);
        Arrays.sort(numbers);
        print(numbers);
        int k = Arrays.	binarySearch(numbers,993);
        System.out.printf("Arrays.binarySearch(%d) is %d%n",993,k);
        k=Arrays.binarySearch(numbers,10);
        System.out.printf("Arrays.binarySearch(%d) is %d%n",10,-k-1);
        int[] numbers1 = new int[10];
        Arrays.fill(numbers1,55);
        print(numbers1);
        System.out.println("Using linear Search:");
        int[] sorted = {10,2,1,0,54,11,9,35,25,6,100};
        System.out.printf("linearSerch(%d) is %d%n",25,linearSearch(sorted,25));
        print(sorted);
        System.out.println("Sorted Array:");
        print(sortArray(sorted));
        
    }
    public static void print(Object[] o){
        System.out.printf("{%s",o[0]);
        for(int i=1;i<o.length;i++){
            System.out.printf(", %s",o[i]);
        }
        System.out.println("}");
    }
    public static void print(int[] o){
        System.out.printf("{%d",o[0]);
        for(int i=1;i<o.length;i++){
            System.out.printf(", %d",o[i]);
        }
        System.out.println("}");
    }
    public static int linearSearch(int[] a,int number ){
        for(int i=0;i<a.length;i++){
            if(a[i]==number)
                return i;
        }
        return -1;
    }
    public static int[] sortArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int selected = numbers[i];
            int j=i-1;
            while(j>=0 && numbers[j]>selected){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1]=selected;
        }
        return numbers;
    }
}