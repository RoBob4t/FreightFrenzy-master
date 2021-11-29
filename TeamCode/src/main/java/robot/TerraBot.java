package robot;

import robotparts.Carousel;
import robotparts.Intake;
import robotparts.MecanumDrive;
import robotparts.Outtake;

public class TerraBot extends RobotFramework {
    public MecanumDrive mechDrive = new MecanumDrive();
    public Carousel carousel = new Carousel();
    public robotparts.Intake Intake = new Intake();
    public Outtake outtake = new Outtake();

}
