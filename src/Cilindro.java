public class Cilindro extends Circulo{
    //Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
    //ende se convierte en subclase de Círculo. El Cilindro a diferencia del Círculo posee
    //un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
    //su constructor. Y un método para calcular el volumen.
    public Float altura;

    public Cilindro(){
        super();
        this.altura = 1.0F;
    }

    public Cilindro(Float radio, String color, Float altura) {
        this.radio = radio;
        this.color = color;
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    // Modificar el método calcular volumen en la clase cilindro para que llame al método de la SUPER clase que calcula
    //el área.
    public float calculaVolumen (Float altura){
        float volumen = super.calculaArea() * altura;
        return volumen;
    }

    //C)Sobreescribir el método calcular area declarado en Círculo, para que nos permita calcular el área del cilindro.
    //(2π×radius×height + 2×areaBase)

    public float calculaArea (Float radio, Float altura){
        float pi = 3.14F;
        float areaBase = calculaArea();
        return ((2 * pi) * radio * altura + 2 * areaBase);
    }

    //Modificar el método toString() de la clase cilindro para que imprima por pantalla lo siguiente
    //Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};

    public String toString(){
        return "------------------------\n[Cilindro] \nColor: " + super.color + "\nRadio: " + super.radio  + "\nAltura Cilindro: " + altura + "\nÁrea: " + calculaArea(radio, altura) +
                "\nVolúmen: " + calculaVolumen(altura) + "\n------------------------";
    }

}
