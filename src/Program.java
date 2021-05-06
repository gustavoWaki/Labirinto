import java.io.*;

public class Program {

    public static void main(String args[]) throws IOException {
        System.out.println("Digite o nome do arquivo: ");
        String str = Teclado.getUmString();
        Leitor leitor = new Leitor(str);

        int linhas = Integer.parseInt(leitor.lerLinha());
        int colunas = Integer.parseInt(leitor.lerLinha());

        String arq = leitor.ler();

        Labirinto labirinto = new Labirinto(colunas, linhas, arq);

    }
}