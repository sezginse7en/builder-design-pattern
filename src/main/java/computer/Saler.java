package computer;

public class Saler {

    private ComputerBuilder computerBuilder;

    public Saler(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return  this.computerBuilder.build();
    }

    public void purchaseComputer(){
        this.computerBuilder.buildCase();
        this.computerBuilder.buildMouse();
        this.computerBuilder.buildKeyboard();
        this.computerBuilder.buildScreen();
    }

}
