package mutavel.aplicacao;

import mutavel.entidade.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Igor");

        p1.setNome("Victor");
        p2.setNome("João");

        System.out.println(p1.getNome() + " " + p2.getNome());
    }
}
