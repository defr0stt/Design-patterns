package Command;

import java.util.*;

public class DirectorCommand {
    private static DirectorCommand directorCommand;
    private final Deque<Command> commandQueue = new ArrayDeque<>(){
        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            Iterator<Command> iterator = commandQueue.iterator();
            while (iterator.hasNext()){
                stringBuilder.append(iterator.next().execute());
                if(iterator.hasNext())
                    stringBuilder.append(", ");
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    };

    private DirectorCommand(){}

    public static DirectorCommand getInstance() {
        if(directorCommand == null)
            directorCommand = new DirectorCommand();
        return directorCommand;
    }

    public void executeCommand(Command command){
        commandQueue.add(command);
    }

    public boolean deleteLastCommand(){
        if(commandQueue.size() > 0) {
            commandQueue.pollLast();
            return true;
        }
        return false;
    }

    public String commandHistory(){
        return commandQueue.toString();
    }
}
