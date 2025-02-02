// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase {

  public final Climber climber;

  public Climb() {
    this.climber = new Climber(climberIOs[0], Constants.Climber);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
