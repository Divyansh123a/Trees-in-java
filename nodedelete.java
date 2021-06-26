import java.security.CryptoPrimitive;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler;

public class nodedelete {
    public class node
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
        public nodedelete()
        {
            this.root = null;
        }
    public void insertion(int data)
    {
     node newnode = new node(data);
     if(root == null)
     {
         root = newnode;
     }
     else{
         node currentnode = root , parentnode = null;
         while(true){
            parentnode = currentnode;
         if(data < currentnode.data)
         {
          currentnode = currentnode.left;
          if(currentnode == null)
          {
              parentnode.left = newnode;
              return;
          }
         }
         else
         {
             currentnode = currentnode.right;
             if(currentnode == null)
             {
                 parentnode.right = newnode;
                 return;
             }
         }
        }
     }
    }
    public node minnode(node n1)
    {
        if(n1.left!=null)
        {
            return minnode(n1.left);
        }
        else
        {
            return root;
        }
    }
    public node deletenode(node n2 ,int value)
    {
       if(n2 == null)
       {
           return null;
       }
       else
       {
           if(value<n2.data)
           {
               n2.left = deletenode(n2.left , value);
           }
           else if(value>n2.data)
           {
               n2.right = deletenode(n2.right , value);
           }
           else
           {
               if(n2.left == null && n2.right == null)
               {
                   n2 = null;
               }
               else if(n2.right == null)
               {
                   n2 = n2.left;
               }
               else if(n2.left == null)
               {
                   n2 = n2.right;
               }
               else 
               {
                   node temp = minnode(n2.right);
                   n2.data = temp.data;
                   n2.right = deletenode(n2.right, temp.data);
               } 
           }
           return n2;
       }
    }
    public void inorderTraversal(node n)
    {
        if(root == null)
        {
            System.out.println("Tree is Empty Bro");
        }
        else{
            if(n.left!=null)
            {
                inorderTraversal(n.left);
            }
            System.out.println(n.data);
            if(n.right!=null)
            {
                inorderTraversal(n.right);
            }
        }
    }
    public static void main(String[] args) {
        nodedelete nd = new nodedelete();
        nd.insertion(10);
        nd.insertion(20);
        nd.insertion(30);
        nd.insertion(40);
        nd.insertion(50);
        nd.insertion(25);
        nd.insertion(80);
        nd.insertion(100);
        nd.inorderTraversal(nd.root);
        node delnode = null;
        delnode = nd.deletenode(nd.root, 30);
        nd.inorderTraversal(nd.root);
    }
    }

