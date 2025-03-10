import java.util.Scanner;

public class Main {
    static String main_greeting = "Bem vindo ao Sistema de Cadastro do Japonês!\nEscolha uma opção:\n1 - Cadastrar nova pessoa\n2 - Editar dados de pessoa cadastrada\n3 - Apresentar dados da pessoa cadastrada\n4 - Excluir dados da pessoa cadastrada\n0 - Sair\n\nDigite a opção desejada: ";


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        RegisterHandler register_handler = new RegisterHandler();

        int selected_option = 0;

        do {
            System.out.print(main_greeting);
            selected_option = scanner.nextInt();
            scanner.nextLine();

            switch (selected_option) {
                case 1: // Create a person
                    Person person = new Person();
                    System.out.print("\n\nRealizando cadastro de pessoa:\nE-mail: ");
                    
                    person.SetEmail(scanner.nextLine());

                    System.out.print("\nNome: ");
                    person.SetName(scanner.nextLine());

                    System.out.print("\nIdade: ");
                    person.SetAge(scanner.nextInt());

                    register_handler.RegisterPerson(person);
                    System.out.print("Pessoa cadastrada com sucesso!\n\n");
                    break;

                case 2:
                    System.out.print("\n\nConsulta de pessoa:\n Digite o E-mail: ");

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }

        } while(selected_option != 0);

        scanner.close();
        System.out.println("Saindo...");
    }
}
