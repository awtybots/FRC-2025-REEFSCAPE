package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends SubsystemBase{
  private final CANSparkMax ElevatorMotor;

  public Elevator(int ElevatorMotorID) {
    ElevatorMotor = new CANSparkMax(ElevatorConstants.ElevatorMotor, CANSparkMax.MotorType.kBrushless);

  }

  // Spins intake motor to intake notes
  public void up() {
    ElevatorMotor.set(1);
  }

  public void down() {
    ElevatorMotor.set(-1);
  }

  public void hold() {
    ElevatorMotor.set(0);
  }

  @Override
  public void periodic() {

  }

  public void stop() {
    ElevatorMotor.stopMotor();
  }

}