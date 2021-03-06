package com.wx.ssm.mapper;

import com.wx.ssm.pojo.Wages;
import com.wx.ssm.pojo.WagesExample;
import java.util.List;

public interface WagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    int insert(Wages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    int insertSelective(Wages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    List<Wages> selectByExample(WagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    Wages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Wages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wages
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Wages record);
}