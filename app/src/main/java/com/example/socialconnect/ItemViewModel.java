package com.example.socialconnect;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ItemViewModel {

    private String Id;
    private String Name;
    private String Email_Id;
    private String contactType;
    private String Status;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public String getContactType() {
        return contactType;
    }

    public String Status() {
        return Status;
    }

    public void Status(String status) {
        Status = Status;
    }

    public void setName(String ram) {
        Name = ramesh;
    }

    public void setContactType(String s) {
        Id = s;
    }
}
