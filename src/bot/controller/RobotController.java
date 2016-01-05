package bot.controller;

import bot.model.EV3Bot;

public class RobotController
{
	private EV3Bot roryBot;
	
	public RobotController()
	{
		roryBot = new EV3Bot();
	}

	public void start()
	{
		roryBot.driveRoom();
	}
}
