package com.wx.ssm.pojo;

public class Stuff {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuff.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuff.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuff.Description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuff.Pay
     *
     * @mbg.generated
     */
    private Integer pay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuff.ID
     *
     * @return the value of stuff.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuff.ID
     *
     * @param id the value for stuff.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuff.Name
     *
     * @return the value of stuff.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuff.Name
     *
     * @param name the value for stuff.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuff.Description
     *
     * @return the value of stuff.Description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuff.Description
     *
     * @param description the value for stuff.Description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuff.Pay
     *
     * @return the value of stuff.Pay
     *
     * @mbg.generated
     */
    public Integer getPay() {
        return pay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuff.Pay
     *
     * @param pay the value for stuff.Pay
     *
     * @mbg.generated
     */
    public void setPay(Integer pay) {
        this.pay = pay;
    }
}