package ejemplodiagrama.dominio;

import java.util.ArrayList;

public class Nota {
    private double notaParcial;
    private double notaFinal;
    private ArrayList<Double> notaSeguimiento;
    private Asignatura materia;

    public Nota(double notaParcial, double notaFinal, Asignatura materia) {
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
        this.materia = materia;
        this.notaSeguimiento = new ArrayList<>();
    }

    public Nota(Asignatura materia) {
        this.materia = materia;
    }

    private double calcularSeguimiento(){
        double sumaNotas = this.notaSeguimiento.stream().mapToDouble(nota -> nota.doubleValue()).sum();
        /*double sumaNotas = 0;
        for(int i=0; i<notaSeguimiento.size(); i++){
            sumaNotas =+ notaSeguimiento.get(i);
        }*/
        return sumaNotas/notaSeguimiento.size();
    }

    public double calcularDefinitiva(){
        return (this.notaParcial*0.3)+(this.notaFinal*0.3)+(calcularSeguimiento()*0.4);
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public ArrayList<Double> getNotaSeguimiento() {
        return notaSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }
}
