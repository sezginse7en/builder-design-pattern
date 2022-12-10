package computer;

public class DesktopBuilder implements ComputerBuilder{

    private Computer computer;

    public DesktopBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("External Keyboard");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("External Mouse");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("External Screen");
    }

    @Override
    public void buildCase() {
        computer.setComputerCase("External Case");
    }

    public Computer build(){
        return this.computer;
    }

}
