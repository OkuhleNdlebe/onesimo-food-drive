package za.ac.cput.group6.Entity;

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
