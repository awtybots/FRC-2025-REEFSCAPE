public class ElevatorGroundPickUp {

  private final Elevator elevator;

  public ElevatorGroundPickUp(Elevator elevator) {
    this.elevator = elevator;

    addRequirements(elevator);
  }

  @Override
  public void execute() {
    if (!elevator.atTargetExtent()) return;
    elevator.setDegrees(ElevatorGroundPickUp.ElevatorPosition);
  }

  @Override
  public void end(boolean interrupted) {
    elevator.hold();
  }
}
