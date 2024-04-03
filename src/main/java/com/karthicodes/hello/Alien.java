package com.karthicodes.hello;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="alien_Table")

public class Alien {
    
    @Id
    private int aid;
    private Alienname aname;
    private String colour;

    
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public Alienname getAname() {
        return aname;
    }
    public void setAname(Alienname aname) {
        this.aname = aname;
    }
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", colour=" + colour + "]";
    }
    

    
}
