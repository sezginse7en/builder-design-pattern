package computer;

public class LaptopBuilder implements ComputerBuilder{

    private Computer computer;

    public LaptopBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("Internal Keyboard");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Internal Mouse");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("Internal Screen");
    }

    @Override
    public void buildCase() {
        computer.setComputerCase("Internal Case");
    }

    public Computer build(){
        return this.computer;
    }

}
