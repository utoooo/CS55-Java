import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    boolean b = r.nextBoolean();
    int val = r.nextInt();
    float f = r.nextFloat();

    int dice = r.nextInt(6);//0-5
    dice = dice + 1; //0-6
    int dice2 = 1 + r.nextInt(6); //1-6
    int specialDice = r.nextInt(6) + 100; //25 values starting at 100
    int value = 15 + r.nextInt(5);
    System.out.println(b);
    System.out.println(val);
    System.out.println(f);
    System.out.println(dice);
    System.out.println(dice2);
    System.out.println(specialDice);
    System.out.println(value);
  }
}