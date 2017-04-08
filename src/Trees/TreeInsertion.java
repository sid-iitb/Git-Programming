/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sidhsaho
 */
public class TreeInsertion {
    //Insert Node to BST
    static HashMap<String,HashMap> nodesName=new HashMap<>();
    static TreeNode insertToTree(TreeNode node,String name,String keyValue[][])
    {
        if(TreeFindNode.duplicateFinding(node, name)==true)
            return node;
        
        
        
         if(node==null){
            node=new TreeNode(name,keyValue);
            //nodesName.put(name, TreeFindNode.TreeFindNode(node, name));
         }
        else
        {
            
            if(node.name.compareTo(name)>=0)
                node.left=insertToTree(node.left, name,keyValue);
            else
                node.right=insertToTree(node.right, name,keyValue);
            
        }
        return node;
    }
    
    
    
    //key Value pair for every node
    static void keyValueEveryNode(TreeNode root)
    {
        for (Map.Entry<String,HashMap> m : nodesName.entrySet()) {
            nodesName.put(m.getKey(), TreeFindNode.TreeFindNode(root, m.getKey()));
            System.out.println(TreeFindNode.TreeFindNode(root, m.getKey()));
        }
    }
    
    //Print Binary Tree
    static void printBinaryTree(TreeNode root, int level){
        //keyValueEveryNode(root);
        if(root==null)
            return;
        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.name);
        }
        else
            System.out.println(root.name);
        printBinaryTree(root.left, level+1);
}  
}
