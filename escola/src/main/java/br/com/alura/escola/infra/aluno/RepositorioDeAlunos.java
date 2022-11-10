package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular (Aluno aluno);

    Aluno buscarAlunoPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
