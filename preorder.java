class preorder { 
  
  
   
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
  

   
    preorder() {  
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
  
  
    
	void preorder()
	{
		preorder(root);
	}
	
  

	void  preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
  
  
    public static void main(String[] args) { 
        preorder tree = new preorder(); 

      
        tree.insert(25); 
        tree.insert(60); 
        tree.insert(330); 
        tree.insert(210); 
        tree.insert(710); 
        tree.insert(90); 
        tree.insert(45); 
  
     
        
          
		  System.out.println("PreOrder :");
         tree.preorder();
		 			  
    } 
} 
