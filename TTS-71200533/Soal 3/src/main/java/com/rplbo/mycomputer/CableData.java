package com.rplbo.mycomputer;

public class CableData {
    private Computer computer1 = null;
    private Computer computer2 = null;

    public boolean attach(Computer temp){
        if(computer1 == null || computer2 == null){
            if(computer1 == null)
                this.computer1 = temp;
            else
                this.computer2 = temp;
            return true;
        }
        return false;
    }

    public boolean detach(Computer temp){
        if(computer1 != null && computer1.getID() == temp.getID()){
            computer1 = null;
            return true;
        }
        else if(computer2 != null &&computer2.getID() == temp.getID()){
            computer2 = null;
            return true;
        }
        return false;
    }

    public Computer getComputer1(){
        return this.computer1;
    }

    public Computer getComputer2(){
        return this.computer2;
    }

    public boolean sendData(Computer tempComp , String tempData){
        if(computer1 != null && computer2 != null && computer1.getID() == tempComp.getID()){
            computer2.retrieveData(tempData);
            return true;
        }
        else if(computer1 != null && computer2 != null && computer2.getID() == tempComp.getID() ){
            computer1.retrieveData(tempData);
            return true;
        }
        return false;
    }
}

