package bot.model;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;

import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.navigation.MovePilot;

import lejos.utility.Delay;

public class EV3Bot
{
	private String message;
	private int xPosition;
	private int yPosition;
	private long waitTime;

	private MovePilot botPilot;

	public EV3Bot()
	{
		this.message = "Rory codes roryBot";
		this.xPosition = 50;
		this.yPosition = 50;
		this.waitTime = 4000;

		setupPilot();
	}

	private void setupPilot()
	{
		Wheel leftWheel = WheeledChassis.modelWheel(Motor.A, 43.2).offset(-72);
		Wheel rightWheel = WheeledChassis.modelWheel(Motor.B, 43.2).offset(72);
		Chassis baseChassis = new WheeledChassis(new Wheel[] { leftWheel, rightWheel }, WheeledChassis.TYPE_DIFFERENTIAL);
		botPilot = new MovePilot(baseChassis);
	}

	public void driveRoom()
	{
		botPilot.travel(254.12);
	}

	private void displayMessage()
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
		LCD.clear();
	}

	private void displayMessage(String message)
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
	}

}
