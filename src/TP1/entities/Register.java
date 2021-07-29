package TP1.entities;

import java.util.ArrayList;
import java.util.List;

// Classe responsável para que faça o CRUD sobre os usuários, é uma classe de controller
public class Register {

    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        if(!users.contains(user)) {
            users.add(user);
        } else {
            System.out.println("===================================");
            System.out.println("AVISO: Usuário já cadastrado!!!");
            System.out.println("===================================");
        }
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void getAllUsers(User user) {
        for (User u : users) {
            System.out.println(u);
        }
    }

    // Os métodos searchUser e updateUser possuem quase o mesmo código
    // A lógica por trás deles são a mesma, apenas fazendo pequenas alterações
    // Nos dois, é válido notar a variável booleana que é sempre necessária para esses casos
    public void searchUser(String name) {
        boolean found = false;
        User user = null;
        for (User value : users) {
            user = value;
            if (user.getName().equals(name)) {
                System.out.println(user);
                found = true;
            }
        }

        if (!found) {
            System.out.println("====================================");
            System.out.println("Usuário não encontrado!");
            System.out.println("====================================");
        }
    }

    public void updateUser(String name, String newName, String address, String phone) {
        boolean found = false;

        for (User obj : users) {
            if (obj.getName().equals(name)) {
                obj.setName(newName);
                obj.setEndereco(address);
                obj.setTelefone(phone);

                found = true;
            }
        }

        if (!found) {
            System.out.println("====================================");
            System.out.println("AVISO :Usuário não encontrado!");
            System.out.println("====================================");
        } else {
            System.out.println("====================================");
            System.out.println("Dados do usuário atualizados com sucesso!!!");
            System.out.println("====================================");
        }
    }
}
