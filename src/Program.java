import java.io.*;

public class Program {

    public static void main(String args[]) throws Exception {


        System.out.println("Digite o nome do arquivo: ");
        String str = Teclado.getUmString();
        Leitor leitor = new Leitor(str);
        Pilha caminho = new Pilha<Coordenada>();
        Pilha bifurcacoes = new Pilha<Coordenada>();
        Coordenada pos;

        int linhas = Integer.parseInt(leitor.lerLinha());
        int colunas = Integer.parseInt(leitor.lerLinha());

        String arq = leitor.ler().substring(4);

        Labirinto labirinto = new Labirinto(colunas, linhas, arq);

        String ret = "";
        Coordenada coord = null;

        caminho.guardeUmItem(labirinto.getEntrada())  ;

            boolean acabou = false;
            while(!acabou) {

                Coordenada atual = new Coordenada((Coordenada) caminho.recupereUmItem());

                if (atual.getY() > 0) {
                    Coordenada norte = new Coordenada(atual.getX(), atual.getY() - 1);
                    if (labirinto.getPos(norte).equals(" ")) {
                        caminho.guardeUmItem(norte);
                        labirinto.setPos("*", norte);
                    }
                    else if (labirinto.getPos(norte).equals("S")) {
                        caminho.guardeUmItem(norte);
                        acabou = true;
                    }
                }

                if (atual.getY() < linhas - 1) {
                    Coordenada sul = new Coordenada(atual.getX(), atual.getY() + 1);
                    if (labirinto.getPos(sul).equals(" ")) {
                        caminho.guardeUmItem(sul);
                        labirinto.setPos("*", sul);
                    }
                    else if (labirinto.getPos(sul).equals("S")) {
                        caminho.guardeUmItem(sul);
                        acabou = true;
                    }
                }

                if (atual.getX() > 0) {
                    Coordenada oeste = new Coordenada(atual.getX() - 1, atual.getY());
                    if (labirinto.getPos(oeste).equals(" ")) {
                        caminho.guardeUmItem(oeste);
                        labirinto.setPos("*", oeste);
                    }
                    else if (labirinto.getPos(oeste).equals("S")) {
                        caminho.guardeUmItem(oeste);
                        acabou = true;
                    }
                }

                if (atual.getX() < colunas - 1) {
                    Coordenada leste = new Coordenada(atual.getX() + 1, atual.getY());
                    if (labirinto.getPos(leste).equals(" ")) {
                        caminho.guardeUmItem(leste);
                        labirinto.setPos("*", leste);
                    }
                    else if (labirinto.getPos(leste).equals("S")) {
                        caminho.guardeUmItem(leste);
                        acabou = true;
                    }
                }

                System.out.println("");
                for(int i = 0; i < linhas; i++){
                    for(int k = 0; k < colunas; k++){
                        coord = new Coordenada(k,i);
                        ret += labirinto.getPos(coord);
                    }
                    System.out.println(ret);
                    ret = "";
                }
            }

        System.out.println(caminho.recupereUmItem());
    }
}