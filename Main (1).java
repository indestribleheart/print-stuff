import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] arr={5,7,3,45,30};
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
      
    }
    System.out.println(sum/arr.length);
  }
}