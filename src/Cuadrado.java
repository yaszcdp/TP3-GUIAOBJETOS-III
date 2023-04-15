public class Cuadrado extends FiguraRectangular{

    public Cuadrado(String color, Float alto) {
        super(color, alto, alto);
    }

    @Override
    public String toString (){
        return "------------------------\n[Cuadrado] \nColor:" + color + "\nLado: " + alto + "\nÁrea: " + calculaArea() + "\nPerímetro: " + calculaPerimetro() + "\n------------------------";
    }

}
