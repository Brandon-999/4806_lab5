package main;

import java.io.Serializable;

public class BuddyInfo implements Serializable {
    private String name;
    private String phoneNum;


    public BuddyInfo(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public BuddyInfo(){
        this.name = "";
        this.phoneNum = "";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public boolean equals(BuddyInfo buddy){
        if(buddy == null){
            return false;
        }
        if(!(buddy instanceof BuddyInfo)){
            return false;
        }
        if(this.name == buddy.getName() && this.phoneNum == buddy.getPhoneNum()){
            return true;
        }
        return false;
    }
}
