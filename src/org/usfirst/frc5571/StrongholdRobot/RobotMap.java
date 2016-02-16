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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveLeftWheels;
    public static CANTalon driveRightWheels;
    public static RobotDrive driveRobotDrive21;
    public static CANTalon shooterLeftBoulderWheel;
    public static CANTalon shooterRightBoulderWheel;
    public static CANTalon shooterShooterLoader;
    public static Compressor pneumaticsCompressor;
    public static Solenoid pneumaticsLeftArm;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static CANTalon driveLeftWheelsSlave;
    public static CANTalon driveRightWheelsSlave;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveLeftWheels = new CANTalon(1);
        LiveWindow.addActuator("Drive", "LeftWheels", driveLeftWheels);
        
        driveRightWheels = new CANTalon(2);
        LiveWindow.addActuator("Drive", "RightWheels", driveRightWheels);
        
        driveRobotDrive21 = new RobotDrive(driveLeftWheels, driveRightWheels);
        
        driveRobotDrive21.setSafetyEnabled(true);
        driveRobotDrive21.setExpiration(0.1);
        driveRobotDrive21.setSensitivity(0.5);
        driveRobotDrive21.setMaxOutput(1.0);
        driveRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        shooterLeftBoulderWheel = new CANTalon(5);
        LiveWindow.addActuator("Shooter", "LeftBoulderWheel", shooterLeftBoulderWheel);
        
        shooterRightBoulderWheel = new CANTalon(6);
        LiveWindow.addActuator("Shooter", "RightBoulderWheel", shooterRightBoulderWheel);
        
        shooterShooterLoader = new CANTalon(7);
        LiveWindow.addActuator("Shooter", "ShooterLoader", shooterShooterLoader);
        
        pneumaticsCompressor = new Compressor(0);
        
        
        pneumaticsLeftArm = new Solenoid(0, 0);
        LiveWindow.addActuator("Pneumatics", "LeftArm", pneumaticsLeftArm);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        driveLeftWheelsSlave = new CANTalon(3);
        LiveWindow.addActuator("Drive", "LeftWheelsSlavq", driveLeftWheelsSlave);
        driveLeftWheelsSlave.changeControlMode(TalonControlMode.Follower);
        driveLeftWheelsSlave.set(driveLeftWheels.getDeviceID());
        
        driveRightWheelsSlave = new CANTalon(4);
        LiveWindow.addActuator("Drive", "RightWheelsSlavq", driveRightWheelsSlave);
        driveRightWheelsSlave.changeControlMode(TalonControlMode.Follower);
        driveRightWheelsSlave.set(driveRightWheels.getDeviceID());
        
        driveRightWheels.setInverted(true);
        driveLeftWheelsSlave.setInverted(true);
        

    }
}