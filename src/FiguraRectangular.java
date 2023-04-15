public abstract class FiguraRectangular extends Figura{
    public Float alto;
    public Float ancho;

    public FiguraRectangular(String color, Float alto, Float ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Float getAlto() {
        return alto;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public Float calculaArea (){
        return alto * ancho;
    }

    public Float calculaPerimetro (){
        return alto*2 + ancho *2;
    }

}
