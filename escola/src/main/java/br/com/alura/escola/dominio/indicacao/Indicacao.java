package br.com.alura.escola.dominio.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno alunoIndicado;
    private Aluno alunoQueIndicou;
    private LocalDateTime dataDaIndicacao;

    public Indicacao(Aluno alunoIndicado, Aluno alunoQueIndicou) {
        this.alunoIndicado = alunoIndicado;
        this.alunoQueIndicou = alunoQueIndicou;
        this.dataDaIndicacao = LocalDateTime.now();
    }

    public Aluno getAlunoIndicado() {
        return alunoIndicado;
    }

    public Aluno getAlunoQueIndicou() {
        return alunoQueIndicou;
    }

    public LocalDateTime getDataDaIndicacao() {
        return dataDaIndicacao;
    }
}
