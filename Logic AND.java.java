import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter (0-100, even):");
    int val = scanner.nextInt();
    if (0<= val && val <= 100 && val % 2 == 0) {
      System.out.println(val + "is between 0 and 100, and is even");
    }
    System.out.println("processing...");
  }
}