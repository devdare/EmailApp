package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Joe","Smith");

        em1.changePassword("adekes");
        em1.setMailboxCap(100);
        em1.setAltEmail("Adekes@aol.com");
        System.out.println(em1.showInfo());
        System.out.println(em1.getMailboxCap());
    }

}
