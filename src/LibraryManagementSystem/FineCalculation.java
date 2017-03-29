/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.Map;

/**
 *
 * @author sidhsaho
 */
public class FineCalculation {
    static Map fine;
    static void fine(String bookname, String name)
    {
        fine=ReserveBooks.burrowerList;
        UserList line = (UserList) fine.get(bookname);
        
    }
}
