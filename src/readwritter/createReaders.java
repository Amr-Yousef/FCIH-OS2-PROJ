///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package readwritter;
//
//import static readwritter.MainFrame.Threads;
//
///**
// *
// * @author HP
// */
//public class createReaders implements Runnable{
//    int numReader;
//    public createReaders(int numReader) {
//        this.numReader=numReader;
//    }
//
//    @Override
//    public void run() {
//         for(int i=1;i<=numReader;i++){
//              Reader r = new Reader((i+1)+"");
//                 r.start();
//                MainFrame.Threads.add(r.toString());
//        }
//    }
//    
//    
//    
//}
