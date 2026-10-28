package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.AprilTagArducam;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
@Autonomous
public class AprilTagArducamExample extends OpMode {

    AprilTagArducam aprilTagArducam = new AprilTagArducam();

    @Override
    public void init(){
        aprilTagArducam.init(hardwareMap, telemetry);
    }

    @Override
    public void loop(){
        aprilTagArducam.update();
        AprilTagDetection id20 = aprilTagArducam.getTagbySpesificID(20);
        telemetry.addData("id20 String", id20.toString());
    }
}
