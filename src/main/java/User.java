public class User {

    private String name;
    private String surname;
    private String emailAdress;

    //optionals
    private int age;
    private String address;
    private String phoneNumber;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phoneNumber = userBuilder.phoneNumber;
        this.emailAdress = userBuilder.emailAdress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class UserBuilder{

        private String name;
        private String surname;
        private String emailAdress;

        //optionals
        private int age;
        private String address;
        private String phoneNumber;

        public UserBuilder(String name,String surname,String emailAdress){
            this.name = name;
            this.surname = surname;
            this.emailAdress = emailAdress;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }


}
