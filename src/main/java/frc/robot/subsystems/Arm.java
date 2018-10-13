package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/* List of Mechanical Components
    1. Motor to move arm up and down
    2. Speed controller
    3. Encoder to track movement
    4. Limit switches to prevent arm from damaging robot
    5. Magnet to keep track of arm's position
*/
public class Arm extends Subsystem {

    public Arm() {

        
    }

    @Override
    protected void initDefaultCommand() {

        //Call methods to move arm into stowed position. Stop moving when limit switches on lexan are closed.
        //When limit switches close, set a variable that stores position to zero
        }

    public double moveArm()
    {
        //Take an input from the XBox controller. 
        //Get the position of the joystick on the XBox controller
        //Interpret the position of the joystick into movement
        //Send the value to speed controller controlling motor's movements
        /*

        */
    }

    public double setAngle()
    {
        //Set the position of the arm
        //Send this to speed controller
    }

}