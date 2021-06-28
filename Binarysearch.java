import javax.lang.model.util.ElementScanner14;

public class Binarysearch
{
    public class node
    {
        node left;
        node right;
        int data;
        public node(int data)
        {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
        public node root;
        public Binarysearch()
        {
            this.root = null;
        }
        public void insert(int data)
        {
            node newnode = new node(data);
            if(root == null)
            {
                root = newnode;
            }
            else
            {
                node currentnode = root , parentnode = null;
                {
                    while(true)
                    {
                        parentnode = currentnode;
                        if(currentnode.data < data)
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
        }
        public node search(node n , int value)
        {
            if(n == null)
            {
                System.out.println("Data not found in the tree");
            }
            else
            {
                if(n.data < value)
                {
                    n.left  = search(n.left, value);
                }
                else if(n.data > value)
                {
                    n.right = search(n.right, value);
                }
                else if(n.data == value)
                {
                    System.out.println("Data found :"+value);
                }
            }
            return n;
        }

    public static void main(String[] args) {
        Binarysearch bs = new Binarysearch();
        bs.insert(50);
        bs.insert(30);
        bs.insert(70);
        bs.insert(60);
        bs.insert(10);
        bs.insert(90);
        bs.search(bs.root, 70);

    }
    }
