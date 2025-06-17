import java.util.ArrayList;
import java.util.List;

public class ElencoMaterie {
    public static void main(String[] args) {
        List<String> materie = new ArrayList<>();
        materie.add("Developer");
        materie.add("3D Artist");

        System.out.println("Elenco materie:");
        for (String materia : materie) {
            System.out.println("- " + materia);
        }
    }
}