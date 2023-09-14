package ejemplodiagrama.app;

import ejemplodiagrama.dominio.Asignatura;
import ejemplodiagrama.dominio.Docente;
import ejemplodiagrama.dominio.Estudiante;
import ejemplodiagrama.dominio.Nota;

public class App {
    public static void main(String[] args){
        Asignatura asignatura= new Asignatura("SW4");
        Docente profeso= new Docente("1234","Jhon Duque");

        Estudiante brayan= new Estudiante("1","Brayan");
        Estudiante mateo= new Estudiante("2","Mateo");

        Nota notaBrayan= new Nota(5, 5, asignatura);
        notaBrayan.getNotaSeguimiento().add(5.0);
        notaBrayan.getNotaSeguimiento().add(4.0);
        notaBrayan.getNotaSeguimiento().add(3.0);
        notaBrayan.getNotaSeguimiento().add(2.0);

        double definitiva = notaBrayan.calcularDefinitiva();
        if(definitiva >= 3.5){
            System.out.println(brayan.getNombre() + " ganó");
        }else{
            System.out.println(brayan.getNombre() + " perdio");
        }

    }
}
