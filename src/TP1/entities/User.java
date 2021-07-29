package TP1.entities;

import java.util.Objects;

// Classe da entidade Usuário
public class User {

    // Atributos
    private String name;
    private String endereco;
    private String telefone;

    // Logo abaixo constructor default e o sobrecarregado
    public User() {
    }

    public User(String name, String endereco, String telefone) {
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Nome: "
                + name
                + ", Endereço: "
                + endereco
                + ", Telefone: "
                + telefone;
    }
}
