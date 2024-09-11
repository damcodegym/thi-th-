package De2;

public class Student extends Person {
    private double markAvg;

    Student() {

    }

    Student(double markAvg) {
        this.markAvg = markAvg;
    }

    Student(int personID, String personName, int dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        this.markAvg = markAvg;
    }
    public double getMarkAvg(){
        return markAvg;
    }
    private void setMarkAvg(double markAvg){
        this.markAvg = markAvg;
    }

    @Override
    public String toString(){
        return "Student[ " +
                "ID :" + getPersonID() +
                ", name :" + getPersonName() +
                ", dateOfBirth :" + getDateOfBirth() +
                ", markAvg :" + markAvg +
                "]"
                ;
    }
}
