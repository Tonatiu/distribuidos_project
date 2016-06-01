package com.escom.schoolsaes.model;

import java.util.Date;

public class PlanEstudios {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plan_estudios.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plan_estudios.fecha_inicio
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Date fecha_inicio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plan_estudios.fecha_fin
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Date fecha_fin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plan_estudios.id_materia
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Integer id_materia;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plan_estudios.id_Carrera
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Integer id_Carrera;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plan_estudios.id
     *
     * @return the value of plan_estudios.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plan_estudios.id
     *
     * @param id the value for plan_estudios.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plan_estudios.fecha_inicio
     *
     * @return the value of plan_estudios.fecha_inicio
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plan_estudios.fecha_inicio
     *
     * @param fecha_inicio the value for plan_estudios.fecha_inicio
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plan_estudios.fecha_fin
     *
     * @return the value of plan_estudios.fecha_fin
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plan_estudios.fecha_fin
     *
     * @param fecha_fin the value for plan_estudios.fecha_fin
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plan_estudios.id_materia
     *
     * @return the value of plan_estudios.id_materia
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Integer getId_materia() {
        return id_materia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plan_estudios.id_materia
     *
     * @param id_materia the value for plan_estudios.id_materia
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plan_estudios.id_Carrera
     *
     * @return the value of plan_estudios.id_Carrera
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Integer getId_Carrera() {
        return id_Carrera;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plan_estudios.id_Carrera
     *
     * @param id_Carrera the value for plan_estudios.id_Carrera
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setId_Carrera(Integer id_Carrera) {
        this.id_Carrera = id_Carrera;
    }
}