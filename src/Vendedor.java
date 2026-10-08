public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        // Administrador é sempre 'false' para Vendedor
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }

    // Métodos específicos do Vendedor
    public void realizarVenda() {
        this.quantidadeVendas++; // Incrementa o número de vendas
        System.out.println("Venda realizada por " + getNome() + "! Total de vendas atual: " + this.quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Vendedor " + getNome() + " possui " + this.quantidadeVendas + " vendas registradas.");
    }

    // Getters e Setters específicos
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}