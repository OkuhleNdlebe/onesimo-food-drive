package za.ac.cput.group6.domain.user;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;
@Embeddable
public class Student implements Serializable {
    private String studentId;
    private String email;
    @Embedded
    private Name name;
    private boolean fundingStatus;

    protected Student(){

    }
    private Student(Builder builder){
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
        this.fundingStatus = builder.fundingStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public boolean isFundingStatus() {
        return fundingStatus;
    }

    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setName(Name name) {
        this.name = name;
    }

    private void setFundingStatus(boolean fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                ", fundingStatus=" + fundingStatus +
                '}';
    }
    public static class Builder{
        private String studentId;
        private String email;
        private Name name;
        private boolean fundingStatus;

        public Builder setstudentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder setemail(String email){
            this.email = email;
            return this;
        }
        public Builder setname(Name name){
            this.name = name;
            return this;
        }
        public Builder setfundingStatus(boolean fundingStatus){
            this.fundingStatus = fundingStatus;
            return this;
        }
        public Builder copy(Student student){
            this.studentId = student.studentId;
            return  this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
