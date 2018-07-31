package Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands=new ArrayList<Command>();

    public void setCommands(Command command){
        commands.add(command);
    }

    public void sail(){
        for (Command command: commands) {
            command.sail();
        }
    }
}
