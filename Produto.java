public class Produto {

    String nome;

    double preco;

    int quantidade;


    // Construtor 1 + parametros:
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    // Construtor 2:


    //Metodos:
                // metodo
    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

            //metodo \/     parametro \/
    public void comprar(int quantidadeComprada){
        if (quantidadeComprada <= quantidade){
            quantidade -= quantidadeComprada;
            System.out.println("Compra realizada com sucesso! Quantidade restante: " + quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    public void adicionarEstoque(int quantidadeAdicional){
        quantidade += quantidadeAdicional;
        System.out.println("Quantidade adicionada ao estoque. Novo total: " + quantidade);
    }

    //Parametro = double
    public void aplicarDesconto(double percentualDesconto){
        //Variavel = desconto
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
        System.out.println("Desconto aplicado! novo preco: R$" + preco);

    }

}


