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

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.USBCamera;
import edu.wpi.first.wpilibj.CameraServer;








import org.usfirst.frc5571.StrongholdRobot.commands.*;
import org.usfirst.frc5571.StrongholdRobot.subsystems.*;

import com.kauailabs.navx.frc.AHRS;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.SizeType;
import com.ni.vision.NIVision;
import com.ni.vision.VisionException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Shooter shooter;
    public static Pneumatics pneumatics;
    public static CameraMast cameraMast;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static AHRS ahrs;
    public static CameraServer server;
    public static USBCamera shootingCamera;
    public static USBCamera driveCameraFront;
    public static USBCamera driveCameraRight;
    public static USBCamera driveCameraLeft;
    public static USBCamera driveCameraRear;
    public static Image image;
	private USBCamera currentCamera;
	private int frameUpdateCounter;
	public static SendableChooser chooser;
	

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        shooter = new Shooter();
        pneumatics = new Pneumatics();
        cameraMast = new CameraMast();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        server = CameraServer.getInstance();
        server.setSize(1); // 320 x 240
        server.setQuality(75);
        image = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);

//        try {
//            USBCamera shootingCamera = new USBCamera("cam0");
//           // shootingCamera.openCamera();
//            shootingCamera.setFPS(30);
//            shootingCamera.setExposureAuto();
//            shootingCamera.updateSettings();
//            //shootingCamera.startCapture();
//          } catch (VisionException ex) {
//            DriverStation.reportError(
//                "Error when starting the Shooting camera: "  + ex.getMessage(), true);
//          }
       
       
       //shootingCamera.startCapture();
       
       driveCameraFront = new USBCamera("cam0");
       driveCameraFront.setFPS(15);
       driveCameraFront.setExposureAuto();
       driveCameraFront.updateSettings();
       
       driveCameraLeft = new USBCamera("cam1");
       driveCameraLeft.setFPS(15);
       driveCameraLeft.setExposureAuto();
       driveCameraLeft.updateSettings();
      
       
       driveCameraRight = new USBCamera("cam2");
       driveCameraRight.setFPS(15);
       driveCameraRight.setExposureAuto();
       driveCameraRight.updateSettings();
      
       shootingCamera = new USBCamera("cam3");
       shootingCamera.setFPS(15);
       shootingCamera.setExposureAuto();
       shootingCamera.updateSettings();
       
      currentCamera = driveCameraFront;
      currentCamera.startCapture();
      frameUpdateCounter = 0;
       
//        driveCameraFront = new USBCamera("cam1");
//        driveCameraRight = new USBCamera("cam2");
//        driveCameraRear = new USBCamera("cam3");
//        driveCameraLeft = new USBCamera("cam4");
       // server.setSize(Constants.CAMERA_160_x_120);
//        server.setQuality(75);

        
//        try {
//            USBCamera shootingCamera = new USBCamera("cam0");
//            shootingCamera.openCamera();
//            shootingCamera.setFPS(30);
//            shootingCamera.setSize(160, 120);
           // shootingCamera.startCapture();
//          } catch (VisionException ex) {
//            DriverStation.reportError(
//                "Error when starting the Shooting camera: "  + ex.getMessage(), true);
//          }
       // server.startAutomaticCapture("cam0");
        //.startAutomaticCapture("cam1");
//        try {
//            USBCamera driveCameraFront = new USBCamera("cam1");
//            driveCameraFront.openCamera();
//            driveCameraFront.setFPS(30);
//            //driveCameraFront.startCapture();
//          } catch (VisionException ex) {
//            DriverStation.reportError(
//                "Error when starting the Front Drive camera: "  + ex.getMessage(), true);
//          }
     //   shootingCamera = new USBCamera("cam0");
     //   driveCameraFront = new USBCamera("cam1");
//        driveCameraRight = new USBCamera("cam2");
//        driveCameraRear = new USBCamera("cam3");
//        driveCameraLeft = new USBCamera("cam4");
     //   server.startAutomaticCapture(shootingCamera);
     //   server.startAutomaticCapture(driveCameraFront);
//        shootingCamera.stopCapture();
//        shootingCamera.closeCamera();
//        driveCameraFront.openCamera();
//        driveCameraFront.startCapture();

        //the camera name (ex "cam0") can be found through the roborio web interface
//        server.startAutomaticCapture("cam0");
        
	
     // Initialize Subsystems
        
    // Shooter
        shooter.initShooter();
        
//    // Gyro
//        try {
//		/* Communicate w/navX MXP via the MXP SPI Bus.                                     */
//		/* Alternatively:  I2C.Port.kMXP, SerialPort.Port.kMXP or SerialPort.Port.kUSB     */
//		/* See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface/ for details. */
//	
//		ahrs = new AHRS(SerialPort.Port.kUSB);
//	
//		//ahrs = new AHRS(SPI.Port.kMXP); 
//		//SerialPort serialPort = new SerialPortJNI();
//	
//	
//	} catch (RuntimeException ex ) {
//		DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
//	} 

	
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();      

        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        autonomousCommand = new AutonomousDoNothing();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS chooser = new SendableChooser();
        chooser = new SendableChooser();
		chooser.addDefault("1) Do Nothing", new AutonomousDoNothing());
		chooser.addObject("2) Low Bar", new AutonomousLowBar());
		chooser.addObject("3) Portcullis", new AutonomousPortcullis());
		chooser.addObject("3) Rough Terrain", new AutonomousRoughTerrain());
		chooser.addObject("4) Moat", new AutonomousMoat());


		

		// show the autonomous modes
		SmartDashboard.putData("AutonomousModes", chooser);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        int pointOfView;
        frameUpdateCounter++;
        boolean cameraSwitchFlag = false;
        pointOfView = Robot.oi.driveJoystick.getPOV(0);
        SmartDashboard.putNumber("POV", pointOfView);
        if (pointOfView == 0)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera =  driveCameraFront;
        }
        else if (pointOfView == 90)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = driveCameraRight;
        }
        else if (pointOfView == 270)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = driveCameraLeft;
        }
        else if (pointOfView == 180)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = shootingCamera;
        }
        if (cameraSwitchFlag) {
        currentCamera.startCapture();
        }
        currentCamera.getImage(image);
        Robot.server.setImage(image); 
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
//    	autonomusFlag = true;
        // schedule the autonomous command (example)
        RobotMap.driveTrainLeftWheels.setSafetyEnabled(false);
        RobotMap.driveTrainLeftWheelsSlave.setSafetyEnabled(false);
        RobotMap.driveTrainRightWheels.setSafetyEnabled(false);
        RobotMap.driveTrainRightWheelsSlave.setSafetyEnabled(false);


    	autonomousCommand = (Command) chooser.getSelected();
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
        // Update xboxcontroller status;
        SmartDashboard.putBoolean("XboxAButton", oi.getXbox().getRawButton(1));
        SmartDashboard.putDouble("XboxRghtX", oi.getXbox().getX(Hand.kRight));
        
        Scheduler.getInstance().run();
        int pointOfView;
        frameUpdateCounter++;
        boolean cameraSwitchFlag = false;
        pointOfView = Robot.oi.driveJoystick.getPOV(0);
        SmartDashboard.putNumber("POV", pointOfView);
        if (pointOfView == 0)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera =  driveCameraFront;
        }
        else if (pointOfView == 90)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = driveCameraRight;
        }
        else if (pointOfView == 270)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = driveCameraLeft;
        }
        else if (pointOfView == 180)
        {
        	cameraSwitchFlag = true;
        	shootingCamera.stopCapture();
        	driveCameraFront.stopCapture();
        	driveCameraLeft.stopCapture();
        	driveCameraRight.stopCapture();
        	currentCamera = shootingCamera;
        }
        if (cameraSwitchFlag) {
        currentCamera.startCapture();
        }
        currentCamera.getImage(image);
        Robot.server.setImage(image); 
    }
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
