/*
 *   Created by Adam Sher on 2-26-19
 *   This class will be used to control the drive train of our mini-bots.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorController;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorMRGyro;
import org.firstinspires.ftc.robotcontroller.external.samples.SensorMROpticalDistance;

public class HardwareMiniBots {

//  DECLARING PHYSICAL DEVICES

//  Declare Motors
    public DcMotor leftFront = null;
    public DcMotor leftBack = null;
    public DcMotor rightFront = null;
    public DcMotor rightBack = null;


//  Declare the hardware map.
    HardwareMap hwMap = null;

//  Constructor. Tbh I have no idea what this does.
    public HardwareMiniBots() {

    }



//  Initialize all hardware devices & set them to their starting state.
    public void init(HardwareMap hwMap) {

//      Initialize Motors
        leftFront = hwMap.get(DcMotor.class, "lf");
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftFront.setPower(0);
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftBack = hwMap.get(DcMotor.class, "lb");
        leftBack.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setPower(0);
        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightFront = hwMap.get(DcMotor.class, "rf");
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setPower(0);
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightBack = hwMap.get(DcMotor.class, "rb");
        rightBack.setDirection(DcMotor.Direction.FORWARD);
        rightBack.setPower(0);
        rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}