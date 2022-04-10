package za.ac.cput.group6.Entity;
/**Student.java
 * Entity for StudentAddress
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */
public class StudentAddress {
    private String studentId, addressId;

    private StudentAddress(Builder builder){

        this.studentId=builder.studentId;
        this.addressId =builder.addressId;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }

    public static class Builder{

        private String studentId, addressId;

        public Builder setStudentId(String studentId){
            this.studentId=studentId;
            return this;
        }

        public Builder setAddressId(String addressId){

            this.addressId = addressId;
            return this;
        }

        public StudentAddress build(){

            return new StudentAddress(this);
        }

        public StudentAddress.Builder copy(StudentAddress studentAddress){

            this.studentId=studentAddress.studentId;
            this.addressId =studentAddress.addressId;
            return this;
        }
    }
}
