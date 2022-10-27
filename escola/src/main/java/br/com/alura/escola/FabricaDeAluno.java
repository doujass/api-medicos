package br.com.alura.escola;

import java.util.SplittableRandom;

public class FabricaDeAluno {

    private Aluno aluno;

    public void comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
    }
}
