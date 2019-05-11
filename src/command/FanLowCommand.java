package command;

public class CellingFanLowCommand implements Command {
    Fan fan;

    public CellingFanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.low();
    }
}
