package com.grv.dev.decoderdemo.Model;

public class RootObject {

    private String user_name,user_image_url,text;
    private Boolean is_sent_by_me;



    public RootObject(String user_name, String user_image_url, String text, Boolean is_sent_by_me) {
        this.user_name = user_name;
        this.user_image_url = user_image_url;
        this.text = text;
        this.is_sent_by_me = is_sent_by_me;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIs_sent_by_me() {
        return is_sent_by_me;
    }

    public void setIs_sent_by_me(Boolean is_sent_by_me) {
        this.is_sent_by_me = is_sent_by_me;
    }
}
