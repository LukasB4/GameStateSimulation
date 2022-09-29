public class Mario {
    //private instance variables for each possible state
    private State Standing;
    private State Jumping;
    private State Running;
    private State Squatting;
    
    //current state the machine is in
    private State currentState;
    
    public Mario() {
        //initialize possible state instance variables
        Standing = new Standing(this);
        Squatting = new Squatting(this);
        Jumping = new Jumping(this);
        Running  = new Running(this);
        
        //set initial current state
        currentState = Standing;
    }
    
    public void setState(State state) {
        this.currentState = state;
    }
    
    public State getStandingState() {
        return Standing;
    }
    
    public State getRunningState() {
        return Running;
    }

    public State getJumpingState() {
        return Jumping;
    }

    public State getSquattingState() {
        return Squatting;
    }

    public void jump() {
        currentState.jump();
        
    }

    public void sprint() {
        currentState.sprint();
        
    }

    public void crouch() {
        currentState.crouch();
    }

    public void disrupt() {
        if (currentState == getSquattingState()){
            System.out.println("Mario evaded disruptor!");
            
        }
        else {
            System.out.println("Mario movement disrupted!");
            setState(Standing);
        }
    }
}
