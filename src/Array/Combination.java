/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author sidhsaho
 */
public class Combination {
    static String s="xyz";
    public static void main(String[] args) {
        //String s="xyz";
        StringBuffer output=new StringBuffer();
        combination(output,0);
    }
    
    static void combination(StringBuffer output,int index){
        for(int i=index;i<s.length();i++){
            output.append(s.charAt(i));
            System.out.println(output);
            combination(output, i+1);
            output.deleteCharAt(output.length()-1);
        }
    }
    
    
}
