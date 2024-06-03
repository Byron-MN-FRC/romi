// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Speedchange extends SubsystemBase {
  private double speedPercentage = 1.0;
  /** Creates a new Speedchange. */
  public Speedchange() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setSpeedPercentage() {
    speedPercentage = 0.5;
  }
  public void resetSpeedPercentage() {
    speedPercentage = 1.0;
  }
  public double getSpeedPercentage() {
    return speedPercentage;
  }
}
