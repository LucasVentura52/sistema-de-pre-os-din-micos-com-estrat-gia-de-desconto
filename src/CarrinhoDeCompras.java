import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += descontoStrategy.Desconto(produto.getPrecoProduto());
        }
        return total;
    }
}
