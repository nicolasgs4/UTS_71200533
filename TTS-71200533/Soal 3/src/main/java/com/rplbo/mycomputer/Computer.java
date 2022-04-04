package com.rplbo.mycomputer;

public class Computer {
    private int ID;
    private static int GlobalID=0;
    private CableData cableData = null;
    private Storage storage;

    public Computer(Storage storage){
        this.storage = storage;
        this.ID = GlobalID;
        GlobalID++;
    }

    public Storage getStorage(){
        return this.storage;
    }

    public boolean detachCableData(){
        if(cableData != null){
            cableData.detach(this);
            cableData = null;
            return true;
        }
        return false;
    }

    public void retrieveData(String temp){
        storage.addData(temp);
    }

    public boolean sendData(String temp){
        if(cableData.sendData(this, temp)){
            return true;
        }
        return false;
    }

    public int getID(){
        return this.ID;
    }

    public boolean attachCableData(CableData temp){
        if(temp.getComputer1() == null || temp.getComputer2() == null){
            if(temp.getComputer1() == null)
                temp.attach(this);
            else
                temp.attach(this);
            this.cableData = temp;
            return true;
        }
        return false;

    }
}
