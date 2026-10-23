package org.firstinspires.ftc.teamcode.Tutos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class DC_Motor_Prac extends OpMode {
    DC_Motors bench = new DC_Motors();

    @Override
    public void init(){
        bench.init(hardwareMap);
    }

    @Override
    public void loop(){
        bench.setMotorSpeed(0.5);
    }
}
