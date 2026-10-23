package org.firstinspires.ftc.teamcode.Tutos;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DC_Motors {

    private DcMotor motor;

    public void init(HardwareMap hwMap) {

        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }
}
