package com.wx.ssm.pojo;

public class Service {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.Userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.Tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.ID
     *
     * @return the value of service.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.ID
     *
     * @param id the value for service.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.Userid
     *
     * @return the value of service.Userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.Userid
     *
     * @param userid the value for service.Userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.Password
     *
     * @return the value of service.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.Password
     *
     * @param password the value for service.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.Tel
     *
     * @return the value of service.Tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.Tel
     *
     * @param tel the value for service.Tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}