package org.usfirst.frc5571.StrongholdRobot;

public class Constants {
	// Xbox Controller Controls Mapping
	public final static int XBOX_SHOOTING_ANGLE_JOYSTICK		= 5;  // Right hand Y axis
	public final static int XBOX_DRIVING_MAGNITUDE_JOYSTICK		= 1;  // Left hand Y axis
	public final static int XBOX_DRIVING_TURN_JOYSTICK			= 0;  // Left hand X axis
	public final static int ARMS_UP_BUTTON						= 7;  // Back Button
	public final static int ARMS_DOWN_BUTTON					= 8;  // Start Button
	public final static int LOW_GEAR_BUTTON						= 5;  // Left Bumper
	public final static int HIGH_GEAR_BUTTON					= 6;  // Right Bumper
	public final static int SHOOTER_WHEELS_CAPTURE				= 2;  // A Button
	public final static int SHOOTER_WHEELS_SHOOT				= 4;  // Y Button
	
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
	public final static double SHOOTER_WHEEL_INTAKE_SPEED							= 0.10;
	public final static double SHOOTER_WHEEL_HIGH_SPEED								= 1.0;
	
		
	public final static int SHOOTER_ANGLE_HIGHSHOT_SETPOINT							=   0;
	public final static int SHOOTER_ANGLE_LOWSHOT_SETPOINT							=   0;
	public final static int SHOOTER_ANGLE_LOAD_SETPOINT								=   0;
	
	public final static int	SHOOTER_KICKER_DELAY_TIME								=  100;

	
	//*********************************************************************************
	//Pneumatics Constants
	public final static boolean ARMS_UP												= true;
	public final static boolean ARMS_DOWN											= false;
	public final static boolean LOW_GEAR											= true;
	public final static boolean HIGH_GEAR											= false;
	public final static boolean BOULDER_LAUNCHER_ARMED								= false;
	public final static boolean BOULDER_LAUNCHER_SHOOT								= true;

	
}
