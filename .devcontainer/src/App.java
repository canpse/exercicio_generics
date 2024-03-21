import java.util.Date;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }
    
    public static void ex1() {
        System.out.println("Exercicio 1");
        Nodo<String> n1 = new Nodo<>("Olá mundo de genericos");
        System.out.println("Generico com String: " + n1.getDado());
    
        Nodo<Integer> n2 = new Nodo<>(123);
        System.out.println("Generico com int: " + n2.getDado());
    
        Nodo<Boolean> n3 = new Nodo<>(true);
        System.out.println("Generico com booleano: " + n3.getDado());
        System.out.println("---------------------------------");
    }

    public static void ex2() {
        System.out.println("Exercicio 2");

        Produto<Integer> p_int = new Produto<>(1, 50, new Date(111111111), new Date(111111111));
        Produto<String> p_string = new Produto<>("abacaxi", 50, new Date(111111111), new Date(111111111));
        System.out.println("Id com int: " + p_int.getId());
        System.out.println("Id com String: " + p_string.getId());

        System.out.println("----------");
    }

    public static void ex3() {
        System.out.println("Exercicio 3");
        ProdutoX p1 = new ProdutoX("abacaxi", 10);
        ProdutoX p2 = new ProdutoX("laranja", 12);
        ProdutoX p3 = new ProdutoX("pera", 11);
        Pedido<ProdutoX> ped = new Pedido<>();
        ped.adicionarProduto(p1);
        ped.adicionarProduto(p2);
        ped.adicionarProduto(p3);
        ped.mostrarProdutos();
        System.out.println("------------------");
    }

    public static void ex4() {
        System.out.println("Exercicio 4");
        MeuMap<Integer> mp = new MeuMap<>();
        mp.add("primeiro", 1);
        mp.add("segundo", 2);
        mp.add("terceiro", 3);

        System.out.println(mp.getValor("primeiro"));
        System.out.println(mp.getValor("segundo"));
        System.out.println(mp.getValor("terceiro"));
        System.out.println("--------------------");
    }


}