package com.example.socialconnect.Object;

public class Email extends Contact {

    private boolean online;

    public Email(String name, boolean online) {
        super(name);
        this.online = online;
        super.setContactType(ContactType.email);
    }

    public boolean isOnline() {
        return online;
    }


    @Override
    public String getData() {
        return super.getData() + "\n\nOnline : " + this.online;
    }
}
