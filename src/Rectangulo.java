public class Rectangulo extends FiguraRectangular{

    public Rectangulo(String color, Float alto, Float ancho) {
        super(color, alto, ancho);
    }

    @Override
    public String toString (){
        return "------------------------\n[Rectángulo] \nColor: " + color + "\nAncho:" + ancho + "\nAlto: " + alto + "\nÁrea: " + calculaArea() + "\nPerímetro: " + calculaPerimetro() + "\n------------------------";
    }


}
