package com.myapplicationdev.android.tw_listview;

public class Module {
    private String module;
    private boolean star;

    public Module (String module,  boolean star){
        this.module = module;
        this.star = star;
    }

    public String getModule() {
        return module;
    }
    public boolean isStar(){
        return star;
    }
}

