public class Xiomi extends Phone {
    private String mou;

    public String getMou() {
        return mou;
    }

    public Xiomi(String model, int yearOfIssue, String mou) {
        super(model, yearOfIssue);
        this.mou = mou;
    }

    @Override
    public void print() {
        System.out.println("Xiomi: " + getMou() + " Model: " + getModel() + " YearOfIssue: " + getYearOfIssue());

    }
}
