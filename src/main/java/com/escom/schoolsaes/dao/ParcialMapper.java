package com.escom.schoolsaes.dao;

import com.escom.schoolsaes.model.Parcial;
import com.escom.schoolsaes.model.ParcialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParcialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int countByExample(ParcialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByExample(ParcialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insert(Parcial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insertSelective(Parcial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    List<Parcial> selectByExample(ParcialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    Parcial selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Parcial record, @Param("example") ParcialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExample(@Param("record") Parcial record, @Param("example") ParcialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKeySelective(Parcial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parcial
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKey(Parcial record);
}