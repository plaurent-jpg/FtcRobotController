package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 31458;
        double motorSpeed = 0.75;
        boolean clawClosed = true;

        telemetry.addData("TeamNumber", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        //telemetry.addData("Name", name),

    }


        @Override
        public void loop() {

        }

}
