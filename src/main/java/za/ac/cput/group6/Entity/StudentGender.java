package za.ac.cput.group6.Entity;

/**StudentRepository.java
 * Entity for StudentGenderRepository
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

public class StudentGender {
    private String studentId,genderId,description;

    public StudentGender(Builder builder){

        this.studentId=builder.studentId;
        this.genderId=builder.genderId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "StudentGenderRepository{" +
                "studentId='" + studentId + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }

    public static class Builder{

        private String studentId, genderId;

        public Builder setStudentId(String studentId){
            this.studentId=studentId;
            return this;
        }

        public Builder setGenderId(String genderId){

            this.genderId = genderId;
            return this;
        }

        public StudentGender build(){

            return new StudentGender(this);
        }

        public Builder copy(StudentGender studentGender){

            this.studentId=studentGender.studentId;
            this.genderId =studentGender.genderId;
            return this;
        }
    }
}

