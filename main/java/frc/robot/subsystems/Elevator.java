package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends SubsystemBase {
  private final CANSparkMax ElevatorMotorRight;

  public Elevator(int ElevatorMotorRightID, int ElevatorMotorLeftID) {
    ElevatorMotorRight =
        new CANSparkMax(ElevatorConstants.ElevatorMotorRight, CANSparkMax.MotorType.kBrushless);
    ElevatorMotorLeft =
        new CANSparkMax(ElevatorConstants.ElevatorMotorLeft, CANSparkMax.MotorType.kBrushless);
  }

  // Spins intake motor to intake notes
  public void up() {
    ElevatorMotorRight.set(1);
    ElevatorMotorLeft.set(1);
  }

  public void down() {
    ElevatorMotorRight.set(-1);
    ElevatorMotorLeft.set(-1);
  }

  public void hold() {
    ElevatorMotorRight.set(0);
    ElevatorMotorLeft.set(0);
  }

  @Override
  public void periodic() {}

  public void stop() {
    ElevatorMotorRight.stopMotor();
    ElevatorMotorLeft.stopMotor();
  }
}
