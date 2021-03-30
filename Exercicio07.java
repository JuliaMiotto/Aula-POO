import java.util.Scanner;
class Exercicio07 {
  public static void main(String[] args) {
    var scn = new Scanner(System.in);
    double x = 0.0;
    double y = 0.0;

    do {
        System.out.println("Forneça o x:");
        x = scn.nextDouble();
    } while(x < -15 || x > -5);

    do {
        System.out.println("Forneça o y:");
        y = scn.nextDouble();
    } while(y < -3 || y > 3);
    
    double f = 100 * Math.sqrt(Math.abs(y - 0.01 * Math.pow(x, 2))) + 0.01 * Math.abs(x + 10);

    System.out.println("Função = "+ f);
    scn.close();
  }
}
