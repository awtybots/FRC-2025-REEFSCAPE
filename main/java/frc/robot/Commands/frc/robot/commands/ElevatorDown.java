package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Elevator;

public class ElevatorUp extends Command {
  private final Elevator elevator;

  public ElevatorDown(Elevator elevator) {
    this.elevator = elevator;

    addRequirements(elevator);
  }

  @Override
  public void execute() {
    elevator.down();
  }

  @Override
  public void end(boolean interrupted) {
    elevator.hold();
  }
}
