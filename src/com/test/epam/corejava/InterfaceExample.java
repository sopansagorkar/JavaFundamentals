package com.test.epam.corejava;

interface Smartphone {
    public void switchON();
}

class Android implements Smartphone {

    @Override
    public void switchON() {
        System.out.println("Android Switch on");
    }
}

class IOS implements Smartphone {

    @Override
    public void switchON() {
        System.out.println("IOS Switch on");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Android androidOBJ = new Android();
        IOS iosOBJ = new IOS();

        androidOBJ.switchON();
        iosOBJ.switchON();

    }

}
