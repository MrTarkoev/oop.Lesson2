
public class Human {

    public static final String DEFAULT_STRING = "Информация не указана";
    private String yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (isValidString(town)) {
            this.town = town;

        }
        else{
            this.town = DEFAULT_STRING;
        }

    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString(){
        return "Привет! Меня зовут " + name +
                " Я из города " + town + ". Я родился в " + yearOfBirth + " году.Я работаю на должности " + jobTitle + " Будем знакомы!";
    }
    public void setYearOfBirth (String  yearOfBirth) {
        if (yearOfBirth!=null) {
            if (yearOfBirth.isBlank()) {
                this.yearOfBirth = DEFAULT_STRING;
            } else {
                if (Integer.parseInt(yearOfBirth) < 0) {
                    this.yearOfBirth = DEFAULT_STRING;
                } else {
                    this.yearOfBirth = yearOfBirth;
                }
            }
        } else {
            this.yearOfBirth = DEFAULT_STRING;
        }
        }

    private boolean isValidString(String str) {
        if (str == null) {
            return false;
        } else {
            if(str.isBlank()){
                return false;
            }else{
                return true;
            }
        }
    }


    Human (String name, String town, String yearOfBirth, String jobTitle) {

        setYearOfBirth(yearOfBirth);
        setTown(town);
        this.name = name;
        this.jobTitle = jobTitle;

        if  (!isValidString(name)) {
            this.name =DEFAULT_STRING;
        }else {
            this.name = name;
        }
        if  (!isValidString(town)) {
            this.town = DEFAULT_STRING;
        }else {
            this.town = town;
        }
        if  (!isValidString(jobTitle)) {
            this.jobTitle =DEFAULT_STRING;
        }else {
            this.jobTitle = jobTitle;
        }

    }
}


