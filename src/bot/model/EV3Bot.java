package bot.model;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class EV3Bot
{
	private String message;
	private int xPosition;
	private int yPosition;
	private long waitTime;
	
	public EV3Bot()
	{
		this.message = "Rory codes roryBot";
		this.xPosition = 50;
		this.yPosition = 50;
		this.waitTime = 4000;
		
		displayMessage();
	}
	
	
	public void driveRoom()
	{
		//call private helper here
		displayMessage("driveRoom");
	}
	
	private void displayMessage()
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
	}
	
	private void displayMessage(String message)
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
	}
	
}
