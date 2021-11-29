package teleop;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import global.Common;
import robot.TerraBot;
import util.condition.Expectation;
import util.condition.Magnitude;
import static global.General.*;

@TeleOp(name = "TestOp", group = "TeleOp")
public class TestOp extends OpMode implements Common {
    @Override
    public void init() {
        reference(this);
    }

    @Override
    public void start() {
        ready();
    }

    @Override
    public void loop() {
        update(true);
        bot.mechDrive.move(gamepad1.left_stick_y,gamepad1.left_stick_x,gamepad1.right_trigger);
        bot.carousel.CarouselSpin(gamepad1.left_trigger);
        bot.Intake.Intake(gamepad1.right_stick_y);
        bot.outtake.lift(gamepad1.right_stick_y);
        bot.outtake.lock();
        bot.outtake.unlock();

    }

    @Override
    public void stop() {
        end();
    }
}
