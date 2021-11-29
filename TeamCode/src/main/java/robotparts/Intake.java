package robotparts;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Intake extends RobotPart {
    public CRServo SpintakeLeft;
    public CRServo SpintakeRight;

    @Override
    public void init() {
        // TODO: SET DIRECTIONS
        SpintakeLeft = createCRServo("spintakeLeft", CRServo.Direction.FORWARD);
        SpintakeRight = createCRServo("spintakeRight", CRServo.Direction.FORWARD);
    }
    public void Intake(double power){
        SpintakeRight.setPower(power);
        SpintakeLeft.setPower(power);

    }

}
