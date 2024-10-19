public class LojaOnline {
    public static void main(String[] args) {

        Produto prodUm = new Produto("Boné New York", 30.0);
        Produto prodDois = new Produto("Camiseta G corinthians ORIGINAL", 350.0);
        Produto prodTres = new Produto("Calçado Adidas", 150.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addProduto(prodUm);
        carrinho.addProduto(prodDois);
        carrinho.addProduto(prodTres);


        System.out.println("\n--| DESCONTOS |--");

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Cliente novo -> " + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Cliente regular -> " + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Cliente VIP -> " + carrinho.calcularTotal());
    }
}