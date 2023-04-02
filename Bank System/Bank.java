	import java.util.Scanner;
	class Bank {
    int password1, password;
    int accNo;
    long phoneNumber;
    int choice;
    String cnic;
    String cnic1;
    String email;
    String accHolderName1, accHolderName;
    double balance = 0.0;
    int length;
    boolean loginSuccessful = false;
    boolean accountCreated = false;
    boolean wrongInfo = false;
    boolean wrongData = false;
    Scanner sc = new Scanner(System.in);

    public void fisrtMenu()
    {
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        choice = sc.nextInt();
        sc.nextLine();
    }
    public void secondMenu()
    {
        System.out.println("1. Deposit");
        System.out.println("2. Balance Inquiry");
        System.out.println("3. Get profile");
        System.out.println("4. Exit");
        choice = sc.nextInt();
        sc.nextLine();
    }
    public void create() {
        //sc.nextLine();
        System.out.println("Enter a Name of Holder : ");
        accHolderName = sc.nextLine();
        System.out.print("Enter a CNIC number of Holder : ");
        cnic = sc.next();
        System.out.print("Enter password: ");
        password = sc.nextInt();
        System.out.print("Enter email: ");
        email = sc.next();
        accountCreated = true;

    }

    public void login() {
       System.out.println("Enter cnic:");
       cnic1 = sc.next();
       System.out.println("Enter password");
       password1 = sc.nextInt();
       if(cnic1.equals(cnic) && password1 == password)
       {
           loginSuccessful = true;
       }
       else
       {
           System.out.println("cnic or password does not matches");
           loginSuccessful = false;
       }

    }

    public void deposit()
    {
        try {
            System.out.println("Enter Account Number:");
            accNo = Integer.parseInt(sc.nextLine());
            length = String.valueOf(accNo).length();
            if(length < 8 && wrongInfo == false)
            {
                System.out.println("Account number should be atleast of 8 digits.");
                wrongData = true;
            }
            else {
                System.out.println("Enter Phone Number:");
                phoneNumber = Long.parseLong(sc.nextLine());
                System.out.println("Enter amount you want to deposit:");
                balance = balance + sc.nextDouble();
            }

        }
        catch (NumberFormatException e)
        {
            wrongInfo = true;
            System.out.println("Wrong credentials, please try again");
            wrongData = true;
        }
    }
    public void balanceInquiry()
    {
        System.out.println("Your current balance is " + balance);
    }
    void getProfile(){
        System.out.println("Name:                   " + accHolderName);
        System.out.println("Cnic:                   " + cnic);
        System.out.println("Email:                   " + email);
        System.out.println("Account Balance:                   " + balance);

    }

    public static void main (String args[]){
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        System.out.println("\t Welcome TO CMD \t ");
        b.fisrtMenu();
        while(b.choice!= 1){
            System.out.println("Please Create account first then login");
            b.fisrtMenu();
        }
        b.create();
        System.out.println("Your account has been created successfully. ");
        b.fisrtMenu();
        while(b.choice!= 2)
        {
            System.out.println("Your account is already created just login now");
            b.fisrtMenu();
        }
        while (b.loginSuccessful != true) {
            b.login();
        }
        do {
            b.secondMenu();
            switch (b.choice) {
                case 1:
                    do {
                        b.deposit();
                    }
                    while(b.wrongData == true);
                    break;
                case 2:
                    b.balanceInquiry();
                    break;
                case 3:
                    b.getProfile();
                    break;
                case 4:
                    end = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
        while(end == false);
    }
}
