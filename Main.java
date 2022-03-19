import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Sum: ");
    float sum = scanner.nextFloat();
    
    System.out.println("Total: ");
    float total = scanner.nextFloat();
  
    float average = sum/total;
    System.out.println(average);
    scanner.close();
  }
}