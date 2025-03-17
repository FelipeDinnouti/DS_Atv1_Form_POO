import java.util.Scanner;

public class Main {
    static String main_greeting = "Bem vindo ao Sistema de Cadastro do Japonês!\nEscolha uma opção:\n1 - Cadastrar nova pessoa\n2 - Editar dados de pessoa cadastrada\n3 - Apresentar dados da pessoa cadastrada\n4 - Excluir dados da pessoa cadastrada\n5 - Listar todos cadastros\n0 - Sair\n\nDigite a opção desejada: ";


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        RegisterHandler register_handler = new RegisterHandler();

        int selected_option = 0;
        Person cache_person;

        do {
            System.out.print(main_greeting);
            selected_option = scanner.nextInt();
            scanner.nextLine();

            switch (selected_option) {
                case 1: // Create a person
                    cache_person = new Person();
                    System.out.print("\n\nRealizando cadastro de pessoa:\nE-mail: ");
                    
                    cache_person.SetEmail(scanner.nextLine());

                    System.out.print("\nNome: ");
                    cache_person.SetName(scanner.nextLine());

                    System.out.print("\nIdade: ");
                    cache_person.SetAge(scanner.nextInt());

                    register_handler.RegisterPerson(cache_person);
                    System.out.print("Pessoa cadastrada com sucesso!\n\n");


                    break;

                case 2: // Update person name or age
                    System.out.print("\n\nAtualizar cadastro de pessoa:\n - Digite o E-mail: ");                   
                    cache_person = register_handler.GetPersonByEmail(scanner.nextLine());

                    System.out.print("\nNome: ");
                    cache_person.SetName(scanner.nextLine());

                    System.out.print("\nIdade: ");
                    cache_person.SetAge(scanner.nextInt());

                    System.out.print("\nAtualizado com sucesso!\n");

                    break;
                case 3: // Query person by email
                    System.out.print("\n\nConsulta de pessoa:\n - Digite o E-mail: ");
                    cache_person = register_handler.GetPersonByEmail(scanner.nextLine());

                    if (cache_person == null) {
                        System.out.println("Usuário não cadastrado");
                        break;
                    }

                    System.out.print("\nUsuário encontrado!\n\n" + cache_person);

                    break;
                case 4: // Delete person by email
                    System.out.print("\n\nConsulta de pessoa:\n - Digite o E-mail: ");
                    register_handler.DeletePerson(scanner.nextLine());;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

                    System.out.print("Registro deletado.\n");
                    break;

                case 5: // List all registers
                    System.out.println("\n\nListando cadastros...");

                    register_handler.PrintPersons();
                    break;
                default:
                    break;
            }

            System.out.println("Aperte enter para continuar...");
            scanner.nextLine();
            scanner.nextLine();

        } while(selected_option != 0);

        scanner.close();
        System.out.println("Saindo...");
    }
}
