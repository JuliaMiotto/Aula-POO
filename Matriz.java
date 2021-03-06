import java.util.Scanner;

class Matriz {
  public static void main(String[] args) {

    int linhas = 0;
    int colunas = 0;

    Scanner scn = new Scanner(System.in);
    System.out.print("Digite o número de linhas e colunas das matrizes: ");
    linhas = scn.nextInt();
    colunas = scn.nextInt();

	int[][] matrizA = new int[linhas][colunas];
	    
	for (int l = 0; l < linhas; l++) {
          System.out.print("Informe os elementos da linha "+ (l+1) +" da matriz A: ");
          for (int c = 0; c < colunas; c++){
            matrizA[l][c]= scn.nextInt();
          }
	}

	    int[][] matrizB = new int[linhas][colunas];
	    
	for (int l = 0; l < linhas; l++) {
          System.out.print("Informe os elementos da linha "+ (l+1) +" da matriz B: ");
          for (int c = 0; c < colunas; c++){
            matrizB[l][c]= scn.nextInt();
          }
	}

      System.out.println("__Matriz A__\n");	    
      for (int l = 0; l < linhas; l++) {  
        for (int c = 0; c < colunas; c++) {
            System.out.print(matrizA[l][c]+"\t");
        }
        System.out.println("\n");
	}

      System.out.println("__Matriz B__\n");
      for (int l = 0; l < linhas; l++) {  
        for (int c = 0; c < colunas; c++) {
            System.out.print(matrizB[l][c]+"\t");
        }
        System.out.println("\n");
	    }

    int resultado = 0;
    
	  System.out.println("__Resultado__\n");
    for (int l = 0; l < linhas; l++) {
      for (int x = 0; x < colunas; x++){
        for (int c = 0; c < colunas; c++){
          resultado += matrizA[l][c] * matrizB[c][x];
        }
        System.out.print(resultado + "\t");
        resultado = 0;
      }
      System.out.println("\n");
    }
  }
}
