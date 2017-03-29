/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author sidhsaho
 */
public class ReservationList {
    static Map<String, UserList> waitList =new HashMap();
    static void addToWaitList(String bookName, String studentName)
    {
        //UserList user=new UserList(studentName, null);
        UserList users= waitList.get(bookName);
        users.insertatbegin(users, studentName, null);
        waitList.put(bookName, users);
    }
   
}
