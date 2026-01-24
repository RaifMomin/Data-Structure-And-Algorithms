public class BinarySearchTree {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    Node root;
    public Node insert(Node root,int data){
        if(root==null){
            root= new Node(data);
        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }
        if(root.data<data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    public void inorder(Node temp){
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }
    public void preorder(Node temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        inorder(temp.left);
        inorder(temp.right);
    }
    public void postorder(Node temp){
        if(temp==null){
            return;
        }
        inorder(temp.left);
        inorder(temp.right);
        System.out.print(temp.data+" ");
    }
    public Node highest(Node temp){
        if(temp==null){
            return null;
        }
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;

    }
    public Node Delete(Node temp,int data){
        if(temp==null){
            return null;
        }
        else if(temp.data>data){
            temp.left=Delete(temp.left,data);
        }
        else if(temp.data<data){
            temp.right=Delete(temp.right,data);
        }
        else{
            if(temp.right==null && temp.left==null){
                return null;
            }
            else if(temp.left==null){
                return temp.right;
            }
            else if(temp.right==null){
                return temp.left;
            }
                Node maxpre = highest(temp.left);
                temp.data=maxpre.data;
                temp.left=Delete(temp.left,temp.data);
        }
        return temp;


    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root=bst.insert(bst.root,45);
        bst.root=bst.insert(bst.root,20);
        bst.root=bst.insert(bst.root,33);
        bst.root=bst.insert(bst.root,15);
        bst.inorder(bst.root);
        System.out.println();
        bst.Delete(bst.root,20);
        bst.inorder(bst.root);
    }




}