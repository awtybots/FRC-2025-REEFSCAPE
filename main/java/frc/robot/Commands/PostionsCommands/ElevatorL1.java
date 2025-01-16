public class ElevatorL1 {
    private final Elevator elevator;

    public ElevatorL1(Elevator elevator) {
        this.elevator = elevator;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        if (!elevator.atTargetExtent()) return;
        elevator.setDegrees(ElevatorL1.ElevatorPosition);
    }

    @Override
    public void end(boolean interrupted) {
        elevator.hold();
    }
}
