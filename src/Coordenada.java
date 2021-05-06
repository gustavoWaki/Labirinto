public class Coordenada{
    int X;
    int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Coordenada(int x,int y){
        this.X = x;
        this.Y = y;
    }

    public String toString(){
        return "(" + X + ", " + Y + ")";
    }

}
