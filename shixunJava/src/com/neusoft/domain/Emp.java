package com.neusoft.domain;

import java.sql.Date;

/**
 * 与数据库中表字段一一对应的 实体类
 *定义形式为javaBean
 */

public class Emp {
   private int empno;
   private String ename;
   private String job;
    private int magr;
    private Date hiredate;
    private int sal;
    private int comm;
    private int deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, int magr, Date hiredate, int sal, int comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.magr = magr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMagr() {
        return magr;
    }

    public void setMagr(int magr) {
        this.magr = magr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", magr=" + magr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}


