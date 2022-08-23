package za.ac.cput.group6.domain.lookup;

import za.ac.cput.group6.domain.user.Student;
import javax.persistence.Embeddable;

@Embeddable
public class Request {

    private String requestId;
    private String date;
    private Student student;

    public Request(Builder builder) {

        this.requestId = builder.requestId;
        this.date = builder.date;
        this.student = builder.student;


    }


    public Request() {

    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId='" + requestId + '\'' +
                ", date='" + date + '\'' +
                ", student=" + student +
                '}';
    }


    public static class Builder {

        private String requestId;
        private String date;
        private Student student;

        public Builder requestId(String requestId) {

            this.requestId = requestId;
            return this;

        }

        public Builder date(String date) {

            this.date = date;
            return this;

        }

        public Builder student(Student student) {

            this.student = student;
            return this;
        }

        public Request build() {

            return new Request(this);
        }

        public Builder copy(Request request) {

            this.requestId = request.requestId;
            this.date = request.date;
            this.student = request.student;

            return this;


        }
    }

}





