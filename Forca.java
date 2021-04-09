import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        String palavra;
        Boolean ganhou = false;
        int contadorAcertos = 0;
        int vidas = 5;
        int cont;
        String[] letras;

        Scanner leitor = new Scanner((System.in));
        System.out.println("Defina uma palavra: ");
        palavra = leitor.nextLine();
        letras = palavra.split("");
        String[] resposta = new String[palavra.length()];

        for(int i = 0;i < palavra.length();i++) {
            resposta[i] = "*";
        }
        while (vidas > 0 && ganhou == false) {
            cont = 0;
            System.out.println("\n____________________________");
            System.out.println("Palavra Secreta: ");
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(resposta[i]);
            }
            System.out.println("\nVidas: " + vidas);
            System.out.println("Informe uma letra: ");
            String letra = leitor.nextLine();

            for (int i = 0; i < palavra.length(); i++) {
                if (letras[i].equalsIgnoreCase(letra)) {
                    resposta[i] = letra;
                    contadorAcertos++;
                    cont++;
                }
            }

            if (cont > 0) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Errrrrou :(");
                vidas--;
            }

            if (contadorAcertos == palavra.length()) {
                ganhou = true;
            }
        }
        System.out.println("\n____________________________");

        if (ganhou) {
            System.out.println("Palavra: " + palavra);
            System.out.println("Você Ganhou!!! Essa fera ai meu...");
        } else {
            System.out.println("Palavra correta: " + palavra);
            System.out.println("Você perdeu :(");
        }
    }
}
