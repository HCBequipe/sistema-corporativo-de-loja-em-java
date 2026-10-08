public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "carlos@empresa.com", "admin123");
        Vendedor vendedor = new Vendedor("Ana", "ana@empresa.com", "venda123", 10);
        Atendente atendente = new Atendente("Lucas", "lucas@empresa.com", "caixa123", 150.0);

        System.out.println("--- TESTE DE LOGIN E PERMISSÕES ---");
        gerente.realizarLogin();
        System.out.println(gerente.getNome() + " é admin? " + gerente.iseAdministrador());

        vendedor.realizarLogin();
        System.out.println(vendedor.getNome() + " é admin? " + vendedor.iseAdministrador());

        System.out.println("\n--- TESTE DE MÉTODOS ESPECÍFICOS ---");
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        vendedor.realizarVenda(); // Incrementa de 10 para 11
        vendedor.consultarVendas();

        atendente.receberPagamentos(50.0); // Incrementa de 150 para 200
        atendente.fecharCaixa();

        System.out.println("\n--- TESTE DE LOGOFF ---");
        atendente.realizarLogoff();
    }
}