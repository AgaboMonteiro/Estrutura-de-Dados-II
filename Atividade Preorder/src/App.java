public class App {
    public static void main(String[] args) throws Exception {

        //Criaçao arvore
        BinarySearchTree <Integer> tree = new BinarySearchTree<>();

        //valores inseridos
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        //exibe resultado
        System.out.println("Percurso preOrder:");
        tree.preOrder();

        BinarySearchTree <Integer> tree2 = new BinarySearchTree<>();

        //valores inseridos
        tree2.add(80);
        tree2.add(60);
        tree2.add(40);
        tree2.add(20);
        tree2.add(70);
        tree2.add(30);
        tree2.add(50);

        //exibe resultado
        System.out.println("\nPercurso preOrder **valores alterados**:");
        tree2.preOrder();

        BinarySearchTree <Integer> emptyTree= new BinarySearchTree<>();

        System.out.println("\nArvore vazia");
        emptyTree.preOrder();

        BinarySearchTree <Integer> oneTree = new BinarySearchTree<>();
        oneTree.add(80);

        System.out.println("\nArvore com apenas um elemento");
        oneTree.preOrder();
    }
}
