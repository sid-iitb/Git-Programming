/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sidhsaho
 */
public class Main {

    public static void main(String[] args) {
        Print p=new Print();
        EvenThread ev=new EvenThread(p);
        ev.start();
        OddThread od=new OddThread(p);
        od.start();
        
    }

}

class Print {

    boolean isOdd = false;

    public synchronized void printOddNum(int num) {
        if (isOdd) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(num);
        isOdd = true;
        notify();

    }

    public synchronized void printEvenNum(int num) {
        if (!isOdd) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(num);
        isOdd = false;
        notify();

    }
}

class EvenThread extends Thread{
    Print p;

    public EvenThread(Print i) {
        p=i;
    }
    @Override
    public void run(){
        for(int i=1;i<101;i=i+2){
            p.printOddNum(i);
        }
    }
    
}

class OddThread extends Thread{
    Print p;

    public OddThread(Print i) {
        p=i;
    }
    @Override
    public void run(){
        for(int i=2;i<101;i=i+2){
            p.printEvenNum(i);
        }
    }
    
}