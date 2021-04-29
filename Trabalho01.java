import java.util.Scanner;

public class Trabalho01 {
    public static int graus = 0;
    public static int linhas = 0;
    public static int colunas = 0;
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas da matriz: ");
        linhas = scn.nextInt();
        colunas = scn.nextInt();

        int[][] matriz = new int[linhas][colunas];
//altura = linhas , largura = colunas
        for (int l = 0; l < linhas; l++) {
            System.out.print("Informe os elementos da linha " + (l + 1) + " da matriz: ");
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = scn.nextInt();
            }
        }
        System.out.println("__Matriz__\n");
        imprimeMatriz(matriz);

        Scanner src = new Scanner(System.in);
        System.out.print("\nDigite quantos graus deseja rotacionar (0, 90, 180, 270 ou 360): ");
        graus = src.nextInt();

        if (graus == 90) {
            int[][] matrizRot= rotacionar90(matriz);
            imprimeMatriz(matrizRot);

        } else if (graus == 180) {
            int[][] matrizRot = rotacionar90(matriz);
            matrizRot = rotacionar90(matrizRot);
            imprimeMatriz(matrizRot);

        } else if (graus == 270) {
            int[][] matrizRot= rotacionar90(matriz);
            matrizRot = rotacionar90(matrizRot);
            matrizRot = rotacionar90(matrizRot);
            imprimeMatriz(matrizRot);

        }  else if (graus == 0 || graus == 360) {
            imprimeMatriz(matriz);

        } else {
            System.out.println("Número inválido.");
        }
    }
    public static int[][] rotacionar90(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
        }
        return ret;
    }
    public static void imprimeMatriz(int[][] matriz){
        for (int x = 0; x < linhas; x++) {
            for (int y = 0; y < colunas; y++) {
                System.out.print(matriz[x][y]+ "\t");
            }
            System.out.println();
        }
    }
}
