import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final float PREMIUM_TICKET_PRICE = 65.50f;
    final float REGULAR_TICKET_PRICE = 25.99f;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter premium ticket count($"+PREMIUM_TICKET_PRICE+"):");
    int premiumCount = scanner.nextInt();
    System.out.println("Please enter regular ticket count($"+REGULAR_TICKET_PRICE+"):");
    int regularCount = scanner.nextInt();
    float premiumTotal = premiumCount * PREMIUM_TICKET_PRICE;
    float regularTotal = regularCount * REGULAR_TICKET_PRICE;
    float total = premiumTotal + regularTotal;
    System.out.println(total);
    scanner.close();
  }
}

  