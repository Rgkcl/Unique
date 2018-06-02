package com.unique.pojo;

public class ProfessionalInfo {
    private Integer mid;

    private String mname;

    private String jobOrientation;

    private String professionalKnowledage;

    private String skill;

    private String subjec;

    private String industryDefinition;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getJobOrientation() {
        return jobOrientation;
    }

    public void setJobOrientation(String jobOrientation) {
        this.jobOrientation = jobOrientation == null ? null : jobOrientation.trim();
    }

    public String getProfessionalKnowledage() {
        return professionalKnowledage;
    }

    public void setProfessionalKnowledage(String professionalKnowledage) {
        this.professionalKnowledage = professionalKnowledage == null ? null : professionalKnowledage.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getSubjec() {
        return subjec;
    }

    public void setSubjec(String subjec) {
        this.subjec = subjec == null ? null : subjec.trim();
    }

    public String getIndustryDefinition() {
        return industryDefinition;
    }

    public void setIndustryDefinition(String industryDefinition) {
        this.industryDefinition = industryDefinition == null ? null : industryDefinition.trim();
    }
}