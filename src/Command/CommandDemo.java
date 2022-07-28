package Command;

public class CommandDemo {
    public static void main(String[] args) {
        DirectorCommand directorCommand = DirectorCommand.getInstance();
        directorCommand.executeCommand(new CreateCommand());
        directorCommand.executeCommand(new DeleteCommand());
        directorCommand.executeCommand(new SaveCommand());
        directorCommand.deleteLastCommand();
        System.out.println(directorCommand.commandHistory());
    }
}
