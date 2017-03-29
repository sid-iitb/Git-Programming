package List_Old;

class BinaryTree
{
    static TreeNode root;
    static TreeNode insert(TreeNode node,int data)
    {
        if(node==null)
            node=new TreeNode(data);
        else
        {
            if(data <= node.data)
                node.left=insert(node.left, data);
            else
                node.right=insert(node.right, data);
            
        }
        return node;
    }
    static void printBinaryTree(TreeNode root, int level){
    if(root==null)
         return;
    printBinaryTree(root.right, level+1);
    if(level!=0){
        for(int i=0;i<level-1;i++)
            System.out.print("|\t");
            System.out.println("|-------"+root.data);
    }
    else
        System.out.println(root.data);
    printBinaryTree(root.left, level+1);
}  
    static void inorder(TreeNode node)
    {
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    static void preorder(TreeNode node)
    {
        if(node==null)
            return;
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static int size(TreeNode node)
    {
        if(node==null)
            return 0;
        else
            return (1+size(node.left)+size(node.right));
    }
    static int maxDepth(TreeNode node)
    {
        if(node==null)
            return 0;
        else
        {
            int leftn=maxDepth(node.left);
            int rightn=maxDepth(node.right);
            if(leftn>=rightn)
                return 1+leftn;
            else
                return 1+rightn;
        }
    }
    static int noOfLeaves(TreeNode node)
    {
       if(node == null)       
    return 0;
  if(node.left == null && node.right==null)      
    return 1;            
  else 
    return noOfLeaves(node.left)+noOfLeaves(node.right); 
    }
    static void mirror(TreeNode node)
    {
        if(node!=null)
        {
            mirror(node.left);
            mirror(node.right);
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
    }
    static int lowestNo(TreeNode node)
    {
        TreeNode current=node;
        while(current.left != null)
            current=current.left;
        return current.data;
    }
    static TreeNode insertadata(TreeNode node)
    {
        root=insert(root,15);
        root=insert(root,6);
        root=insert(root,18);
        root=insert(root,3);
        root=insert(root,2);
        root=insert(root,4);
        root=insert(root,7);
        root=insert(root,13);
        root=insert(root,9);
        root=insert(root,17);
       // root=insert(root,20);
        return root;
    }
    static TreeNode heighbalanced(TreeNode node)
    {
        root=insert(root,50);
        root=insert(root,17);
        root=insert(root,72);
        root=insert(root,12);
        root=insert(root,23);
        root=insert(root,54);
        root=insert(root,76);
        root=insert(root,9);
        root=insert(root,14);
        root=insert(root,19);
        root=insert(root,24);
        root=insert(root,52);
        root=insert(root,67);
        root=insert(root,75);
        root=insert(root,80);
        return root;
    }
    public static void main(String args[])
    {
        root=insert(root,15);
        root=insert(root,6);
        root=insert(root,18);
        root=insert(root,3);
        root=insert(root,2);
        root=insert(root,4);
        root=insert(root,7);
        root=insert(root,13);
        root=insert(root,9);
        root=insert(root,17);
        root=insert(root,20);
        System.out.println(printBinaryTree(root));
        System.out.println("The inorder traversal");
        inorder(root);
        //System.out.println("The pre-order traversal");
        //preorder(root);
        System.out.println("The lowest number is :- "+lowestNo(root));
        System.out.println("The size of tree is :- "+size(root));
        System.out.println("The max depth is :- "+maxDepth(root));
        System.out.println("The no of leaves is :- "+noOfLeaves(root));
        mirror(root);
        System.out.println("The new inorder traversal");
        inorder(root);
    }
}
