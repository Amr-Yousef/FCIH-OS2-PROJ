package readwritter;

public class Writter extends Thread {
    String name;
    public static Controller c = new Controller();
    public Writter(String name) {
        this.name=name;
        this.setName(name);
    }


    @Override
    public void run() {

        MainFrame.c.startWriting();
        MainFrame.c.write("Money: ");
        MainFrame.jTextArea1.append("Balance Updated by " + this.name + "\tBalance now is: " + c.getBalance() +"\n");
        MainFrame.c.stopWriting();
    }
    @Override

    public String toString() {
        return  "Balance Updates by Thread: " + name + "Balance now is " + MainFrame.c.getBalance();
    }
}
