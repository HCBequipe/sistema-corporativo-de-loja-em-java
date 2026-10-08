public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean eAdministrador;

    public Usuario(String nome, String email, String senha, boolean eAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eAdministrador = eAdministrador;
    }

    // --- MÉTODOS COMUNS A TODOS OS USUÁRIOS ---

    public void realizarLogin() {
        System.out.println("Usuário " + this.nome + " realizou login com sucesso.");
    }

    public void realizarLogoff() {
        System.out.println("Usuário " + this.nome + " realizou logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados do usuário " + this.nome + " alterados com sucesso.");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha do usuário " + this.nome + " alterada com sucesso.");
    }

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean iseAdministrador() {
        return eAdministrador;
    }
}