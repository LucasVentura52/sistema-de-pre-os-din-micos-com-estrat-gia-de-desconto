public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double Desconto(double preco) {
        return preco * 0.90 ;
    }
}
