package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANdleSubsystem;

public class RedLarsonCommand extends Command {
    private CANdleSubsystem candle;

    public RedLarsonCommand(CANdleSubsystem candle){
        this.candle = candle;
    }

    @Override
    public void initialize(){
        
    }

    @Override
    public void execute(){
        candle.redLarsonIt();
    }

    @Override
    public void end(boolean interrupted){
        candle.clearAnimation();
        candle.defaultColor();
    }

    }
