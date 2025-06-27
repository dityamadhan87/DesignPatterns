package CommandPattern.undo;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // No action to perform
    }

    @Override
    public void undo() {
        // No action to undo
    }
}