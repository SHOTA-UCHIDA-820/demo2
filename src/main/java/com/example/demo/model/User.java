package com.example.demo.model;

public class User {
    private String name;
    private String email;
    private String phoneNumber; 
    private String inquiryType;

    // コンストラクタ
    public User() {}

    // ゲッター・セッター
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getInquiryType() { return inquiryType; }
    public void setInquiryType(String inquiryType) { this.inquiryType = inquiryType; }
}
