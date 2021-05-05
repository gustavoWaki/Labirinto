import java.io.*;

public class Leitor {


    String arq;


    public String ler(String caminho){
        BufferedReader in = null;

        try{
            in = new BufferedReader(new FileReader("e:\\arqsTXT\\"+ caminho));
            String str;
            while((str = in.readLine()) != null) {
                arq += str;
            }
            in.close();
        }
        catch(IOException e) {}

        return arq;
    }

}
