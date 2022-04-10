package za.ac.cput.group6.Entity;

public class StudentGender {
private String studentId,genderId,description;

public StudentGender(Builder builder){

    this.studentId=builder.studentId;
    this.genderId=builder.genderId;
}

    @Override
    public String toString() {
        return "StudentGender{" +
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
