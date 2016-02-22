package org.usfirst.frc5571.StrongholdRobot;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.parsing.IInputOutput;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**s
 * A nearly drop in replacement for Joystick using an XBOX USB Controller
 * @author Gustave Michel
 */
public class Xbox360Controller extends GenericHID  {

	private DriverStation m_ds;
	private final int m_port;
	private double twistScaleFactor;

	/**
	 * Represents an analog axis on a joystick.
	 */
	public static class AxisType {

		/**
		 * The integer value representing this enumeration
		 */
		public final int value;
		private static final int kLeftX_val = 0;
		private static final int kLeftY_val = 1;
		private static final int kLeftTriggerAxis_val = 2;
		private static final int kRightTriggerAxis_val = 3;
		private static final int kRightX_val = 4;
		private static final int kRightY_val = 5;
		private static final int kDLeftRight_val = 6;

		private AxisType(int value) {
			this.value = value;
		}

		/**
		 * Axis: Left X
		 */
		public static final AxisType kLeftX = new AxisType(kLeftX_val);

		/**
		 * Axis: Left Y
		 */
		public static final AxisType kLeftY = new AxisType(kLeftY_val);

		/**
		 * Axis: Triggers
		 */
		public static final AxisType kLeftTriggerAxis = new AxisType(kLeftTriggerAxis_val);
		public static final AxisType kRightTriggerAxis = new AxisType(kRightTriggerAxis_val);


		/**
		 * Axis: Right X
		 */
		public static final AxisType kRightX = new AxisType(kRightX_val);

		/**
		 * Axis: Right Y
		 */
		public static final AxisType kRightY = new AxisType(kRightY_val);


		/**
		 * Axis: D-Pad Left-Right
		 */
		public static final AxisType kDLeftRight = new AxisType(kDLeftRight_val);
	}

	/**
	 * Represents a digital button on a joystick.
	 */
	public static class ButtonType {

		/**
		 * The integer value representing this enumeration
		 */
		public final int value;
		private static final int kA_val = 1;
		private static final int kB_val = 2;
		private static final int kX_val = 3;
		private static final int kY_val = 4;
		private static final int kLBumper_val = 5;
		private static final int kRBumper_val = 6;
		private static final int kBack_val = 7;
		private static final int kStart_val = 8;
		private static final int kLeftStick_val = 9;
		private static final int kRightStick_val = 10;


		private ButtonType(int value) {
			this.value = value;
		}

		/**
		 * Button: X-Joystick
		 */
		public static final ButtonType kLeftStick = new ButtonType(kLeftStick_val);

		/**
		 * Button: Y-Joystick
		 */
		public static final ButtonType kRightStick = new ButtonType(kRightStick_val);

		/**
		 * Button: X
		 */
		public static final ButtonType kX = new ButtonType(kX_val);

		/**
		 * Button: Y
		 */
		public static final ButtonType kY = new ButtonType(kY_val);

		/**
		 * Button: A
		 */
		public static final ButtonType kA = new ButtonType(kA_val);

		/**
		 * Button: B
		 */
		public static final ButtonType kB = new ButtonType(kB_val);

		/**
		 * Button: R1
		 */
		public static final ButtonType kRBumper = new ButtonType(kRBumper_val);

		/**
		 * Button: L1
		 */
		public static final ButtonType kLBumper = new ButtonType(kLBumper_val);

		/**
		 * Button: Select
		 */
		public static final ButtonType kStart = new ButtonType(kStart_val);


		/**
		 * Button: Start
		 */
		public static final ButtonType kBack = new ButtonType(kBack_val);
	}


	/**
	 * Constructor
	 * @param port USB Port on DriverStation
	 */
	public Xbox360Controller(int port) {
		super();
		m_port = port;
		m_ds = DriverStation.getInstance();
		twistScaleFactor = 1.0;
	}

	/**
	 * Get Value from an Axis
	 * @param axis Axis Number
	 * @return Value from Axis (-1 to 1)
	 */
	public double getRawAxis(int axis) {
		return m_ds.getStickAxis(m_port, axis);
	}

	@Override
	public double getX(Hand hand) {
		if (hand == Hand.kLeft)
			return m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kLeftX_val);
		else
			return m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kRightX_val);	
	}

	@Override
	public double getY(Hand hand) {
		if (hand == Hand.kLeft)
			return m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kLeftY_val);
		else
			return m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kRightY_val);	
	}

	@Override
	public double getZ(Hand hand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*Implements a custom method used to rotate the Robot by
	using the left and right bumper axes as a twist.  
	*/	
	public double getTwist() {
		// Uses 
		double leftTriggerTwist = m_ds.getStickAxis(m_port, 2);
		double rightTriggerTwist = m_ds.getStickAxis(m_port, 3);
		return (((leftTriggerTwist * -1) + (rightTriggerTwist)) * twistScaleFactor);
	}

	@Override
	public double getThrottle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getTrigger(Hand hand) {
		if (hand == Hand.kLeft){
			return (( m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kLeftTriggerAxis_val)) >0);
		}
		else {
			return (( m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kLeftTriggerAxis_val)) >0); 
		}
	}

	@Override
	public boolean getTop(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getBumper(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getRawButton(int button) {
		return m_ds.getStickButton(m_port, (byte) button);
	}

	@Override
	public int getPOV(int pov) {
		return (int) m_ds.getStickAxis(m_port, Xbox360Controller.AxisType.kDLeftRight_val);
	}

	public void setTriggerTwistSensitivity(double triggertwistSensitivity) {
		twistScaleFactor = triggertwistSensitivity;
	}

}
