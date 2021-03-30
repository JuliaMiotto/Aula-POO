import java.util.Scanner;
class Exercicio09 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        double x;
        double y;

        do {
            System.out.println("Forneça o x [-32, 32]:");
            x = scn.nextDouble();
        } while(x < -32 || x > 32);
        do {
            System.out.println("Forneça o y [−32, 32]:");
            y = scn.nextDouble();
        } while(y < -32 || y > 32);

        double f = -200 * Math.pow(2.71, -0.2 * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) ;

        System.out.println("Função = "+f);
        scn.close();
    }
}
