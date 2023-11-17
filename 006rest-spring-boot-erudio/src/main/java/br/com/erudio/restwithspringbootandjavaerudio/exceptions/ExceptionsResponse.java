package br.com.erudio.restwithspringbootandjavaerudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionsResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestmp;
    private String message;
    private String detils;

    public ExceptionsResponse(Date timestmp,String detils,String message) {
        this.timestmp = timestmp;
        this.message = message;
        this.detils = detils;
    }

    public Date getTimestmp() {
        return timestmp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetils() {
        return detils;
    }

    public void setDetils(String detils) {
        this.detils = detils;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestmp(Date timestmp) {
        this.timestmp = timestmp;
    }

}
