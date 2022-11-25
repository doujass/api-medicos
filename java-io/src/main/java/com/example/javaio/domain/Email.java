package com.example.javaio.domain;

public class Email {

    private String enderecoDeEmail;

    public Email(String enderecoDeEmail) {

        if (!checkIfEmailIsValid(enderecoDeEmail)) {
            throw new IllegalArgumentException("E-mail invalido");
        }

        this.enderecoDeEmail = enderecoDeEmail;
    }

    public String getEnderecoDeEmail() {
        return enderecoDeEmail;
    }

    public void setEnderecoDeEmail(String enderecoDeEmail) {
        this.enderecoDeEmail = enderecoDeEmail;
    }

    

    public boolean checkIfEmailIsValid(String enderecoDeEmail) {
        if (enderecoDeEmail == null)    {
            return false;
        }

        if (enderecoDeEmail.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return false;
        }
        return true;
    }
}
