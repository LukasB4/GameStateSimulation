public class Jumping implements State {

    private Mario mario;

    public Jumping(Mario m) {
        mario = m;
    }

    @Override
    public void jump() {
        mario.setState(mario.getStandingState());
        System.out.println("Jumping -> Standing");
    }

    @Override
    public void sprint() {
        System.out.println("Cannot run while jumping");
    }

    @Override
    public void crouch() {
        System.out.println("Cannot crouch while jumping");
    }
    
}
