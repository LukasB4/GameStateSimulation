public class Squatting implements State {

    private Mario mario;

    public Squatting(Mario m) {
        mario = m;
    }

    @Override
    public void jump() {
        mario.setState(mario.getJumpingState());
        System.out.println("Crouching -> Jump");
    }

    @Override
    public void sprint() {
        mario.setState(mario.getRunningState());
        System.out.println("Crouching -> Running");
    }

    @Override
    public void crouch() {
        mario.setState(mario.getStandingState());
        System.out.println("Crouching -> Standing");
    }
    
}
