package com.kalaniya.uni.demobackend;

public class Student
{
    private String StudentName;
    private String StudentAge;
    private int StudentId;
    private int ModuleId;
    private String ModuleName;

    public int getModuleId() {
        return ModuleId;
    }

    public void setModuleId(int moduleId) {
        ModuleId = moduleId;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public String getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(String studentAge) {
        StudentAge = studentAge;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}