package com.example.test.Job;

public class Job {
    private String id;
    private String type;
    private String url;
    private String company;
    private String company_url;
    private String location;
    private String title;
    private String description;
    private String how_to_apply;
    private String company_logo;

    public Job() {
    }

    public Job(String id, String type, String url, String created_at, String company, String company_url,
            String location, String title, String description, String how_to_apply, String company_logo) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.company = company;
        this.company_url = company_url;
        this.location = location;
        this.title = title;
        this.description = description;
        this.how_to_apply = how_to_apply;
        this.company_logo = company_logo;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public String getHow_to_apply() {
        return how_to_apply;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getCompany_url() {
        return company_url;
    }

    public String getCompany() {
        return company;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
