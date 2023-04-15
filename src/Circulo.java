public class Circulo extends Figura{
    //----------------[ EJERCICIO 1]
    // Definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
    //sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,


    public Float radio;

    public Circulo (){
        super("Rojo");
        this.radio = 1.0F;
    }

    public Circulo(Float radio, String color) {
        super(color);
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //un método para calcular el área y otro para imprimir sus características. Puede
    //reutilizar la clase Circulo de las guías anteriores.

    public float calculaArea (){
        float diametro = radio * 2;
        float pi = 3.14F;
        float longitud = diametro * pi;
        return ((float) (Math.pow((double)radio, 2)) * pi);
    }

    public float calculaPerimetro (){
        float pi = 3.14F;
        return 2 * pi * radio;
    }

    @Override
    public String toString() {
        return "------------------------\n[Círculo] " + "\nColor: " + color + "\nRadio: " + radio + "\nÁrea: " + calculaArea() + "\nPerímetro: " + calculaPerimetro() + "\n------------------------";
    }
}
