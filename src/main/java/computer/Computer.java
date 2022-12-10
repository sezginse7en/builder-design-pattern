package computer;

public class Computer{

    private String mouse;
    private String keyboard;
    private String screen;
    private String computerCase;

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", screen='" + screen + '\'' +
                ", computerCase='" + computerCase + '\'' +
                '}';
    }
}
