package com.example.socialconnect.Object;

public class Whatsapp extends Contact {

    private boolean online;

    public Whatsapp(String name, boolean online) {
        super(name);
        this.online = online;
        super.setContactType(ContactType.whatsapp);
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String getData() {
        return super.getData() + "\n\nOnline : " + this.online;
    }
}
