package com.yeasinrabbee.duaenglish.Adapters;

public class Category_Model {

    private  String id ;

    public  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Category_Model(String id, String name, int icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    private  int icon;


}
