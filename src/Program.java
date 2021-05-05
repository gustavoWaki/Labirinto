import java.io.*;

public class Program {

    public static void main(String args[]){
        System.out.println("Digite o nome do arquivo: ");
        String str = Teclado.getUmString();
        Leitor leitor = new Leitor();
        System.out.println(leitor.ler(str));
    }

}
