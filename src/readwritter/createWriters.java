///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package readwritter;
//
//
///**
// *
// * @author HP
// */
//public class createWriters implements Runnable{
//    int numWriters ;
//    public createWriters(int numWriters) {
//        this.numWriters=numWriters;
//    }
//    
//
//    @Override
//    public void run() {
//        for(int i=1;i<=numWriters;i++){
//              Writter w = new Writter((i+1)+"");
//                 w.start();
//                MainFrame.Threads.add(w.toString());
//                System.out.println(MainFrame.Threads);
//        }
//    }
//}
//    
//
//    
//    
//
