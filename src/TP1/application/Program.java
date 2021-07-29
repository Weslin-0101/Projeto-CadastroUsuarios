package TP1.application;

import TP1.entities.Order;
import TP1.entities.Product;
import TP1.entities.Register;
import TP1.entities.User;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Instancias do Scanner
        Scanner sc = new Scanner(System.in);

        // Instancia da classe Register onde está alocada a arraylist users da classe User
        Register register = new Register();

        // Instancia da classe Order, onde nela está alocada a arraylist products da classe Product
        Order order = new Order();

        // Cadastro Definido de 10 usuários
        register.addUser(new User("Weslin", "QR 100", "61 11111111"));
        register.addUser(new User("Pedro", "QR 200", "61 22222222"));
        register.addUser(new User("Guilherme", "QR 300", "61 33333333"));
        register.addUser(new User("Paula", "QR 400", "61 44444444"));
        register.addUser(new User("Marina", "QR 500", "61 55555555"));
        register.addUser(new User("Enzo", "QR 600", "61 66666666"));
        register.addUser(new User("Maria Eduarda", "QR 700", "61 77777777"));
        register.addUser(new User("Eduarda", "QR 800", "61 88888888"));
        register.addUser(new User("André", "QR 900", "61 99999999"));
        register.addUser(new User("Pablo", "QR 130", "61 00000000"));

        // Cadastro Definido de 10 produtos
        order.addItem(new Product("Lápis", "Faber Castelo", 4, 2.5, 2.1));
        order.addItem(new Product("Shampoo", "Dove", 6, 2.00, 2.9));
        order.addItem(new Product("Condicionador", "Dove", 6, 2.00, 2.9));
        order.addItem(new Product("Manteiga", "Margarina delícia", 10, 5.00, 2.9));
        order.addItem(new Product("Arroz", "Saco de 10kg", 4, 10.00, 2.6));
        order.addItem(new Product("Biscoito", "Do Passatempo", 8, 1.50, 2.7));
        order.addItem(new Product("Chinela", "Chinela da Oakley", 5, 2.00, 2.5));
        order.addItem(new Product("Galão d'água", "Galão de água", 5, 10.00, 2.0));
        order.addItem(new Product("Macarrão", "Instantâneo", 5, 2.5, 2.1));
        order.addItem(new Product("Bolo", "Massa de bolo", 10, 5.00, 5.00));

        int op;
        do {
            menu();
            System.out.print("Escolha o que deseja: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Insira a quantidade que deseja cadastrar: ");
                    int quantidade = sc.nextInt();

                    for (int i = 1; i <= quantidade; i++) {
                        System.out.println("Digite os dados do " + i + "# cliente");
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = sc.nextLine();
                        System.out.print("N° de telefone: ");
                        String telefone = sc.nextLine();

                        // Chamo a classe e o método para que possa adicionar os usuários na arraylist
                        register.addUser(new User(nome, endereco, telefone));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.print("Digite o nome do cliente: ");
                    sc.nextLine();
                    String clientName = sc.nextLine();
                    register.searchUser(clientName); // Método de busca
                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.print("Deseja alterar os dados (S/N): ");
                    char letter = sc.next().toLowerCase().charAt(0);
                    if (letter == 's' || letter == 'S') {
                        // A partir do if começa a cadastrar os novos dados do usuário
                        System.out.println();
                        System.out.print("Digite o novo nome: ");
                        sc.nextLine();
                        String newName = sc.nextLine();
                        System.out.print("Novo endereço: ");
                        String newAddress = sc.nextLine();
                        System.out.print("Novo telefone: ");
                        String newPhone = sc.nextLine();

                        System.out.println();
                        register.updateUser(clientName, newName, newAddress, newPhone);
                    }
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------");
                    System.out.print("Qual a quantidade de produtos: ");
                    int productQuantity = sc.nextInt();

                    for (int i = 1; i <= productQuantity; i++) {
                        System.out.println();
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String productName = sc.nextLine();
                        System.out.print("Descrição: ");
                        String description = sc.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        int stock = sc.nextInt();
                        System.out.print("Preço: ");
                        Double price = sc.nextDouble();
                        System.out.print("Porcentagem de lucro: ");
                        Double porcent = sc.nextDouble();

                        order.addItem(new Product(productName, description, stock, price, porcent));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    System.out.print("Nome do produto: ");
                    sc.nextLine();
                    String nameProduct = sc.nextLine();
                    System.out.println();
                    order.searchProduct(nameProduct);
                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.print("Deseja alterar os dados (S/N): ");
                    char letter_2 = sc.next().toLowerCase().charAt(0);
                    if (letter_2 == 's' || letter_2 == 'S') {
                        System.out.println();
                        System.out.print("Digite o novo nome: ");
                        sc.nextLine();
                        String newProductName = sc.nextLine();
                        System.out.print("Nova descrição: ");
                        String newDescription = sc.nextLine();
                        System.out.print("Nova quantidade em estoque: ");
                        Integer newStock = sc.nextInt();
                        System.out.print("Nova preço: ");
                        Double newPrice = sc.nextDouble();
                        System.out.print("Nova porcentagem: ");
                        Double newPorcent = sc.nextDouble();

                        System.out.println();
                        order.updateProduct(nameProduct, newProductName, newDescription, newStock, newPrice, newPorcent);
                        System.out.println("--------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    System.out.println("Caso deseja sair, digite '0' ");
                    System.out.print("Deseja sair(S) ou continuar(C): ");
                    char choice = sc.next().toLowerCase().charAt(0);
                    if (choice == 's' || choice == 'S') {
                        System.out.println();
                        System.out.println("Lista dos Usuários!!");
                        register.getAllUsers(new User());
                        System.out.println();
                        System.out.println("Escreva o nome do usuário");
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String nameSelected = sc.nextLine();
                        System.out.println();
                        order.getAllProducts(new Product());
                        System.out.println("Escreva o nome do produto");
                        System.out.println();
                        System.out.print("Nome do produto:");
                        String nameSelected_2 = sc.nextLine();
                        System.out.print("Qual a quantidade que deseja vender: ");
                        int qntdProducts = sc.nextInt();
                        System.out.println();
                        order.stockCalc(nameSelected_2, qntdProducts);
                        System.out.println();
                    }
                    System.out.println("--------------------------------");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("--------------------------------");
                    System.out.println();
                    order.getAllProducts(new Product());
                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println();
                    break;
                default:
                    System.out.println("Programa finalizado!!");
                    break;
            }
        } while (op < 7);

        sc.close();
    }

    // Método void do menu para que o usuário possa fazer o seu input
    public static void menu() {
        System.out.println("[1] - Cadastrar Cliente");
        System.out.println("[2] - Buscar Cliente");
        System.out.println("[3] - Cadastrar Produtos");
        System.out.println("[4] - Buscar Produtos");
        System.out.println("[5] - Cadastrar Vendas");
        System.out.println("[6] - Mostrar Vendas");
        System.out.println("[7] - Sair do programa");
    }
}