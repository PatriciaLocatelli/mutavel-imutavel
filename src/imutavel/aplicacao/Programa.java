package imutavel.aplicacao;

import imutavel.entidades.Endereco;
import imutavel.entidades.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Endereco e = new Endereco("Avenida Paulista", 10);
        Pessoa p = new Pessoa("Igor", e);

        Endereco enderecoAlterado = p.getEndereco();
        enderecoAlterado.setRua("Avenida Brasil");
        enderecoAlterado.setNumero(200);

        System.out.println(p.getEndereco().getRua());
    }
}
