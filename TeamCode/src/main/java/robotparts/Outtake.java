package robotparts;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


public class Outtake extends RobotPart{
    private DcMotor Armleft;
    private DcMotor Armright;
    private Servo outtakeLock;

    @Override
    public void init(){
        // TODO: SET DIRECTIONS
        Armleft = createMotor("lift1", DcMotorSimple.Direction.FORWARD, DcMotor.ZeroPowerBehavior.BRAKE, DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Armright = createMotor("lift2", DcMotorSimple.Direction.FORWARD, DcMotor.ZeroPowerBehavior.BRAKE, DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void lift(double power){
        Armleft.setPower(power);
        Armright.setPower(power);

    }

}
