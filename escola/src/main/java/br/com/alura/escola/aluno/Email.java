package br.com.alura.escola.aluno;

public class Email {

    private String enderecoDeEmail;

    public Email(String enderecoDeEmail) {

        if (enderecoDeEmail == null || !enderecoDeEmail
                .matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido");
        }

        this.enderecoDeEmail = enderecoDeEmail;
    }

    public String getEnderecoDeEmail() {
        return enderecoDeEmail;
    }
}
