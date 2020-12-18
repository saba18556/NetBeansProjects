
package bst;


public class BST {
    
    class Node{
        int key;
        Node left, right;
        
        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    
    Node root;
    
    BST(){
        root = null;
    }
    
    Node BSTinsert(Node node, int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key<node.key){
            node.left = BSTinsert(node.left, key);
        }
        else if(key>node.key){
            node.right = BSTinsert(node.right, key);
        }
        return node;
    }
    
    public void insert(int key){
        root = BSTinsert(root, key);
    }
    
    public boolean isLeaf(Node node){
        if(node ==null) return false;
        if(node.left == null && node.right== null) return true;
        return false;
    }
    
    public int sum_left_leaves(Node node){
        
        int sum = 0;
        if(node!=null){
            if(isLeaf(node.left)){
                sum += node.left.key;
            }
            else{
                sum += sum_left_leaves(node.left);
            }
            sum += sum_left_leaves(node.right);
        }
        return sum;
    }
    
    public boolean full_tree(Node node){
        if(node==null) return true;
        if(node.left == null && node.right == null) return true;
        if((node.left!=null)&&(node.right!=null)){
            return full_tree(node.left) && full_tree(node.right);
        }
        return false;
    }

    
    public static void main(String[] args) {
        
        System.out.println("Q1:\n");
        // Binary Tree 
        /*       8
               /   \        
              3     10
             / \      \
            1   6      14
               / \     /
              4   7   13  
        */
        
        BST tree1 = new BST();
        tree1.insert(8);
        tree1.insert(3);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(4);
        tree1.insert(7);
        tree1.insert(10);
        tree1.insert(14);
        tree1.insert(13);
        System.out.println("Sum: "+tree1.sum_left_leaves(tree1.root));
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Q2:\n");
        BST trees = new BST();
        trees.insert(8);
        trees.insert(3);
        trees.insert(1);
        trees.insert(6);
        trees.insert(10);
        trees.insert(9);
        trees.insert(14);
        System.out.println("Is tree1 a full tree? "+tree1.full_tree(tree1.root));
        System.out.println("Is tree2 a full tree? "+trees.full_tree(trees.root));
    }
    
}
