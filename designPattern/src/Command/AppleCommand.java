package Command;

public class AppleCommand extends Command {

    private Peddler peddler;

    public AppleCommand(Peddler peddler) {
        this.peddler = peddler;
    }

    @Override
    public void sail() {
        peddler.sailApple();
        //下面可以记录日志等其它操作
        System.out.println("记录卖苹果的日志");
    }
}
