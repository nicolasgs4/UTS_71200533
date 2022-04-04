package com.rplbo.mycomputer;

public class Storage {
    private String[] storage;
    private int sizeOfData;

    public Storage(int sizeOfData){
        this.sizeOfData = sizeOfData;
        this.storage = new String [sizeOfData];
        for(int i =0 ; i<sizeOfData ; i++){
            storage[i] = "";
        }
    }

    public String getData(int index){
        if(index > sizeOfData)
            return "false";
        return this.storage[index];
    }

    public int getSizeOfData(){
        return this.sizeOfData;
    }

    public boolean addData(String addData){
        //search for empty slot,if there any add to array dan return true
        for(int i=0 ; i<sizeOfData ; i++){
            if(this.storage[i] == ""){
                this.storage[i] = addData;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String temp = "";
        for(int i=0 ; i<sizeOfData ; i++){
            if(storage[i] == ""){
                // System.out.println(i + " : Empty");
                // temp = i + " : Empty" + "\n";
            }
            else{
                System.out.println(i + " : " + storage[i]);
                temp = i + " : "+ storage[i] + "\n";
            }
        }
        return temp;
    }
}
