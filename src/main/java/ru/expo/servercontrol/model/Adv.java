package ru.expo.servercontrol.model;

import java.util.Date;

public class Adv {
    private String id;
    private String name;
    private Date date;
    private String sumAll;
    private String sumLast;
    private String sumThis;
    private String view;
    private String priceView;
    private String click;
    private String priceClick;
    private String ctr;

    public Adv() {
        this.date = new Date();
    }

    public Adv(String sumAll, String sumLast, String sumThis, String view, String priceView, String click, String priceClick, String ctr, String id) {
        this.date = new Date();
        this.sumAll = sumAll;
        this.sumLast = sumLast;
        this.sumThis = sumThis;
        this.view = view;
        this.priceView = priceView;
        this.click = click;
        this.priceClick = priceClick;
        this.ctr = ctr;
        this.id = id;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getSumAll() {
        return sumAll;
    }

    public void setSumAll(String sumAll) {
        this.sumAll = sumAll;
    }

    public String getSumLast() {
        return sumLast;
    }

    public void setSumLast(String sumLast) {
        this.sumLast = sumLast;
    }

    public String getSumThis() {
        return sumThis;
    }

    public void setSumThis(String sumThis) {
        this.sumThis = sumThis;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getPriceView() {
        return priceView;
    }

    public void setPriceView(String priceView) {
        this.priceView = priceView;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getPriceClick() {
        return priceClick;
    }

    public void setPriceClick(String priceClick) {
        this.priceClick = priceClick;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }
}
