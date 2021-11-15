package com.hz;

import java.util.ArrayList;

public class Adapter {
private String[] passablePostives = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
private ConsoleReader reader;

    public Adapter(ConsoleReader reader) {
        this.reader = reader;
    }
    
    public boolean correctMessage(){
        String read = this.reader.readLine();
        for (String s :passablePostives) {
        if (read.equals(s)) {
            return true;
        }
        }
        return false;
    }

    public String[] getPassablePostives() {
        return passablePostives;
    }

    public void setPassablePostives(String[] passablePostives) {
        this.passablePostives = passablePostives;
    }

    public ConsoleReader getReader() {
        return reader;
    }

    public void setReader(ConsoleReader reader) {
        this.reader = reader;
    }
}
