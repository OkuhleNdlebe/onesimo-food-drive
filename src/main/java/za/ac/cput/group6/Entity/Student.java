package za.ac.cput.group6.Entity;

/**StudentRepository.java
 * Entity for StudentRepository
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

public class Student {








    private String studentId,
            firstName,
            lastName,cellphoneNo,
            gender;

    private  Student (Builder builder) {

        this.studentId=builder.studentId;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.cellphoneNo=builder.cellphoneNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "StudentRepository{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellphoneNo='" + cellphoneNo + '\'' +
                ", gender='" + gender + '\'' +
                ", studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellphoneNo='" + cellphoneNo + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder{
        private String studentId,firstName,lastName,cellphoneNo,gender;

        public Builder setStudentId(String studentId){

            this.studentId=studentId;
            return this;
        }
        public Builder setStudentFirstName(String firstName){

            this.firstName=firstName;
            return this;
        }
        public Builder setStudentLastName(String lastName){

            this.lastName=lastName;
            return this;
        }

        public Builder setCellphoneNo(String cellphoneNo){

            this.cellphoneNo=cellphoneNo;
            return this;
        }
        public Builder setGender(String gender){

            this.gender=gender;
            return this;
        }

        public Student build(){

            return new Student(this);
        }


        public Builder copy(Student student){

            this.studentId=student.studentId;
            this.firstName=student.firstName;
            this.lastName=student.lastName;
            this.cellphoneNo=student.cellphoneNo;
            return this;
        }

    }
}
