public class Pessoa {
    private String nome;
    private String endereço;
    private String numero;
    private  String cpf;
    public Pessoa(String nome, String endereço, String numero, String cpf) {
        this.nome = nome;
        this.endereço = endereço;
        this.numero = numero;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
