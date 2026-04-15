package com.yeasinrabbee.duaenglish.Adapters;

public class AllDuaModel {


    String duaTitle , duaCount ;

    boolean isExpanded = false;


    public AllDuaModel(String duaTitle, String duaCount, boolean isExpanded) {
        this.duaTitle = duaTitle;
        this.duaCount = duaCount;
        this.isExpanded = isExpanded;
    }

    public String getDuaTitle() {
        return duaTitle;
    }

    public void setDuaTitle(String duaTitle) {
        this.duaTitle = duaTitle;
    }

    public String getDuaCount() {
        return duaCount;
    }

    public void setDuaCount(String duaCount) {
        this.duaCount = duaCount;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
