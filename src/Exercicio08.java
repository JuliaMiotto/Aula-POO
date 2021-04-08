import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String palavraSecreta = "*******";
        String palavra = "abacaxi";
        boolean acertou = false;
        int vidas = 3;
        Scanner leitor = new Scanner((System.in));
        while(true){
            System.out.println("Palavra Secreta: "+palavraSecreta);
            System.out.println("Vidasa: "+vidas);
            System.out.println("Informe uma letra: ");
            String letra = leitor.nextLine();
            acertou = palavra.contains(letra);
            if(acertou) {
                System.out.println("Você acertou");
                int indice = palavra.indexOf(letra);
                while(indice >= 0){
                    palavraSecreta = palavraSecreta.substring(0,indice)
                            +letra
                            +palavraSecreta.substring(indice+1);
                    indice = palavra.indexOf(letra,fromIndex: indice+1)
                }
                System.out.println("Palavra Secreta: "+palavraSecreta);
                if(!palavraSecreta.contains("*")){
                    System.out.println("Você ganhou!");
                }

            }else{
                System.out.println("Você errou...");
                vidas--;
                if(vidas == 0){
                    System.out.println("Você perdeu :(");
                    break;
                }

            }
        }
    }
}
