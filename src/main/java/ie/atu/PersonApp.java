package ie.atu;

public class PersonApp {
    public static void main(String[] args) {
        Person dave = new Person("Dave","Mervue","12345");
        System.out.println(dave.toString());
        Customer peter = new Customer("Peter","Mervue","12345","0852343923",true);
        System.out.println(peter.toString());

        Customer Patrick = new Customer();
        Patrick.setName("Patrick");
        Patrick.setAddress("Galway");
        Patrick.setTelephone("085439042");
        Patrick.setCustomerNumber("4346543");
        Patrick.setMailingList(false);

        System.out.println(Patrick.toString());

    }
}
