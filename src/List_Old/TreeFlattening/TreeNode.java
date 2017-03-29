/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeFlattening;

import java.util.HashMap;

/**
 *
 * @author sidhsaho
 */
public class TreeNode {
    TreeNode left;
    String name;
    HashMap<String,String> keyValueMap =new HashMap();
    TreeNode right;
    public TreeNode(String name,String keyValue[][]) {
        this.name = name;
        for (String[] keyValue1 : keyValue) {
            keyValueMap.put(keyValue1[0], keyValue1[1]);
        }
        
    }
}
