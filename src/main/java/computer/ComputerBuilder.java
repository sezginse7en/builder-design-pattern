package computer;

public interface ComputerBuilder{

    public void buildKeyboard();

    public void buildMouse();

    public void buildScreen();

    public void buildCase();

    Computer build();

}
