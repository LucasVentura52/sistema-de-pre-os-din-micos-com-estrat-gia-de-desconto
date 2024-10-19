public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double Desconto(double preco) {
        return preco;
    }
}
