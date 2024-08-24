package Index.Persons;
import Index.Dates.Date;

public class Person {
    public Date birthDate;
    
    public void calAge(){
        if ((Date.year_now - birthDate.getYear())<= 150) {
            int year = Date.year_now - birthDate.getYear();
            int month = Date.month_now - birthDate.getMonth();
            int day = Date.day_now - birthDate.getDay();

            System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
        }
    }

}
