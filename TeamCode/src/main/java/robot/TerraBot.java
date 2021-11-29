package robot;

import robotparts.Carousel;
import robotparts.Intake;
import robotparts.MecanumDrive;
import robotparts.Odometry;
import robotparts.Outtake;
import robotparts.TankDrive;

public class TerraBot extends RobotFramework {
    public TankDrive tankDrive = new TankDrive();
    public MecanumDrive mechDrive = new MecanumDrive();
    public Odometry odometry = new Odometry();
    public Carousel carousel = new Carousel();
    public robotparts.Intake Intake = new Intake();
    public Outtake outtake = new Outtake();

}
