package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SwerveSubsystem;

public class GyroReset extends Command{
    private final Runnable reset;
    SwerveSubsystem swerve;

    public GyroReset(SwerveSubsystem swervesub) {
        swerve = swervesub;
        reset = () -> {
            // drivetrain.seedFieldCentric();
            swerve.zeroGyro();
        };
    }

    @Override
    public void initialize(){
        // drivetrain.seedFieldCentric();
        SmartDashboard.putBoolean("zeroGyro", true);
        System.out.println("zeroed");
        reset.run();
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void end(boolean interrupted) {
        SmartDashboard.putBoolean("zeroGyro", false);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean runsWhenDisabled(){
        return true;
    }
}
