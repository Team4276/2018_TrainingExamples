package org.usfirst.frc.team4276.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Joystick;

public class DriveSystem {

	double leftSidePower, rightSidePower;
	VictorSP leftMotor1, leftMotor2, rightMotor1, rightMotor2;
	Joystick driveJoystick1;
	
	public DriveSystem(int driveJoyPort,int left1Port,int left2Port,int right1Port,int right2Port)
	/*When called from the constructor in the main robot class, 
	 * these ports will be assigned numbers corresponding with 
	 * where the objects are plugged in.
	 */
	{
		driveJoystick1 = new Joystick(driveJoyPort);
		leftMotor1 = new VictorSP(left1Port);
		leftMotor2 = new VictorSP(left2Port);
		rightMotor1 = new VictorSP(right1Port);
		rightMotor2 = new VictorSP(right2Port);
	}
	
	public void oneJoystickDrive(){
		/*calculates the power that should be applied 
		 * to each side of the drivetrain to control
		 * the robot properly
		 */
		leftSidePower = driveJoystick1.getY()+driveJoystick1.getTwist();
		rightSidePower = driveJoystick1.getY()-driveJoystick1.getTwist();
	}
	
	public void assignMotorPower(){
		//assigns all motors to their calculated power
		leftMotor1.set(leftSidePower);
		leftMotor2.set(leftSidePower);
		rightMotor1.set(rightSidePower);
		rightMotor2.set(rightSidePower);
	}
	
	public void performMainProcessing(){
		oneJoystickDrive();
		assignMotorPower();
	}
}
