/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritter;

/**
 *
 * @author HP
 */
public class Reader extends Thread {
    String name;
    public Reader(String name){
        this.name=name;
        this.setName(name);
    }

    @Override
    public void run() {
           MainFrame.c.startReading();
          // MainFrame.c.read();
           System.out.println("Balance Viewed by Thread" + Thread.currentThread().getName() + " Balance now is " + MainFrame.c.getBalance());
           MainFrame.c.stopReading();
       
    }

    @Override
    public String toString() {
        return  "Balance Viewed by Thread" + name + " Balance now is " + MainFrame.c.getBalance();
    }
    
    
}
