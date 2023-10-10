public class Samsung extends Phone {
    public String getSamsungAccount() {
        return samsungAccount;
    }

    private String samsungAccount;
    public Samsung(String model, int yearOfIssue,String samsungAccount) {
        super(model, yearOfIssue);
        this.samsungAccount=samsungAccount;
    }

    @Override
    public void print() {
        System.out.println("Samsung: "+getSamsungAccount()+" Model: "+getModel()+" YearOfIssue: "+getYearOfIssue());

    }
}
