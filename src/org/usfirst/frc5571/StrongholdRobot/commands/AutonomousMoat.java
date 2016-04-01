package org.usfirst.frc5571.StrongholdRobot.commands;

import org.usfirst.frc5571.StrongholdRobot.Constants;
import org.usfirst.frc5571.StrongholdRobot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutonomousMoat extends CommandGroup {
    
    public  AutonomousMoat() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new PneumaticsRaiseArms());
    	addSequential(new WaitCommand(5));
    	addSequential(new ShooterAimClosedLoop(Constants.SHOOTER_ANGLE_PARKING_SETPOINT));
    	addSequential(new AutoDriveCommand(-0.80, 0, 3.5));
    }
}
