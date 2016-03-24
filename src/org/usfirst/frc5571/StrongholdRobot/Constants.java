package org.usfirst.frc5571.StrongholdRobot;

public class Constants {
	// Xbox Controller 
	// Note:  Dpad is POV
	public final static int XBOX_LEFT_X_AXIS					= 0;
	public final static int XBOX_LEFT_Y_AXIS					= 1;
	public final static int XBOX_LEFT_JOYSTICK_BUTTON			= 9;
	public final static int XBOX_RIGHT_X_AXIS					= 4;
	public final static int XBOX_RIGHT_Y_AXIS					= 5;
	public final static int XBOX_RIGHT_JOYSTICK_BUTTON			= 10;
	public final static int XBOX_LEFT_TRIGGER_AXIS				= 2;
	public final static int XBOX_RIGHT_TRIGGER_AXIS				= 3;
	public final static int XBOX_A_BUTTON						= 1;
	public final static int XBOX_B_BUTTON						= 2;
	public final static int XBOX_X_BUTTON						= 3;
	public final static int XBOX_Y_BUTTON						= 4;
	public final static int XBOX_LEFT_BUMPER					= 5;
	public final static int XBOX_RIGHT_BUMPER					= 6;
	public final static int XBOX_BACK_BUTTON					= 7;
	public final static int XBOX_START_BUTTON					= 8;
	
	// Xbox Controller Controls Mapping
	public final static int XBOX_SHOOTING_ANGLE_JOYSTICK		= XBOX_RIGHT_Y_AXIS;  
	public final static int XBOX_DRIVING_MAGNITUDE_JOYSTICK		= XBOX_LEFT_Y_AXIS;
	public final static int XBOX_DRIVING_TURN_JOYSTICK			= XBOX_LEFT_X_AXIS;
	public final static int XBOX_ARMS_UP_BUTTON					= XBOX_BACK_BUTTON;
	public final static int XBOX_ARMS_DOWN_BUTTON				= XBOX_START_BUTTON;		
	public final static int XBOX_LOW_GEAR_BUTTON				= XBOX_LEFT_BUMPER;
	public final static int XBOX_HIGH_GEAR_BUTTON				= XBOX_RIGHT_BUMPER;
	public final static int XBOX_SHOOTER_WHEELS_CAPTURE			= XBOX_A_BUTTON;
	public final static int XBOX_SHOOTER_WHEELS_SHOOT			= XBOX_Y_BUTTON;
	public final static int XBOX_AIM_PICKUP						= XBOX_X_BUTTON;
	public final static int XBOX_AIM_HIGHSHOT					= XBOX_B_BUTTON;
	public final static int XBOX_KICK_BOULDER					= XBOX_LEFT_JOYSTICK_BUTTON;

	
	// Logitech Extreme 3D Pro Joystick 
	public final static int LOGITECH3DPRO_X_AXIS						= 0;
	public final static int LOGITECH3DPRO_Y_AXIS						= 1;
	public final static int LOGITECH3DPRO_Z_AXIS						= 2;
	public final static int LOGITECH3DPRO_SLIDER_AXIS					= 3;
	public final static int LOGITECH3DPRO_TRIGGER_BUTTON				= 1;
	public final static int LOGITECH3DPRO_JOYSTICK_SIDE_BUTTON			= 2;
	public final static int LOGITECH3DPRO_POV							= 0;

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
	static double FAST_DRIVE_MAGNITUDE_SCALE 									= 0.5;
	static double FAST_DRIVE_TWIST_SCALE 										= 0.75;
	static double FINE_DRIVE_MAGNITUDE_SCALE									= 0.3;
	static double FINE_DRIVE_TWIST_SCALE										= 0.45;
	
	public static final double XBOX_MAGNITUDE_SCALE_FACTOR						= 0.5;
	public static final double XBOX_TWIST_SCALE_FACTOR							= 0.65;
	
	public static final double LOGITECH_MAGNITUDE_SCALE_FACTOR					= 1.0;
	public static final double LOGITECH_TWIST_SCALE_FACTOR						= 1.0;

	
	//*********************************************************************************
	//Shooter Constants
	public final static double SHOOTER_ANGLE_POSITION_Kp						= 8.0;
	public final static double SHOOTER_ANGLE_POSITION_Ki						= 0.0;
	public final static double SHOOTER_ANGLE_POSITION_Kd						= 0.0;
	public final static double SHOOTER_ANGLE_POSITION_Kf						= 0.0;
	public final static boolean	SHOOTER_ANGLE_MOTOR_INVERTED					= false;
	public final static boolean SHOOTER_ANGLE_POT_INVERTED						= false;
	public final static boolean SHOOTER_ANGLE_BRAKE_ENABLED						= true;
	public final static int SHOOTER_FORWARD_SOFTLIMIT							= 760; 
	public final static int SHOOTER_REVERSE_SOFTLIMIT							= 70;
	public final static int SHOOTER_ANGLE_HIGHSHOT_SETPOINT						= 100;
	public final static int SHOOTER_ANGLE_LOWSHOT_SETPOINT						= 600;
	public final static int SHOOTER_ANGLE_PARKING_SETPOINT						= 200;
	public final static int SHOOTER_ANGLE_LOAD_SETPOINT							= 755;
	public final static int SHOOTER_AIMING_ERROR_THRESHOLD						= 20;
	public final static double SHOOTER_AIMING_ACTUATOR_DEADZONE					= 0.10;
	public final static double SHOOTER_AIMING_ACTUATOR_SCALING_FACTOR			= 0.75;
	
	public final static double SHOOTER_WHEELS_VELOCITY_Kp						= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Ki						= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Kd						= 0.0;
	public final static double SHOOTER_WHEELS_VELOCITY_Kf						= 0.0;
	public final static boolean	SHOOTER_LEFT_WHEEL_INVERTED						= false;
	public final static boolean	SHOOTER_RIGHT_WHEEL_INVERTED					= true;
	public final static boolean	SHOOTER_LEFT_WHEEL_INVERT_SENSOR				= false;
	public final static boolean	SHOOTER_RIGHT_WHEEL_INVERT_SENSOR				= false;
	public final static double SHOOTER_WHEEL_INTAKE_SPEED						= 0.75;
	public final static double SHOOTER_WHEEL_HIGH_SPEED							=-1.0;
	public final static double SHOOTER_WHEEL_SPINUP_DELAY						= 1.0;

	
	//*********************************************************************************
	//Pneumatics Constants
	public final static boolean ARMS_UP												= true;
	public final static boolean ARMS_DOWN											= false;
	public final static boolean LOW_GEAR											= false;
	public final static boolean HIGH_GEAR											= true;
	public final static boolean BOULDER_KICKER_ARMED								= false;
	public final static boolean BOULDER_KICKER_SHOOT								= true;
	public final static double	BOULDER_KICKER_DELAY_TIME							=  0.25;

	//*********************************************************************************
	//Camera Constants
	public final static int CAMERA_640_x_480										= 0;
	public final static int CAMERA_320_x_240										= 1;
	public final static int CAMERA_160_x_120										= 2;
	
}
