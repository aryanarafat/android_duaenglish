package com.yeasinrabbee.duaenglish.Adapters;

public class FavoriteModel {



    String title , english, arabic, bangla , refer ;

    public FavoriteModel(String title, String english, String arabic, String bangla, String refer) {
        this.title = title;
        this.english = english;
        this.arabic = arabic;
        this.bangla = bangla;
        this.refer = refer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getBangla() {
        return bangla;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }
}
