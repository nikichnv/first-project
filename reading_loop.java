public class Praktikum {
  public static void main(String[] args) {
        int freeHours = 4;
        checkReading(freeHours);
  }

  public static void checkReading(int freeHours) {
    if (freeHours >= 2) {
        for (int i = 1; i < 4; i = i + 1) {
          System.out.println("anatoli read" + i + "first capter");
        }
    } else {
        System.out.println("today dont read");
    }
  }

}
