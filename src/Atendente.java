public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        // Administrador é sempre 'false' para Atendente
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    // Métodos específicos do Atendente
    public void receberPagamentos(double valor) {
        this.valorEmCaixa += valor; // Incrementa o valor no caixa
        System.out.printf("Pagamento de R$ %.2f recebido por %s. Saldo atual do caixa: R$ %.2f\n",
                valor, getNome(), this.valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.printf("Caixa fechado por %s com o valor total de R$ %.2f.\n", getNome(), this.valorEmCaixa);
    }

    // Getters e Setters específicos
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}