package org.usfirst.frc.team4276.robot;
//above is the package, where this code is stored in memory

//the following are imports which allow us to use different objects in our code
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends SampleRobot {


	public Robot() {
		//this is the constructor, where we instantiate objects (create an instance)
	}


	public void robotInit() {
		//this is the code the robot runs when it is not enabled
	}

	public void autonomous() {
		//this is the code the robot runs in the 15 second autonomous period
	}

	
	public void operatorControl() {
		
		while (isOperatorControl() && isEnabled()) {
			
			//this is the code the robot repetitively runs during the driver-control period
			SmartDashboard.putString("Am I self aware?", "we're working on it...");
			
			Timer.delay(0.005);
		}
	}


	public void test() {
		//we don't use this
	}
}
