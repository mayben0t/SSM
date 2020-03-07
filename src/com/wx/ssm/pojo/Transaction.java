package com.wx.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.Userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.Companyid
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.Money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.Description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.CurrentTime
     *
     * @mbg.generated
     */
    private Date currenttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.Progress
     *
     * @mbg.generated
     */
    private Integer progress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.ID
     *
     * @return the value of transaction.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.ID
     *
     * @param id the value for transaction.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.Userid
     *
     * @return the value of transaction.Userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.Userid
     *
     * @param userid the value for transaction.Userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.Companyid
     *
     * @return the value of transaction.Companyid
     *
     * @mbg.generated
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.Companyid
     *
     * @param companyid the value for transaction.Companyid
     *
     * @mbg.generated
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.Money
     *
     * @return the value of transaction.Money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.Money
     *
     * @param money the value for transaction.Money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.Description
     *
     * @return the value of transaction.Description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.Description
     *
     * @param description the value for transaction.Description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.CurrentTime
     *
     * @return the value of transaction.CurrentTime
     *
     * @mbg.generated
     */
    public Date getCurrenttime() {
        return currenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.CurrentTime
     *
     * @param currenttime the value for transaction.CurrentTime
     *
     * @mbg.generated
     */
    public void setCurrenttime(Date currenttime) {
        this.currenttime = currenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.Progress
     *
     * @return the value of transaction.Progress
     *
     * @mbg.generated
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.Progress
     *
     * @param progress the value for transaction.Progress
     *
     * @mbg.generated
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}