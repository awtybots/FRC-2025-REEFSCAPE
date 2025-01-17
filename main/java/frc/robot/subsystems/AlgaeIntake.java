import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AlgaeIntake extends SubsystemBase {
    private final CANSparkMax AlgaeIntakeMotor;
    public AlgaeIntake(int AlgaeIntakeMotorID) {
    AlgaeIntakeMotor =
        new CANSparkMax(AlgaeIntakeConstants.AlgaeIntakeMotorID, CANSparkMax.MotorType.kBrushless);
    
    }
    public void RotateRight() {
        AlgaeIntakeMotor.set(1);
      }
    
      public void down() {
       AlgaeIntakeMotor.set(-1);
      }
    
      public void hold() {
        AlgaeIntakeMotor.set(0);
      }
    
  @Override
  public void periodic() {}

  public void stop() {
    AlgaeIntakeMotor.stopMotor();
  }
}   
