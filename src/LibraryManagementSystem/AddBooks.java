/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sidhsaho
 */
public class AddBooks {
    static Map<String, Integer> bookList =new HashMap();
    
    static void add(String bookName)
    {
        int hashcode=bookName.hashCode();
        String insertString = bookName.substring(0,3)+""+hashcode;
        if(bookList.containsKey(insertString))
        {
            bookList.put(insertString, bookList.get(insertString)+1 );
        }
        else
            bookList.put(insertString, 1 );
    }
    static void display()
    {
        //System.out.println(bookList);
       Iterator it=bookList.entrySet().iterator();
       
    }
    public static void main(String args[])
    {
        add("SID");
        add("ADI");
        add("SID");
        display();
    }
    
}
