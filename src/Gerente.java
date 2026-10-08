public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        // Administrador é sempre 'true' para Gerente
        super(nome, email, senha, true);
    }

    // Métodos específicos do Gerente
    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerente " + getNome() + " está gerando o relatório financeiro do sistema.");
    }

    public void consultarVendas() {
        System.out.println("Gerente " + getNome() + " está consultando as vendas gerais da empresa.");
    }
}