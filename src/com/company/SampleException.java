package com.company;

public class SampleException {
    String[] names;

    public SampleException() {
        this.names = new String[5];
    }

    public void setName(int index, String name){
        this.names[index] = name;
    }

    public static void main(String[] args) {
        SampleException sampleException = new SampleException();
        sampleException.setName(6, "James");

        System.out.println(divide(5, 0));
    }

    public static int divide(int one, int two) {
        return one / two;
    }
}
