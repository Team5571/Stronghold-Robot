package org.usfirst.frc5571.StrongholdRobot;

public class Constants {
	//*********************************************************************************
	// DriveTrain Constants
	public final static double DRIVE_TRAIN_POSITION_Kp							= 0.0;
	public final static double DRIVE_TRAIN_POSITION_Ki							= 0.0;
	public final static double DRIVE_TRAIN_POSITION_Kd							= 0.0;
	public final static double DRIVE_TRAIN_POSITION_Kf							= 0.0;
	
	public final static double DRIVE_TRAIN_VELOCITY_Kp							= 0.0;
	public final static double DRIVE_TRAIN_VELOCITY_Ki							= 0.0;
	public final static double DRIVE_TRAIN_VELOCITY_Kd							= 0.0;
	public final static double DRIVE_TRAIN_VELOCITY_Kf							= 0.0;
	
	// Drive train tuning parmeters used in 2015 Recycle Rush Robot
	static double FAST_DRIVE_MAGNITUDE_SCALE = 0.5;
	static double FAST_DRIVE_TWIST_SCALE = 0.75;
	static double FINE_DRIVE_MAGNITUDE_SCALE = 0.3;
	static double FINE_DRIVE_TWIST_SCALE = 0.45;

	
	//*********************************************************************************
	//Shooter Constants
	public final static double SHOOTER_ANGLE_POSITION_Kp							= 0.0;
	public final static double SHOOTER_ANGLE_POSITION_Ki							= 0.0;
	public final static double SHOOTER_ANGLE_POSITION_Kd							= 0.0;
	public final static double SHOOTER_ANGLE_POSITION_Kf							= 0.0;
	
	public final static double SHOOTER_WHEELS_VELOCITY_Kp							= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Ki							= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Kd							= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Kf							= 0.0;
	
	public final static boolean	SHOOTER_LEFT_WHEEL_INVERTED							= false;
	public final static boolean	SHOOTER_RIGHT_WHEEL_INVERTED						= false;
	public final static boolean	SHOOTER_ANGLE_MOTOR_INVERTED						= false;
	
	public final static boolean	SHOOTER_LEFT_WHEEL_INVERT_SENSOR					= false;
	public final static boolean	SHOOTER_RIGHT_WHEEL_INVERT_SENSOR					= false;
		
	public final static int SHOOTER_ANGLE_HIGHSHOT_SETPOINT							=   0;
	public final static int SHOOTER_ANGLE_LOWSHOT_SETPOINT							=   0;
	public final static int SHOOTER_ANGLE_LOAD_SETPOINT								=   0;

	
	//*********************************************************************************
	//Pneumatics Constants
	public final static boolean ARMS_UP													= true;
	public final static boolean ARMS_DOWN												= false;
	public final static boolean LOW_GEAR												= true;
	public final static boolean HIGH_GEAR												= false;
	public final static boolean BOULDER_LAUNCHER_ARMED									= false;
	public final static boolean BOULDER_LAUNCHER_SHOOT									= true;

	
}
