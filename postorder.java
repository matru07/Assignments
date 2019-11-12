class postorder{ 
  
  
   
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
  

   
    postorder() {  
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
  
  
    
	void postorder()
	{
		postorder(root);
	}
  

	void  postorder(Node root)
	{
		if(root != null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key);
		}
	}
  
  
    public static void main(String[] args) { 
        postorder tree = new postorder(); 

      
        tree.insert(25); 
        tree.insert(60); 
        tree.insert(330); 
        tree.insert(210); 
        tree.insert(710); 
        tree.insert(90); 
        tree.insert(45); 
  
     
		 	  System.out.println("PostOrder :");
          tree.postorder();		  
    } 
} 
