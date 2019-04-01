package com.kalaniya.uni.demobackend;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration
{
        private List<Student> studentRecords;
        private static com.kalaniya.uni.demobackend.StudentRegistration stdregd = null;
        private StudentRegistration()
        {
            studentRecords = new ArrayList<Student>();
        }
        public static com.kalaniya.uni.demobackend.StudentRegistration getInstance() {
            if(stdregd == null) {
                stdregd = new com.kalaniya.uni.demobackend.StudentRegistration();
                return stdregd;
            }
            else {
                return stdregd;
            }
        }
        public void add(Student std) {
            studentRecords.add(std);
        }
        public String upDateStudent(Student std) {
            for(int i=0; i<studentRecords.size(); i++)
            {
                Student stdn = studentRecords.get(i);
                if(stdn.getStudentId()==(std.getStudentId())) {
                    studentRecords.set(i, std);
                    return "Update successful";
                }
            }
            return "Update un-successful";
        }
        public String deleteStudent(int id) {
            for(int i=0; i<studentRecords.size(); i++)
            {
                Student stdn = studentRecords.get(i);
                if(stdn.getStudentId()==(id)){
                    studentRecords.remove(i);
                    return "Delete successful";
                }
            }
            return "Delete un-successful";
        }
        public List<Student> getStudentRecords() {
            return studentRecords;
        }
}
