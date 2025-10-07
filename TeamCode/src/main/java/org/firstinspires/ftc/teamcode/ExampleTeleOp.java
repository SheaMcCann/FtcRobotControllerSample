package org.firstinspires.ftc.teamcode; //automatically included after cloning the original FTC repository

// IMPORTS: should appear automatically as you use methods from them.
// For example, if you established a new CRServo that would create an import.
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp // establishes this class as a TeleOp to determine where the program appears on your Driver Station interface.
public class ExampleTeleOp extends LinearOpMode{
    public DcMotor exampleMotor;
    public Servo exampleServo;

    @Override
    public void runOpMode(){
        // "exampleMotor" is the name I created above (public DcMotor exampleMotor;)
        // whereas "EM" is the name established in my hardware configuration on the Driver Station.
        exampleMotor = hardwareMap.get(DcMotor.class, "EM");
        exampleServo = hardwareMap.get(Servo.class, "ES");

        exampleMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // not necessary, forces the motor to stop more abruptly

        waitForStart();
        while (opModeIsActive()){
            if (gamepad1.x){ // if button x is pressed, do this:
                exampleMotor.setPower(1); // sets motor power to any number from -1 to 1
                exampleServo.setPosition(1); // sets servo position to any number from -1 to 1
            }
            else if (gamepad1.y){ // if button y is pressed, do this:
                exampleMotor.setPower(-0.5);
                exampleServo.setPosition(-0.5);
            }
            else{ //otherwise, do this:
                exampleMotor.setPower(0);
                exampleServo.setPosition(0);
            }
        }
    }
}
