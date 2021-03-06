package za.ac.cput.group6.Entity;
/**StudentRepository.java
 * Entity for Gender
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */
public class Gender {

    private String genderId;
    private String genderName;

    private Gender(Builder builder){

        this.genderId=builder.genderId;
        this.genderName=builder.genderName;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderName='" + genderName + '\'' +
                '}';
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public static class Builder{

        private String genderId,genderName;

        public Builder setGenderId(String genderId){

            this.genderId=genderId;
            return this;
        }
        public Builder setGenderName(String genderName){

            this.genderName=genderName;
            return this;
        }
        public Gender build(){

            return new Gender(this);
        }
        public Builder copy(Gender gender){

            this.genderId=gender.genderId;
            this.genderName=gender.genderName;

            return this;
        }

    }



}
