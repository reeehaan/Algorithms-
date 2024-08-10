public class BinaryTree{
    TreeNode root;

    public BinaryTree(){
        this.root = null;
    }
    // method of inserting value to binary tree
    public void insert(int value){
        root =insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode root, int value) {
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRecursive(root.left ,value);
        }else if(value > root.value){
            root.right = insertRecursive(root.right , value);
        }
        return root;
    }
    //method of delete node.
    public void delete(int value){
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode root, int value) {
        if(root == null){
            return  root;
        }
        if(value < root.value){
            root.left = deleteRecursive(root.left , value);
        }
        else if(value > root.value){
            root.right = deleteRecursive(root.right , value);
        }
            else{
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }
            // Node with two children: Get the inorder successor
                root.value = minValue(root.right);

                root.right = deleteRecursive(root.right , value);

            }
            return root;
    }
    // Method to find the minimum value in a tree
    private int minValue(TreeNode right) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }


    //inorder traversal
    public void inorderTraversal(){
        inorderRecursive(root);
    }

    private void inorderRecursive(TreeNode root) {
        if(root != null){
            inorderRecursive(root.left);    //travel left subtree
            System.out.print(root.value + " " ); //visit node
            inorderRecursive(root.right); //travel right subtree
        }
    }

    //preorder traversal
    public void preorderTraversal(){
        preorderRecursive(root);
    }

    private void preorderRecursive(TreeNode root) {
        if(root != null){
            System.out.print(root.value + " "); //visit node
            preorderRecursive(root.left);//travel left subtree
            preorderRecursive(root.right);//travel right subtree
        }
    }

    public void postorderTraversal(){
        postorderRecursive(root);
    }

    private void postorderRecursive(TreeNode root) {
        if(root != null){
            postorderRecursive(root.left); //travel left subtree
            postorderRecursive(root.right); //travel right subtree
            System.out.print(root.value + " "); //visit node
        }
    }

}
