package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Climb {

    
    public State state = State.NEUTRAL;
    private DoubleSolenoid leftSolenoid;
    private DoubleSolenoid rightSolenoid;

    public boolean isFinished = false;
    public enum State{
        NEUTRAL,
        EXTENDED,
    }

    public Climb() {
        leftSolenoid = new DoubleSolenoid(leftSolenoid, CLAW_LEFT_REVERSE);
        rightSolenoid = new DoubleSolenoid(CLAW_RIGHT_FORWARD, CLAW_RIGHT_REVERSE);
    }

  

    public void toggle() {
        if(state == State.EXTENDED) { state = State.NEUTRAL;
            isFinished = true;
        }
        else {
            state = State.EXTENDED;
            isFinished = true;
        }
    }

    public State getState() {
        return state;
    }
}
