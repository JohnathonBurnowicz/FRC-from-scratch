// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticSub extends SubsystemBase {

  private final DoubleSolenoid TestSol = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4,5);


  /** Creates a new PneumaticSub. */
  public PneumaticSub() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void SetSolForward() {

    TestSol.set(Value.kForward);
  }

  public void SetSolReverse() {

    TestSol.set(Value.kReverse);
  }

}
