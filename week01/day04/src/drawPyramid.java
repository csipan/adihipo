import java.util.Scanner;

public class drawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = scanner.nextInt();
    for(int i = 0; i <= n; i++){
      for(int k = 0; k < n-i; k++){
        System.out.print(" ");
      }
      for(int j = 0; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}