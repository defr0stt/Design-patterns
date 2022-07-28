package Command;

public class CreateCommand implements Command {
    @Override
    public String execute() {
        return "Ctrl+N";
    }
}
