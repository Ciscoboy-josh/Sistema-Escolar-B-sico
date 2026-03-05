public class Alumno{
    String nombre;
    int matricula;
    double calificacion1;
    double calificacion2;
    double calificacion3;

    public Alumno(String nombre,int matricula,double calificacion1,double calificacion2,double calificacion3){
    this.nombre = nombre;
    this.matricula = matricula;
    this.calificacion1 = calificacion1;
    this.calificacion2 = calificacion2;
    this.calificacion3 = calificacion3;

    }
    public void calcularPromedio(){
        double promedio = (calificacion1 + calificacion2 + calificacion3) /3;
    }
    public void mostrarAlumno()

    







}