package edu.in.basics;

public class Coherts {



    private String employeeName;
    private int age;

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else throw new RuntimeException("provide correct age");
    }

    private String employeeId;
    private Domain domain;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCurriculam() {
        return curriculam;
    }

    public void setCurriculam(String curriculam) {
        this.curriculam = curriculam;
    }

    private String batch;
    private String curriculam;

    public void attendICT() {
    }

    public void doHandsOns() {
    }

    public void interim() {
        System.out.println("Interim exam by BU");
    }

    public void finalEval() {
    }
}

