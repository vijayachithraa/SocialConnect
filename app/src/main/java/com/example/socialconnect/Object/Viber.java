package com.example.socialconnect.Object;

public class Viber extends contact {

    private boolean online;

    public Whatsapp(String name, boolean online) {
        super(name);
        this.online = online;
        super.setContactType(ContactType.viber);
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

}

}
