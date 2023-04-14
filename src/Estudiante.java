public class Estudiante extends Persona{

    private Integer anyoIngreso;
    private Float cuotaMensual;
    private String carrera;

    public Estudiante(Integer dni, String nombre, String apellido, String email, String direccion,
                      Integer altura, Integer anyoIngreso, Float cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion, altura);
        this.anyoIngreso = anyoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public Integer getAnyoIngreso() {
        return anyoIngreso;
    }

    public void setAnyoIngreso(Integer anyoIngreso) {
        this.anyoIngreso = anyoIngreso;
    }

    public Float getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float calculaCuotaAnual (){
        return cuotaMensual * 12;
    }

    public String toString (){
        return "Estudiante:" + super.toString() + "\nAño ingreso: " + anyoIngreso + "\nCuota mensual: $" + cuotaMensual +
            "\nCarrera: " + carrera;
    }

}
