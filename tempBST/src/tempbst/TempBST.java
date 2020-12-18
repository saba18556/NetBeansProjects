
package tempbst;

class BSTNode{
    BSTNode left, right;
	     int data;
	 
	     /* Constructor */
	     public BSTNode()
	     {
	         left = null;
	         right = null;
	         data = 0;
	     }
	     /* Constructor */
	     public BSTNode(int n)
	     {
	         left = null;
	         right = null;
	         data = n;
	     }
	     /* Function to set left node */
	     public void setLeft(BSTNode n)
	     {
	         left = n;
	     }
	     /* Function to set right node */ 
	     public void setRight(BSTNode n)
	     {
	         right = n;
	     }
	     /* Function to get left node */
	     public BSTNode getLeft()
	     {
	         return left;
	     }
	     /* Function to get right node */
	     public BSTNode getRight()
	     {
	         return right;
	     }
	     /* Function to set data to node */
	     public void setData(int d)
	     {
	         data = d;
	     }
	     /* Function to get data from node */
	     public int getData()
	     {
	         return data;
	     }     
	 
}

public class TempBST {
    
    private BSTNode root;
    
    /* Constructor */
    public TempBST()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    
    public void insert( int data)
    {
    	root= insert(root,data);
    	
    }
   /* public void insert(BSTNode r, int data)
    {
    	BSTNode n= new BSTNode(data);
    	if (r== null)
    		root= n;
    	else
    	 {  
    		BSTNode temp=root;
    	    if (data< temp.getData() )
    	    	insert (temp.getLeft(),data);
    	    else
    	    	insert (temp.getRight(),data);
    	 }
     //   root = insert(root, data);
    } */
    /* Function to insert data recursively */
    private BSTNode insert(BSTNode node, int data)
    {
    	
    	
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    /* Functions to delete data */
    public void delete(int k)
    {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else
        {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    private BSTNode delete(BSTNode root, int k)
    {
        BSTNode p, p2, n;
        if (root.getData() == k)  // if we want to delete root node
        {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null) // leaf node deletion
                return null;
            else if (lt == null)  //  when one child left does not exist
            {
                p = rt;
                return p;
            }
            else 
            	
            	if (rt == null) // when one child right does not exist
            		
            {
                p = lt;
                return p;
            }
            else
            {// two children // pick the right and move to the left most child
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData()) // either I have to go left
        {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(), k); // I have to search at right
            root.setRight(n);             
        }
        return root;
    }
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(BSTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* Functions to search for an element */
    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(BSTNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BSTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BSTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }     

    
    public static void main(String[] args) {
        
    }
    
}
