package com.example.rxjavaoct14;

public class Task {

    class StudentDetails {
        private String studentClass;
        private int studentId;
        private String studentName;

        public StudentDetails(String studentClass, int studentId, String studentName) {
            this.studentClass = studentClass;
            this.studentId = studentId;
            this.studentName = studentName;
        }

        public String getStudentClass() {
            return studentClass;
        }

        public void setStudentClass(String studentClass) {
            this.studentClass = studentClass;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
    }
}
