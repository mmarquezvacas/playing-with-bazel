package com.mmarquez;
import com.mmarquez.messenger.Messenger;

public class HelloWorld {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        System.out.println(messenger.getMessage());
    }
}