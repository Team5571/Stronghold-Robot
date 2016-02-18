package org.usfirst.frc5571.StrongholdRobot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.parsing.IInputOutput;

	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */

	

	/**
	 * A nearly drop in replacement for Joystick using an XBOX USB Controller
	 * @author Gustave Michel
	 */
	public class XboxController extends GenericHID  {
	    
	    private DriverStation m_ds;
	    private final int m_port;
	    
	    /**
	     * Represents an analog axis on a joystick.
	     */
	    public static class AxisType {
	        
	        /**
	         * The integer value representing this enumeration
	         */
	        public final int value;
	        private static final int kLeftX_val = 1;
	        private static final int kLeftY_val = 2;
	        private static final int kTrigger_val = 3;
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
	        public static final AxisType kTrigger = new AxisType(kTrigger_val);
	        
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
	        private static final int kL_val = 5;
	        private static final int kR_val = 6;
	        private static final int kBack_val = 7;
	        private static final int kStart_val = 8;
	        private static final int kLeftStick_val = 9;
	        private static final int kRightStick_val = 10;
	        private static final int kRTrigger_val = 11;
	        private static final int kLTrigger_val = 12;
	        
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
	        public static final ButtonType kR = new ButtonType(kR_val);
	        
	        /**
	         * Button: L1
	         */
	        public static final ButtonType kL = new ButtonType(kL_val);
	        
	        /**
	         * Button: Select
	         */
	        public static final ButtonType kStart = new ButtonType(kStart_val);
	        
	        /**
	         * Button: Right Trigger
	         */
	        public static final ButtonType kRTrigger = new ButtonType(kRTrigger_val);
	        
	        /**
	         * Button: Left Trigger
	         */
	        public static final ButtonType kLTrigger = new ButtonType(kLTrigger_val);
	        
	        /**
	         * Button: Start
	         */
	        public static final ButtonType kBack = new ButtonType(kBack_val);
	    }
	    
	    
	    /**
	     * Constructor
	     * @param port USB Port on DriverStation
	     */
	    public XboxController(int port) {
	        super();
	        m_port = port;
	        m_ds = DriverStation.getInstance();
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
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getY(Hand hand) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getZ(Hand hand) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getTwist() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getThrottle() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean getTrigger(Hand hand) {
			// TODO Auto-generated method stub
			return false;
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
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getPOV(int pov) {
			// TODO Auto-generated method stub
			return 0;
		}

}
