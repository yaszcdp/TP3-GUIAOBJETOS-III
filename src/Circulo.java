public class Circulo {
    //----------------[ EJERCICIO 1]
    // Definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
    //sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,


    public Float radio;
    public String color;

    public Circulo (){
        this.radio = 1.0F;
        this.color = "Rojo";
    }

    public Circulo(Float radio, String color) {
        this.radio = radio;
        this.color = color;
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

    public float calculaArea (Float radio){
        float diametro = radio * 2;
        float pi = 3.14F;
        float longitud = diametro * pi;
        return ((float) (Math.pow((double)radio, 2)) * pi);
    }

    @Override
    public String toString() {
        return "Círculo: " + "\nRadio: " + radio + "\nColor: " + color;
    }
}
