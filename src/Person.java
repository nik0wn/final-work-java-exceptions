public class Person {
    private String surname;
    private String name;
    private String boyhood;
    private String birthDate;
    private Integer  phone;
    private char floor;

    public void setSurname(String surname) {
        if(surname.length() >= 3){
            this.surname = surname;
        } else {
            throw new RuntimeException("Ошибка при вводе данных.");
        }
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
    }

    public void setBoyhood(String boyhood) {
        if(boyhood.length() >= 3) {
            this.boyhood = boyhood;
        }
    }

    public void setBirthDate(String birthDate) {
        if(birthDate.length() >= 3) {
            this.birthDate = birthDate;
        }
    }

    public void setPhone(Integer phone) {
       if (phone instanceof Integer){
           this.phone = phone;
       }
    }

    public void setFloor(char floor) {
        if (floor == 'f' || floor == 'm') {
            this.floor = floor;
        }
    }
}
