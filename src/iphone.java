public class iphone extends Phone {
    private String aiCloud;

    public String getAiCloud() {
        return aiCloud;
    }

    public iphone(String model, int yearOfIssue, String aiCloud) {
        super(model, yearOfIssue);
        this.aiCloud=aiCloud;
    }

    @Override
    public void print() {
        System.out.println("iphone: "+getAiCloud()+" Model: "+getModel()+" YearOfIssue: "+getYearOfIssue());

    }
}
