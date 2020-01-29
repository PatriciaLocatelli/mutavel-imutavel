package imutavel.entidades;

public class Pessoa {

    private final String nome;
    private final Endereco endereco;

    private Pessoa(){
        endereco = null;
        nome = null;
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    //Não cria setter


    public Endereco getEndereco() {
        //cria uma cópia do objeto
        return new Endereco(endereco.getRua(), endereco.getNumero());
    }
}
