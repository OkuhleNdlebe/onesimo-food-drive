package za.ac.cput.group6.domain.user;

import za.ac.cput.group6.domain.lookup.Address;

public class StudentAddress {
    private Student studentId;
    private Address address;

    protected StudentAddress(){

    }
    private StudentAddress(Builder builder){
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public Student getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId=" + studentId +
                ", address=" + address +
                '}';
    }
    public static class Builder{
        private Student studentId;
        private Address address;

        public Builder setstudentId(Student studentId){
            this.studentId = studentId;
            return this;
        }

        public Builder setAddress(Address address){
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress){
            this.studentId = studentAddress.studentId;
            return this;
        }
        public StudentAddress build(){
            return new StudentAddress(this);
        }
    }
}
