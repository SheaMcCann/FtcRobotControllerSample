package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class ExampleAutonomous extends LinearOpMode{
    public DcMotor exampleMotor;
    public Servo exampleServo;

    @Override
    public void runOpMode(){
        // "exampleMotor" is the name I created above (line 12 public DcMotor exampleMotor;)
        // whereas "EM" is the name established in my hardware configuration on the Driver Station.
        exampleMotor = hardwareMap.get(DcMotor.class, "EM");
        exampleServo = hardwareMap.get(Servo.class, "ES");

        exampleMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // not necessary, just forces the motor to stop more abruptly

        //if you would like to reverse the direction of a motor use this:
        //exampleMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()){
            exampleMotor.setPower(1);
            sleep(3000); // waits for 3 seconds, motor still running during sleep
            exampleMotor.setPower(0);
        }
    }
}
