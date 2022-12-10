import computer.ComputerBuilder;
import computer.DesktopBuilder;
import computer.LaptopBuilder;
import computer.Saler;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder("sezgin","seven","mail").setAge(30).setPhoneNumber("dasa").build();

        System.out.println(user);

        ComputerBuilder computerBuilder = new LaptopBuilder();
        Saler saler = new Saler(computerBuilder);

        saler.purchaseComputer();

        System.out.println(saler.getComputer());


    }
}
