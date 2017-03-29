/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeFlattening;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sidhsaho
 */
public class TreeFindNode {
    static HashMap<String,String> keyValueMapping =new HashMap();
    //Find the falttenend key-value pairs for any node
    static HashMap TreeFindNode(TreeNode node,String search)
    {
        if(node==null)
            return null;
        
        
        for (Map.Entry<String,String> m : node.keyValueMap.entrySet()) {
            keyValueMapping.put(m.getKey(),m.getValue());
        }
        if(search == null ? node.name == null : search.equals(node.name))
        {
            System.out.println(keyValueMapping);
            return keyValueMapping;
        }
        else
        {
            
            TreeFindNode(node.left,search);
            TreeFindNode(node.right,search);
        }
        return null;
    }
    
    //Check for duplicate node
    static boolean duplicateFinding(TreeNode node, String search)
    {
        if(node==null)
            return false;
        
        if(search == null ? node.name == null : search.equals(node.name))
        {
            return true;
            
        }
            //System.out.println(node.data+ " ");
        else
        {
            
            duplicateFinding(node.left,search);
            duplicateFinding(node.right,search);
        }
        return false;
    }
    
    //For EveryNode finds the KeyValue Pairs
    
}
