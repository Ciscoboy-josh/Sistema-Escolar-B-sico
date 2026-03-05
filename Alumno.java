public class Alumno{
    String nombre;
    int matricula;
    double calificacion1;
    double calificacion2;
    double calificacion3;
    double promedio;

    public Alumno(String nombre,int matricula,double calificacion1,double calificacion2,double calificacion3){
    this.nombre = nombre;
    this.matricula = matricula;
    this.calificacion1 = calificacion1;
    this.calificacion2 = calificacion2;
    this.calificacion3 = calificacion3;

    }
    public void calcularPromedio(){
        this.promedio = (calificacion1 + calificacion2 + calificacion3) /3;
    }
    public void mostrarAlumno(){
        System.out.println("Alumno"+ nombre);
        System.out.println("Matricula"+ matricula );
        System.out.println("Promedio"+ promedio );
        
    }

    







}