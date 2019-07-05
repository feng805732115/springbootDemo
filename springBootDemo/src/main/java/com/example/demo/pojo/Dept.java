package com.example.demo.pojo;

public class Dept implements java.io.Serializable {
        /*public Dept(){}*/
        private Integer deptno; // OID
        private String dname;
        private String loc;

        public Integer getDeptno() {
            return deptno;
        }
        public void setDeptno(Integer deptno) {
            this.deptno = deptno;
        }

        public String getDname() {
            return dname;
        }
        public void setDname(String dname) {
            this.dname = dname;
        }
        public String getLoc() {
            return loc;
        }
        public void setLoc(String loc) {
            this.loc = loc;
        }


    }

