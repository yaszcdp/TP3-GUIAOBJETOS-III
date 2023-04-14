public class Persona {
    //--------------[ EJERCICIO 2 ]
    //Diseñar un programa que nos permita gestionar el personal que concurre a un colegio. Limitarse a estudiantes y
    //miembros de staff que a diferencia de los estudiantes, estos perciben una remuneración.
    //Ambos tipos comparten la característica de Persona que posee los atributos de dni, nombre, apellido, email y direccion.

    protected Integer dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;
    protected Integer altura;

    public Persona(Integer dni, String nombre, String apellido, String email, String direccion, Integer altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.altura = altura;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String toString (){
        return "\nDni: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEmail: " + email +
                "\nDireccion: " + direccion + "\nAltura: " + altura;
    }

}
