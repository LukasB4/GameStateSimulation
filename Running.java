public class Running implements State {

    private Mario mario;

    public Running(Mario m) {
        mario = m;
    }

    @Override
    public void jump() {
        mario.setState(mario.getJumpingState());
        System.out.println("Running -> Jumping");
    }

    @Override
    public void sprint() {
        mario.setState(mario.getStandingState());
        System.out.println("Running -> Standing");
    }

    @Override
    public void crouch() {
        System.out.println("Cannot crouch while running");
    }
    
}
