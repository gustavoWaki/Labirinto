import java.io.*;

public class Leitor {

    private String arq;
    private int linhas;  // Linhas escritas no arquivo texto
    private int colunas; // Colunas escritas no arquivo texto

    BufferedReader in = null;
    public Leitor(String caminho) throws Exception {
        in = new BufferedReader(new FileReader("e:\\arqsTXT\\"+ caminho));
        linhas = Integer.parseInt(in.readLine());
        colunas = Integer.parseInt(in.readLine());
    }

    public String ler() throws Exception {
        int linhasQnt = 0; // Quantidade de linhas que há realmente no arquivo texto

        String str;
        while((str = in.readLine()) != null) {

            if(str.length() > colunas)
                throw new Exception("[ERRO] Quantidade a MAIS de COLUNAS");
            else if(str.length() < colunas)
                throw new Exception("[ERRO] Quantidade a MENOS de COLUNAS");

            arq += str;
            linhasQnt++;
        }

        if(linhasQnt > linhas)
            throw new Exception("[ERRO] Quantidade a MAIS de LINHAS");
        else if(linhasQnt < linhas)
            throw new Exception("[ERRO] Quantidade a MENOS de LINHAS");

        return arq;
    }

    public String lerLinha() throws IOException {
        return in.readLine();
    }

    public void close() throws IOException {
        in.close();
    }

    // getters
    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
}
