package org.svenehrke.helloduke;

public class Main {
    public String getGreeting() {
        return "Hello Duke!";
    }

    public static void main(String[] args) {
        System.out.println(new Main().getGreeting());
    }
}
