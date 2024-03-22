import java.util.List;
import java.util.ArrayList;

class Pedido<T extends ProdutoX> {
    private List<T> listaProdutos;

    public Pedido() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        listaProdutos.add(produto);
    }

    public void mostrarProdutos() {
        System.out.println("Lista de Produtos:");
        for (ProdutoX produto : listaProdutos) {
            System.out.println("Nome: " + produto.getNome() + " | Preço: " + produto.getPreco());
        }
    }

}