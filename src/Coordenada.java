public class Coordenada{
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) throws Exception{
        if(x < 0)
            throw new Exception("Valor de coordenada inválido");
        this.X = x;
    }

    public void setY(int y) throws Exception{
        if(y < 0)
            throw new Exception("Valor de coordenada inválido");
        this.Y = y;
    }

    public Coordenada(int x,int y){
        this.X = x;
        this.Y = y;
    }

    public String toString(){
        return "(" + X + ", " + Y + ")";
    }

}
