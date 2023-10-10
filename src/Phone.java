public abstract class Phone implements Printable {
    private  String model;
    private int yearOfIssue;

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Phone(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }
}
