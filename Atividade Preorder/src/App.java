import java.util.Scanner;

public class App {

    static int menu(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Arvore Binária de Busca");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Buscar elemento");
        System.out.println("4. Exibir árvore");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return leia.nextInt();
    }
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        BinarySearchTree<Aluno> arvore = new BinarySearchTree<Aluno>(); // Instanciar a arvore

        // arvore.add(5);
        // arvore.add(9);
        // arvore.add(3);
        // arvore.add(1);
        // arvore.add(6);
        // arvore.add(4);
        // arvore.add(15);
        // arvore.add(20);
        // arvore.add(7);

        int opcao=0;
        do {
            System.out.println("----------------------------------");
            opcao = menu();
            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    leia.nextLine();
                    String nome = leia.nextLine();

                    System.out.print("Digite a matricula do aluno: ");
                    int matricula = leia.nextInt();

                    Aluno aluno = new Aluno(nome,matricula);
                    arvore.add(aluno); // inserir
                    
                    System.out.println("Elemento inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o elemento a ser removido: ");
                    int elementoRemover = leia.nextInt();
                    // Implementar a remoção do elemento na árvore
                    System.out.println("Elemento removido com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite a matricula a ser buscado: ");
                    int matriculaBuscar = leia.nextInt();

                    Aluno alunoBusca = new Aluno("", matriculaBuscar);

                    Aluno alunoEncontrado = arvore.buscar(alunoBusca);

                    if (alunoEncontrado != null) {
                        System.out.println("Aluno encontrado!");
                        System.out.println(alunoEncontrado);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a árvore em pré-ordem:");
                    arvore.preOrder();// percurso 
                    System.out.println("Exibindo a árvore em ordem:");
                    arvore.inOrder();// percurso 
                    System.out.println("Exibindo a árvore em pós-ordem:");
                    arvore.postOrder();// percurso 
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao !=0);

    }
}
