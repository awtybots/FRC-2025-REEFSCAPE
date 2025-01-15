package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends SubsystemBase {
  private final CANSparkMax ElevatorMotorRight;
  private final CANSparkMax ElevatorMotorLeft;

  public Elevator(int ElevatorMotorRightID, int ElevatorMotorLeftID) {
    ElevatorMotorRight =
        new CANSparkMax(ElevatorConstants.ElevatorMotorRightID, CANSparkMax.MotorType.kBrushless);
    ElevatorMotorLeft =
        new CANSparkMax(ElevatorConstants.ElevatorMotorLeftID, CANSparkMax.MotorType.kBrushless);
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
