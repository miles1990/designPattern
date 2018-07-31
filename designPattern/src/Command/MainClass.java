package Command;

public class MainClass {
    public static void main(String[] args) {
        Peddler peddler=new Peddler();
        Command appleCommand=new AppleCommand(peddler);
        Command bananaCommand=new BananaCommand(peddler);

        Waiter waiter=new Waiter();
        waiter.setCommands(appleCommand);
        waiter.setCommands(bananaCommand);
        waiter.sail();
    }
}
