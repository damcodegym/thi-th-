package De2;

public class Person {
    private int personID ;
    private String personName ;
    private int dateOfBirth ;

    public Person(){

    }
    public Person(int personID, String personName, int dateOfBirth){
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }
    public int getPersonID(){
        return personID;
    }
    public String getPersonName(){
        return personName;
    }
    public int getDateOfBirth(){
        return dateOfBirth;
    }
    public void setPersonID(int personID){
        this.personID = personID;
    }
    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString(){
           return "lưu thông tin :" +
                   "ID :" +personID +
                   ", name :" + personName +
                   ", dateOfBirth :" + dateOfBirth
                   ;
    }
}
