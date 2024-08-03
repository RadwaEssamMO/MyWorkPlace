package InhertanceExcersize;

public class ClassChallengeExcersize {


    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public ClassChallengeExcersize(){
        System.out.println("Default Constructor  ");
    }
    public ClassChallengeExcersize( String accountNumber, double accountBalance,String customerName ,String email,
                                    String phone){
        System.out.println("Account Constructor has been excuted ");
        this.accountNumber= accountNumber;
        this.accountBalance = accountBalance;
        this.customerName= customerName;
        customerEmail= email;
        customerPhone=phone;



    }
    public  void Depositing(double depositAmount){
        accountBalance +=depositAmount;
        System.out.println("Deposit of $" + depositAmount + "made New balance " + accountBalance );

    }

    public  void Withdrawing( double withdrawAmount){
        if ( accountBalance - withdrawAmount < 0){
            System.out.println(" Insufficient Balance, ypu only have $" +accountBalance +" in your Balance" );
        }else{
            accountBalance -=withdrawAmount;
            System.out.println("Withdraw Amount $" + withdrawAmount + " the remaining Balance "+ accountBalance);
        }

    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }






}
