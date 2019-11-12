class bst_inorder { 
  
  
   
 class Node { 
        int key;
 
        Node left, right; 

  
        public Node(int item)
 { 
            key = item; 
            left = right = null; 
        } 
    } 
  

    Node root; 
  

   
    bst_inorder() {  
        root = null;  
    } 

  
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    Node insertRec(Node root, int key) { 
  
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
  
  
    void inorder()  { 
       inorderRec(root); 
    } 
  
  
    void inorderRec(Node root) { 
        if (root != null) {
			inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
	
	
  
    public static void main(String[] args) { 
        bst_inorder tree = new bst_inorder(); 

      
        tree.insert(25); 
        tree.insert(60); 
        tree.insert(330); 
        tree.insert(210); 
        tree.insert(710); 
        tree.insert(90); 
        tree.insert(45); 
  
     
        tree.inorder();
          		  
    } 
} 
