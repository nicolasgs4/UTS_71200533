package com.rplbo.mycomputer;

public class Smartphone extends Computer{

    private TouchScreen touchScreen;

    public Smartphone(Storage storage , TouchScreen touchScreen){
        super(storage);
        this.touchScreen = touchScreen;
    }

    public void showDisplay(){
        touchScreen.display(this.getStorage());
    }

    public void retrieveData(Integer temp){
        // this.getStorage().addData(temp.toString());
        Integer test = temp;
        this.retrieveData(test.toString());
    }

}
