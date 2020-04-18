package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department ;
    private String email;
    private int mailboxCap = 500;
    private int defaultPassLength = 10;
    private String altEmail;
    private String company = "web.de";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        this.department = this.setDepartment();
        System.out.println("Department is " + this.department);

        this.password = randomPassword(defaultPassLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + this.company;
        System.out.println("Your email is " + email);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter dept: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "dev";}
        else if (depChoice == 3) { return "accounting";}
        else { return "";}
    }

    private String randomPassword(int length) {
        String passwordSet = "ABEDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public void setMailboxCap(int cap) {
        this.mailboxCap = cap;
    }

    public void setAltEmail(String email) {
        this.altEmail = email;
    }
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCap() {
        return mailboxCap;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                " Company Email: " + email ;
    }
}
