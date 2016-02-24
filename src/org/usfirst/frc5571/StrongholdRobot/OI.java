// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5571.StrongholdRobot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

import org.usfirst.frc5571.StrongholdRobot.subsystems.*;
import org.usfirst.frc5571.StrongholdRobot.commands.*;
import org.usfirst.frc5571.StrongholdRobot.Constants;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // AUTOGENERATED DECLARATIONS STARTED HERE - REMOVED TO USE XBOX //
    public JoystickButton aimHighShot;
    public JoystickButton aimLowShot;
    public JoystickButton aimBoulderPickup;
    public JoystickButton loadBoulder;
    public JoystickButton shootBoulder;
    public JoystickButton stopShooterWheels;
    public Joystick driveJoystick;
    public Joystick shooterJoystick;
    public Xbox360Controller xboxController;
    // AUTOGENERATED DECLARATIONS ENDED HERE - REMOVED TO USE XBOX //
    
    // XBOX CONTROLLER BUTTONS
    public JoystickButton raiseArms;
    public JoystickButton lowerArms;
    public JoystickButton shiftToHighGear;
    public JoystickButton shiftToLowGear;
    public JoystickButton shooterWheelsToIntake;
    public JoystickButton shooterWheelsToFastBall;
  
    public OI() {
        // AUTOGENERATED CONSTRUCTORS STARTED HERE - REMOVED TO USE XBOX //

        driveJoystick = new Joystick(0);
    	shooterJoystick = new Joystick(1);
        xboxController = new Xbox360Controller(2);

        
//        aimBoulderPickup = new JoystickButton(driveJoystick, 10);
//        aimBoulderPickup.whenPressed(new ShooterAimClosedLoop(800));
//        aimLowShot = new JoystickButton(driveJoystick, 8);
//        aimLowShot.whenPressed(new ShooterAimClosedLoop(40));
//        aimHighShot = new JoystickButton(driveJoystick, 6);
//        aimHighShot.whenPressed(new ShooterAimClosedLoop(100));
        
      aimBoulderPickup = new JoystickButton(xboxController, Constants.XBOX_AIM_PICKUP);
      aimBoulderPickup.whenPressed(new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_LOAD_SETPOINT));
      aimLowShot = new JoystickButton(driveJoystick, 8);
      aimLowShot.whenPressed(new ShooterAimClosedLoop(40));
      aimHighShot = new JoystickButton(xboxController, Constants.XBOX_AIM_HIGHSHOT);
      aimHighShot.whenPressed(new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_HIGHSHOT_SETPOINT));
      loadBoulder = new JoystickButton(xboxController, Constants.XBOX_SHOOTER_WHEELS_CAPTURE);
      loadBoulder.whenPressed(new ShooterWheelsIntake());
      loadBoulder.whenReleased(new ShooterWheelsStop());
      shootBoulder = new JoystickButton(xboxController, Constants.XBOX_SHOOTER_WHEELS_SHOOT);
      shootBoulder.whenPressed(new ShooterWheelsFastBall());
      shootBoulder.whenReleased(new ShooterWheelsSlowBall());
      stopShooterWheels = new JoystickButton(xboxController, Constants.XBOX_RIGHT_JOYSTICK_BUTTON);
      stopShooterWheels.whenPressed(new ShooterWheelsStop());
      shiftToHighGear = new JoystickButton(xboxController, Constants.XBOX_HIGH_GEAR_BUTTON);
      shiftToHighGear.whenPressed(new PneumaticsShifToHighGear());
      shiftToLowGear = new JoystickButton(xboxController, Constants.XBOX_LOW_GEAR_BUTTON);
      shiftToLowGear.whenPressed(new PneumaticsShiftToLowGear());
      lowerArms = new JoystickButton(xboxController, Constants.XBOX_ARMS_DOWN_BUTTON);
      lowerArms.whenPressed(new PneumaticsLowerArms());
      raiseArms = new JoystickButton(xboxController, Constants.XBOX_ARMS_UP_BUTTON);
      raiseArms.whenPressed(new PneumaticsRaiseArms());
      
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousDoNothing", new AutonomousDoNothing());
        SmartDashboard.putData("DriveWithJoysick", new DriveWithJoysick());
        SmartDashboard.putData("ShooterSetAngle", new ShooterSetAngle());
        SmartDashboard.putData("ShooterSetSpeed", new ShooterSetSpeed());
        SmartDashboard.putData("DriveStraight", new DriveStraight());
        SmartDashboard.putData("ShooterAimWithJoystick", new ShooterAimWithJoystick());
        SmartDashboard.putData("ShooterAimClosedLoop: highShotAngle", new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_HIGHSHOT_SETPOINT));
        SmartDashboard.putData("ShooterAimClosedLoop: lowShotAngle", new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_LOWSHOT_SETPOINT));
        SmartDashboard.putData("ShooterAimClosedLoop: boulderPickupAngle", new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_LOAD_SETPOINT));
        SmartDashboard.putData("ShooterAimByOffset: noOffset", new ShooterAimByOffset(0));
        SmartDashboard.putData("ShooterCaptureBoulder", new ShooterCaptureBoulder());
        SmartDashboard.putData("PneumaticsEnableCompressor", new PneumaticsEnableCompressor());
        SmartDashboard.putData("PneumaticsRaiseArms", new PneumaticsRaiseArms());
        SmartDashboard.putData("PneumaticsLowerArms", new PneumaticsLowerArms());
        SmartDashboard.putData("PneumaticsShiftToLowGear", new PneumaticsShiftToLowGear());
        SmartDashboard.putData("PneumaticsShifToHighGear", new PneumaticsShifToHighGear());
        SmartDashboard.putData("ShooterWheelsIntake", new ShooterWheelsIntake());
        SmartDashboard.putData("ShooterWheelsFastBall", new ShooterWheelsFastBall());
        SmartDashboard.putData("ShooterWheelsSlowBall", new ShooterWheelsSlowBall());
        SmartDashboard.putData("ShooterLaunchBoulder", new ShooterLaunchBoulder());
        SmartDashboard.putData("ShooterWheelsStop", new ShooterWheelsStop());

        // AUTOGENERATED CONSTRUCTORS ENDED HERE - REMOVED TO USE XBOX //
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }

    public Joystick getShooterJoystick() {
        return shooterJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public Xbox360Controller getXbox() {
    	return xboxController;
    
    }
}

