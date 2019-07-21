package ru.expo.servercontrol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Entity
//@Table(name = "status")
public class Status {

    /*@Id
    @Column("id")
    @GeneratedValue(GenerationType.IDENTITY)*/
    private Integer id;
    private Date date;
    //@Column(name = "num_server")
    private String numServer;
    //@Column(name = "temp_cpu")
    private String tempCPU;
    //@Column(name = "load_cpu")
    private String loadCPU;
    //@Column(name = "load_ram")
    private String loadRAM;
    //@Column(name = "count_view")
    private String countView;
    //@Column(name = "count_click")
    private String countClick;
    //@Column(name = "count_new_user")
    private String countNewUser;
    //@OneToMany(targetEntity = Site.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Site> sites;
    private Long time;

    public Status() {
        sites = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumServer() {
        return numServer;
    }

    public void setNumServer(String numServer) {
        this.numServer = numServer;
    }

    public String getTempCPU() {
        return tempCPU;
    }

    public void setTempCPU(String tempCPU) {
        this.tempCPU = tempCPU;
    }

    public String getLoadCPU() {
        return loadCPU;
    }

    public void setLoadCPU(String loadCPU) {
        this.loadCPU = loadCPU;
    }

    public String getLoadRAM() {
        return loadRAM;
    }

    public void setLoadRAM(String loadRAM) {
        this.loadRAM = loadRAM;
    }

    public String getCountView() {
        return countView;
    }

    public void setCountView(String countView) {
        this.countView = countView;
    }

    public String getCountClick() {
        return countClick;
    }

    public void setCountClick(String countClick) {
        this.countClick = countClick;
    }

    public String getCountNewUser() {
        return countNewUser;
    }

    public void setCountNewUser(String countNewUser) {
        this.countNewUser = countNewUser;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public void addSite(Site site) {
        sites.add(site);
    }
}