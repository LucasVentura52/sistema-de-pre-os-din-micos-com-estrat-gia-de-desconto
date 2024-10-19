Exercício: Sistema de Preços Dinâmicos com Estratégia de Desconto
Contexto: Uma loja online quer implementar um sistema de preços dinâmicos para aplicar diferentes estratégias de desconto em seus produtos. Dependendo do tipo de cliente (novo, regular, VIP), diferentes estratégias de desconto devem ser aplicadas. O padrão de projeto Strategy será utilizado para definir essas diferentes estratégias.

Tarefas:
Crie uma interface DescontoStrategy que declare um método calcularDesconto(double preco).

Implemente três classes concretas que representem diferentes estratégias de desconto:

DescontoClienteNovo: para novos clientes, sem desconto.
DescontoClienteRegular: para clientes regulares, 10% de desconto.
DescontoClienteVIP: para clientes VIP, 20% de desconto.
Crie uma classe Produto que contenha o nome do produto e o preço base.

Crie uma classe CarrinhoDeCompras que terá uma lista de produtos e uma instância de DescontoStrategy:

O carrinho deverá ter um método para definir a estratégia de desconto.
Crie um método para calcular o total com o desconto aplicado a cada produto do carrinho.
No método main, crie alguns produtos e aplique diferentes estratégias de desconto, de acordo com o tipo de cliente.

