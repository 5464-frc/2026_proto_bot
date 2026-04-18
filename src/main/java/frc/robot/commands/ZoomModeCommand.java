package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Universals;

public class ZoomModeCommand extends Command{

    @Override
    public void execute(){
        Universals.driveSpeedMultiplier = 2;
        SmartDashboard.putBoolean("ZoomMode", true);
    }

    @Override
    public void end(boolean interrupted){
        Universals.driveSpeedMultiplier = 1;
        SmartDashboard.putBoolean("ZoomMode", false);
    }

    @Override
    public boolean runsWhenDisabled(){
        return true;
    }

}
