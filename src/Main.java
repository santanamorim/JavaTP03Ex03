class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;

    public Endereco(String rua, String numero, String complemento, String bairro, String municipio, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + complemento + ", " + bairro + ", " + municipio + ", " + estado + ", CEP: " + cep;
    }
}

class Aluno {
    private int matricula;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Aluno(int matricula, String nome, String telefone, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
    }
}

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "123", "Apto 1", "Centro", "Cidade A", "Estado A", "12345-678");
        Endereco endereco2 = new Endereco("Rua B", "456", "", "Bairro B", "Cidade B", "Estado B", "98765-432");

        Aluno aluno1 = new Aluno(1, "João", "123456789", endereco1);
        Aluno aluno2 = new Aluno(2, "Maria", "987654321", endereco2);

        System.out.println("Informações do Aluno 1:");
        System.out.println(aluno1);
        System.out.println("\nInformações do Aluno 2:");
        System.out.println(aluno2);
    }
}
