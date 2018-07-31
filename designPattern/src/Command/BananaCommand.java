package Command;

public class BananaCommand extends Command {
    private Peddler peddler;

    public BananaCommand(Peddler peddler) {
        this.peddler = peddler;
    }

    @Override
    public void sail() {
        peddler.sailBanana();
        //下面可以记录日志等其它操作
        System.out.println("记录卖香蕉的日志");
    }
}
