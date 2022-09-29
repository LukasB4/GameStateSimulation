public class Standing implements State {

    private Mario mario;

    public Standing(Mario m) {
        mario = m;
    }

    @Override
    public void jump() {
        mario.setState(mario.getJumpingState());
        System.out.println("Standing -> Jumping");
    }

    @Override
    public void sprint() {
        mario.setState(mario.getRunningState());
        System.out.println("Standing -> Running");
    }

    @Override
    public void crouch() {
        mario.setState(mario.getSquattingState());
        System.out.println("Standing -> Crouching");
    }
    
}
