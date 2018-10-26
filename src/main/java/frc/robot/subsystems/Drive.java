package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

    /*
        1. 6 motors to power drivetrain
        2. 2 encoders for each side of the drivetrain
        3. 6 speed controllers to regulate motor rpm
    */
    public Drive() {



    }

    @Override
    protected void initDefaultCommand() {
        //Instantiate 6 speed controller objects
        /*
        TalonSRX mLeftMotor1 = new TalonSRX();
        TalonSRX mLeftMotor2 = new TalonSRX();
        TalonSRX mLeftMotor3 = new TalonSRX();
        TalonSRX mRightMotor1 = new TalonSRX();
        TalonSRX mRightMotor2 = new TalonSRX();
        TalonSRX mRightMotor3 = new TalonSRX();
        */
    }

    public void setMotion(double horizontal, double vertical)
    {
        //Calculate resultant velocity based on values of horizontal and vertical
        //Sets speed controller values based on the resultant velocity
    }

}