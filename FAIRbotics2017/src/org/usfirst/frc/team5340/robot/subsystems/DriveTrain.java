package org.usfirst.frc.team5340.robot.subsystems;

import org.usfirst.frc.team5340.robot.OI;
import org.usfirst.frc.team5340.robot.Robot;
import org.usfirst.frc.team5340.robot.RobotMap;
import org.usfirst.frc.team5340.robot.commands.DriveWStick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
	RobotDrive driveTrain;
	
    Victor leftMotor;
    Victor rightMotor;
    OI joysticks;
    
    
    public DriveTrain(){
    	if(RobotMap.usingFourMotors){
    	leftMotor = new Victor(RobotMap.LEFT_MOTOR);
    	rightMotor = new Victor(RobotMap.RIGHT_MOTOR);
    	driveTrain = new RobotDrive(leftMotor, rightMotor);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	
  
    	}
    }
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWStick());
    }
    
    public void mecaDrive() {
    	driveTrain.tankDrive(Robot.oi.driveStick2.getX() * 0.2, Robot.oi.driveStick2.getY() * 0.2);
    	
//    	As of right now (11/29/16) there is a negative value assigned to driveStick2's X value, the robot is strafing backwards this is the current fix.
//    	Above problem has been fixed as of (12/some date/16)
    	
    }
    
//    public void autoTank() {
//    	driveTrain.tankDrive(-.6, .6, true);
//    }
}