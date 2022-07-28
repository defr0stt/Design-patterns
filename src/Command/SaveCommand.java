package Command;

public class SaveCommand implements Command {
    @Override
    public String execute() {
        return "Ctrl+S";
    }
}
