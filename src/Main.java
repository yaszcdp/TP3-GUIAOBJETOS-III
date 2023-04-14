import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
  /*      //------------------[ EJERCICIO 1 ]
        //realice las siguientes pruebas:
        //A) Inicializar un Cilindro y debuguear analizando los constructores a los que va llamando para inicializar la cadena de herencia.
        //Imprimir por pantalla, el radio del cilindro, la altura, el área de la base y el volumen.

        Cilindro cil1 = new Cilindro ();

        System.out.println("CILINDRO 1: \nRadio: " + cil1.getRadio() + "\nAltura: " + cil1.getAltura() +
                "\nArea Base: " + cil1.calculaArea(cil1.getRadio()) + "\nVolumen: " + cil1.calculaVolumen());

        //B) Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        //Imprimir por pantalla el radio, la altura, el área de la base y el volumen.

        Cilindro cil2 = new Cilindro(3.5F, "verde", 2.0F);

        System.out.println("CILINDO 2: \nRadio: " + cil2.getRadio() + "\nAltura: " + cil2.getAltura() +
                "\nArea Base: " + cil2.calculaArea(cil2.getRadio()) + "\nVolumen: " + cil2.calculaVolumen());

        //C) Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el cálculo del volumen difiere,
        //esto es porque nosotros sobreescribimos el método calcular area y ahora nos calcula el área de un cilindro.

        float areaCil2 = cil2.calculaArea(cil2.getRadio(), cil2.getAltura());

        System.out.println("Area Cilindro: " + areaCil2);

        System.out.println("\n-------------------\n" + cil2.toString() + "\n-------------------\n");
*/

        //------------------[ EJERCICIO 2 ]
        //A) Inicializar 4 estudiantes diferentes.

        Estudiante Yasz = new Estudiante(37769710, "Yas'z", "Di Prisco", "yasz.cdp@hotmail.com",
                "Carlos Tejedor", 2846, 2022, 11000.0F, "Tecnicatura en Programación");
        Estudiante Mika = new Estudiante(40333555, "Mikaela", "Hermida", "mikahermi@hotmail.com",
                "Carlos Tejedor", 2846, 2022, 11000.0F, "Tecnicatura en Programación");
        Estudiante Fede = new Estudiante(27456123, "Federico", "Gil de Muro", "fedegildemuro@hotmail.com",
                "Carlos Tejedor", 2444, 2022, 11000.0F, "Tecnicatura en Programación");
        Estudiante Mari = new Estudiante(27123456, "Marina", "Lucero", "marinalucero@hotmail.com",
                "Avenida Siempre viva", 1234, 2022, 11000.0F, "Tecnicatura en Programación");

        //B) Inicializar 4 miembros de staff con características diferentes.
        Staff Roberto = new Staff(22356456, "Roberto", "Vargas", "robertovargas@gmail.com",
                "Constitución", 1234, 130000.0F, "Noche");
        Staff Vicente = new Staff(33114747, "Vicente", "Di Prisco", "gatonegro@gmail.com",
                "Valencia", 3665, 140500.0F, "Mañana");
        Staff Chango = new Staff(45356789, "Django", "Chimango", "djangounchained@gmail.com",
                "Laprida", 4775, 95300.0F, "Mañana");
        Staff Noah = new Staff(33102457, "Noah", "Missart", "gatotitan@hotmail.com",
                "Florisbelo Acosta", 6999, 125700.0F, "Noche");

        //C) Crear un array que permita almacenar juntos los tipos anteriores y almacenar las 8 instancias creadas anteriormente.
        ArrayList<Persona> personal = new ArrayList<Persona>();
        personal.add(Yasz);
        personal.add(Mika);
        personal.add(Fede);
        personal.add(Mari);
        personal.add(Roberto);
        personal.add(Vicente);
        personal.add(Chango);
        personal.add(Noah);

        //D) Investigar el uso de la palabra reservada instanceof.
        //E) Recorrer el array y mostrar por pantalla la cantidad de estudiantes y la cantidad de miembros de staff.
        int cantE = 0, cantS = 0;

        for (int i = 0; i < personal.size(); i++){
            if (personal.get(i) instanceof Estudiante)
                cantE++;
            else
                cantS++;
        }

        System.out.println("Cantidad Estudiantes: " + cantE + "\nCantidad Staff: " + cantS);




        //● Recorrer el array y sumar el total de ingresos que percibe la
        //institución por parte de la cuota de estudiantes.




















        
    }
}