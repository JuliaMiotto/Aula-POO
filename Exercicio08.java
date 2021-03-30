import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor de x(insira valores ente 0 e 2): ");
        double x = leitor.nextDouble();
        System.out.print("Informe o valor de y(insira valores ente 0 e 2): ");
        double y = leitor.nextDouble();
        System.out.print("Informe o valor de z(insira valores ente 0 e 2): ");
        double z = leitor.nextDouble();

      double result = 4 * (Math.pow((Math.pow(x, 2) + Math.pow(y, 2) - x*y), 0.75) + z)/3;

      System.out.println("O resultado é: " + result);
    }
}
