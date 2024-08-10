public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);//root
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.delete(20);//delete

        System.out.println("In order traversal: ");
        tree.inorderTraversal();

        System.out.println("Pre order traversal: ");
        tree.preorderTraversal();

        System.out.println("Post order traversal: ");
        tree.postorderTraversal();


    }
}

