// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5571.StrongholdRobot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5571.StrongholdRobot.Constants;
import org.usfirst.frc5571.StrongholdRobot.Robot;
import org.usfirst.frc5571.StrongholdRobot.RobotMap;
import org.usfirst.frc5571.StrongholdRobot.Xbox360Controller;

/**
 *
 */
public class DriveWithJoysick extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveWithJoysick() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Xbox360Controller xbox;
    	Joystick logitech;
    	xbox = Robot.oi.getXbox();
    	logitech = Robot.oi.getDriveJoystick();
    	double magnitude;
    	double trigger_twist;
    	double turn;
    	
    	if (!logitech.getRawButton(Constants.LOGITECH3DPRO_TRIGGER_BUTTON)) { // Shooter has control
        	turn = xbox.getRawAxis(Constants.XBOX_DRIVING_TURN_JOYSTICK) * Constants.XBOX_TWIST_SCALE_FACTOR;
    	   	magnitude = xbox.getRawAxis(Constants.XBOX_DRIVING_MAGNITUDE_JOYSTICK) * Constants.XBOX_MAGNITUDE_SCALE_FACTOR;
    	   	trigger_twist = (((xbox.getRawAxis(2) * -1) + xbox.getRawAxis(3)) * Constants.XBOX_TRIGGER_TWIST_SCALE_FACTOR); 
    	   	turn = trigger_twist + turn;
    	} 		
    	
    	else
    	{
    		magnitude = logitech.getRawAxis(Constants.LOGITECH3DPRO_Y_AXIS) * Constants.LOGITECH_MAGNITUDE_SCALE_FACTOR;
        	turn = logitech.getRawAxis(Constants.LOGITECH3DPRO_Z_AXIS) * Constants.LOGITECH_TWIST_SCALE_FACTOR;
    	}
    	RobotMap.driveTrainRobotDrive21.arcadeDrive(magnitude,turn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
