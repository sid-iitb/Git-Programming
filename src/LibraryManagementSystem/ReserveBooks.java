/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sidhsaho
 */

public class ReserveBooks {
    static UserList studentInfo;
    static String bookname;
    static String studentName;
    static Map<String, UserList> burrowerList =new HashMap();
    static void bookConversion(String bookName, String studentName)
    {
        ReserveBooks.studentName=studentName;
        
        studentInfo=new UserList(studentName, new Date());
        // studentInfo.studentName=studentName;
        int hashcode=bookName.hashCode();
       // return ;
       ReserveBooks.bookname =bookName.substring(0,3)+""+hashcode;
       int avail=isAvailable(ReserveBooks.bookname);
        System.out.println(avail);
        if(avail==2)
        {
            assignBook(ReserveBooks.bookname);
        }
        else if(avail==1)
        {
            ReservationList.addToWaitList(ReserveBooks.bookname, studentName);
        }
        
    }
    static int isAvailable(String bookname)
    {
        
        if(AddBooks.bookList.get(bookname)==null){
            System.out.println("Book Not found");
            return 0;
        }
        else if(AddBooks.bookList.get(bookname) == 0)
        {
            return 1;
        }
        else if(AddBooks.bookList.get(bookname) > 0)
            return 2;
        return 3;
    }
    
    static boolean checkOneCopy()
    {
        UserList check=burrowerList.get(bookname);
        return check.find(check, bookname);
    }
    
    static void assignBook(String bookname)
    {
        int bookNumber =AddBooks.bookList.get(bookname);
        //UserList node=new UserList(studentInfo, new Date());
        AddBooks.bookList.put(bookname,bookNumber-1);
        UserList check=burrowerList.get(bookname);
        if (check == null) {
            check = new UserList(ReserveBooks.studentName, new Date());
            burrowerList.put(bookname, check);
        }
        burrowerList.put(bookname, check.insertatbegin(check, studentName, null));
    }
}
