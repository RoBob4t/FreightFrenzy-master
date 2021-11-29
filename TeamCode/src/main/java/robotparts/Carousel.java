package robotparts;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class Carousel extends RobotPart {
    public CRServo carouselLeft;
    public CRServo carouselRight;

    @Override
    public void init() {
        // TODO: SET DIRECTIONS
        carouselLeft = createCRServo("carouselLeft", CRServo.Direction.FORWARD);
        carouselRight = createCRServo("carouselRight", CRServo.Direction.REVERSE);
        //
    }

    public void CarouselSpin(double P) {
        carouselLeft.setPower(P);
        carouselRight.setPower(P);
    }
}