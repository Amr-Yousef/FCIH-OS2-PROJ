package readwritter;

public class Reader extends Thread {
    public static Controller c = new Controller();
    String name;
    public Reader(String name){
        this.name=name;
        this.setName(name);
    }

    @Override
    public void run() {
        MainFrame.c.startReading();

        MainFrame.jTextArea1.append("Balance Viewed by " + this.name + "\tBalance now is: " + c.getBalance() +"\n");
        MainFrame.c.stopReading();
    }

    @Override
    public String toString() {
        return  "Balance Viewed by Thread" + name + "Balance now is " + MainFrame.c.getBalance();
    }

}
