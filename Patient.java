package com.lproject.cropryiot;
public class Patient {

    private String param, value;

    public Patient(){

    }

    public Patient(String param,String value ){
        this.param=param;
        this.value= value;

    }

    public String getParam()
    { return param;
    }

    public void setParam(String param) {
        this.param =param;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}


