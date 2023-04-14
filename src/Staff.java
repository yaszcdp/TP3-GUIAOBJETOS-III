public class Staff extends Persona{
    private Float salario;
    private String turno; //mañana o noche.

    public Staff(Integer dni, String nombre, String apellido, String email, String direccion, Integer altura, Float salario, String turno) {
        super(dni, nombre, apellido, email, direccion, altura);
        this.salario = salario;
        this.turno = turno;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float calculaSalarioAnual (){
        return salario * 12;
    }

    public String toString (){
        return "Miembro Staff: " + super.toString() + "\nSalario: $" + salario + "\nTurno: " + turno;
    }

}
