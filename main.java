import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregar estudiantes
        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Luis");

        // Mostrar estudiantes
        System.out.println("Lista de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }
    }
}

