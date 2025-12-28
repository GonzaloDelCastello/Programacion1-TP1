

public class Estudiante extends Persona{ //implements MiembroDeUniversidad {

private Carrera carrera;
private double promedio;
private Materia[] materias;

public Estudiante() {};

public Estudiante(String nombre, String apellido, int edad, double promedio, String dni) {
    super.nombre = nombre;
    super.apellido = apellido;
    super.edad = edad;
    this.promedio = promedio;
    super.dni = dni;
}


public void agregarMateria(Materia materia) {
    if (this.materias == null) {
        this.materias = new ArrayList<>();
    } else {
        this.materias.add(materia);
    }
}
public ArrayList<Materia> getMaterias() {
    return this.materias;
}
// public double calcularPromedio() {
//     double suma = 0;
//     for (Materia materia : this.materias){
//         suma += materia.getCalificacion();
//     }
//     return suma / this.materias.size();
// }

public String getNombre() {
    return this.nombre;
}
public String getApellido() {
    return this.apellido;
}
public int getEdad() {
    return this.edad;
}
public double getPromedio() {
    return this.promedio;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}



public double setPromedio(double promedio) {
    return this.promedio = promedio;
}
@Override
public String toString() {
    return "Estudiante [nombre=" + this.nombre + ", apellido=" + this.apellido
     + ", edad=" + this.edad + ", carrera=" + this.carrera
     + ", promedio=" + this.promedio + "]";
}
@Override
public String obtenerRol() {
    return "Estudiante";
}
}