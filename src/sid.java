/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class sid {

    public void fun(Object o){
        System.out.println("in Sid1");
    }
    
    public static void main(String[] args){
        sid2 s = new sid2();
        s.fun("aa");
    }
}

class sid2 extends sid{
    public void fun(String s){
        System.out.println("in Sid2");
    }
}
