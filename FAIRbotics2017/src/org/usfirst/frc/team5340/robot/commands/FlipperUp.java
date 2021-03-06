package org.usfirst.frc.team5340.robot.commands;

import org.usfirst.frc.team5340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorUp extends Command {
	
	

    public ElevatorUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.eleSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.eleSub.startCounter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.eleSub.ElevatorUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.eleSub.isSwitchSet();
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.eleSub.ElevatorStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

public class ElevatorUp2 extends Command {
	
	

    public ElevatorUp2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.eleSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.eleSub.startCounter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.eleSub2.ElevatorUp2();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.eleSub.isSwitchSet();
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.eleSub.ElevatorStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
