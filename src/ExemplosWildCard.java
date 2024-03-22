import java.util.List;

public class ExemplosWildCard {

    public static void wunkonow(List<?> qualquer_lista) {
        System.out.println("Tamannho da lista tal: " + qualquer_lista.size());
    }

    public static void wextends(List<? extends Number> qualquer_lista_de_numeros) {
        System.out.println("Tamannho da lista tal: " + qualquer_lista_de_numeros.size());
    }

    public static void wsuper(List<? super Integer> qualquer_lista_de_inteiros) {
        System.out.println("Tamannho da lista tal: " + qualquer_lista_de_inteiros.size());
    }



}
