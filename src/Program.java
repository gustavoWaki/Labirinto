import java.io.*;

public class Program {


    public static void main(String args[]){
        System.out.println("Digite o nome do arquivo: ");
        String str = Teclado.getUmString();
        Leitor leitor = new Leitor();
        String arq = leitor.ler(str).substring(4);

        String[][] labirinto = new String[Integer.parseInt(arq.substring(1,2))][Integer.parseInt(arq.substring(0,1))];

        int k = 0;
        for(int i = 0; i < labirinto[0].length; i++)
        {
            for (int h = 0 ;h < labirinto.length; h++){
            labirinto[h][i] = arq.substring(k + 2, k+3);
            k++;
        }
        }
        System.out.println(labirinto[0][0]);
        System.out.println(labirinto[1][0]);
        System.out.println(labirinto[2][0]);
        System.out.println(labirinto[3][0]);
        System.out.println(labirinto[4][0]);
        System.out.println(labirinto[5][0]);
        System.out.println(labirinto[6][0]);
        System.out.println(labirinto[7][0]);
        System.out.println(labirinto[8][0]);

        System.out.println(labirinto[0][1]);
        System.out.println(labirinto[1][1]);
        System.out.println(labirinto[2][1]);
        System.out.println(labirinto[3][1]);
        System.out.println(labirinto[4][1]);
        System.out.println(labirinto[5][1]);
        System.out.println(labirinto[6][1]);
        System.out.println(labirinto[7][1]);
        System.out.println(labirinto[8][1]);

        System.out.println(labirinto[0][2]);
        System.out.println(labirinto[1][2]);
        System.out.println(labirinto[2][2]);
        System.out.println(labirinto[3][2]);
        System.out.println(labirinto[4][2]);
        System.out.println(labirinto[5][2]);
        System.out.println(labirinto[6][2]);
        System.out.println(labirinto[7][2]);
        System.out.println(labirinto[8][2]);

        System.out.println(labirinto[0][3]);
        System.out.println(labirinto[1][3]);
        System.out.println(labirinto[2][3]);
        System.out.println(labirinto[3][3]);
        System.out.println(labirinto[4][3]);
        System.out.println(labirinto[5][3]);
        System.out.println(labirinto[6][3]);
        System.out.println(labirinto[7][3]);
        System.out.println(labirinto[8][3]);

        System.out.println(labirinto[0][4]);
        System.out.println(labirinto[1][4]);
        System.out.println(labirinto[2][4]);
        System.out.println(labirinto[3][4]);
        System.out.println(labirinto[4][4]);
        System.out.println(labirinto[5][4]);
        System.out.println(labirinto[6][4]);
        System.out.println(labirinto[7][4]);
        System.out.println(labirinto[8][4]);
    }
}