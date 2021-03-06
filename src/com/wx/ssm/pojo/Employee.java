package com.wx.ssm.pojo;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Income
     *
     * @mbg.generated
     */
    private Integer income;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.ID
     *
     * @return the value of employee.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.ID
     *
     * @param id the value for employee.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Name
     *
     * @return the value of employee.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Name
     *
     * @param name the value for employee.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Description
     *
     * @return the value of employee.Description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Description
     *
     * @param description the value for employee.Description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Tel
     *
     * @return the value of employee.Tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Tel
     *
     * @param tel the value for employee.Tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Type
     *
     * @return the value of employee.Type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Type
     *
     * @param type the value for employee.Type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Income
     *
     * @return the value of employee.Income
     *
     * @mbg.generated
     */
    public Integer getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Income
     *
     * @param income the value for employee.Income
     *
     * @mbg.generated
     */
    public void setIncome(Integer income) {
        this.income = income;
    }
}