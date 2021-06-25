public class Inorder {
    class node
    {
        int data;
        node left;
        node right;
        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public node root;
    public Inorder()
    {
        this.root = null;
    }
    public void insert(int data)
    {
        node newnode = new node(data);
        if(root==null)
        {
          root = newnode;
          return;
        }
        else{
            node current = root, parent = null;
            while(true)
            {
                parent = current;
                if(data < current.data)
                {
                    current = current.left;
                    if(current == null)
                    {
                        parent.left = newnode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null)
                    {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }
    public void inorderTraversal(node node) {  
  
        //Check whether tree is empty  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
         }  
        else {  

            if(node.left!= null)  
                inorderTraversal(node.left);  
            System.out.print(node.data + " ");  
            if(node.right!= null)  
                inorderTraversal(node.right);  

        }  
    }  
    public static void main(String[] args) {  
  
        Inorder bt = new Inorder();  
        //Add nodes to the binary tree  
        bt.insert(50);  
        bt.insert(30);  
        bt.insert(70);  
        bt.insert(60);  
        bt.insert(10);  
        bt.insert(90);  

        System.out.println("Binary search tree after insertion:");  
        //Displays the binary tree  
        bt.inorderTraversal(bt.root); 
}
}
