public class Labirinto {
    private String[][] labirinto = null;
    private Coordenada entrada;

    public Labirinto(int colunas, int linhas)
    {
        labirinto = new String[colunas][linhas];
    }

    public Labirinto(int colunas, int linhas, String str)
    {
        labirinto = new String[colunas][linhas];
        this.preencher(str);
    }

    public void preencher(String str) {
        int k = 0;
        for(int i = 0; i < labirinto[0].length; i++) {
            for (int h = 0 ;h < labirinto.length; h++){
                labirinto[h][i] = str.substring(k + 2, k+3);
                if(labirinto[h][i] == "E")
                {
                    entrada = new Coordenada(h, i);
                }
                k++;
            }
        }
    }

    public String getPos(Coordenada coord){
        return this.labirinto[coord.getX()] [coord.getY()];
    }
}
