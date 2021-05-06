import java.io.*;

public class Leitor {


    String arq;

    BufferedReader in = null;
    public Leitor(String caminho) throws FileNotFoundException {
        in = new BufferedReader(new FileReader("e:\\arqsTXT\\"+ caminho));
    }


    public String ler() throws IOException {
            String str;
            while((str = in.readLine()) != null) {
                arq += str;
            }
        return arq;
    }

    public String lerLinha() throws IOException {
        return in.readLine();
    }

    public void close() throws IOException {
        in.close();
    }

}
