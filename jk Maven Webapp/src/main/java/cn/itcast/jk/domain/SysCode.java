package cn.itcast.jk.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SysCode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.SYS_CODE_ID
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.PARENT_ID
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.PARENT_NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String parentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.LAYER_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private BigDecimal layerNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.IS_LEAF
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private BigDecimal isLeaf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.QUOTE_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private BigDecimal quoteNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CNOTE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String cnote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.ICO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String ico;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.ORDER_NO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private BigDecimal orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.STATE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CREATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CREATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.UPDATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private String updatedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.UPDATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    private Date updatedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.SYS_CODE_ID
     *
     * @return the value of SYS_CODE_B.SYS_CODE_ID
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.NAME
     *
     * @return the value of SYS_CODE_B.NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getName() {
        return name;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.NAME
     *
     * @param name the value for SYS_CODE_B.NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.PARENT_ID
     *
     * @return the value of SYS_CODE_B.PARENT_ID
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.PARENT_ID
     *
     * @param parentId the value for SYS_CODE_B.PARENT_ID
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.PARENT_NAME
     *
     * @return the value of SYS_CODE_B.PARENT_NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.PARENT_NAME
     *
     * @param parentName the value for SYS_CODE_B.PARENT_NAME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.LAYER_NUM
     *
     * @return the value of SYS_CODE_B.LAYER_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public BigDecimal getLayerNum() {
        return layerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.LAYER_NUM
     *
     * @param layerNum the value for SYS_CODE_B.LAYER_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setLayerNum(BigDecimal layerNum) {
        this.layerNum = layerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.IS_LEAF
     *
     * @return the value of SYS_CODE_B.IS_LEAF
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public BigDecimal getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.IS_LEAF
     *
     * @param isLeaf the value for SYS_CODE_B.IS_LEAF
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setIsLeaf(BigDecimal isLeaf) {
        this.isLeaf = isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.QUOTE_NUM
     *
     * @return the value of SYS_CODE_B.QUOTE_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public BigDecimal getQuoteNum() {
        return quoteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.QUOTE_NUM
     *
     * @param quoteNum the value for SYS_CODE_B.QUOTE_NUM
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setQuoteNum(BigDecimal quoteNum) {
        this.quoteNum = quoteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CNOTE
     *
     * @return the value of SYS_CODE_B.CNOTE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getCnote() {
        return cnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CNOTE
     *
     * @param cnote the value for SYS_CODE_B.CNOTE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.ICO
     *
     * @return the value of SYS_CODE_B.ICO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getIco() {
        return ico;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.ICO
     *
     * @param ico the value for SYS_CODE_B.ICO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setIco(String ico) {
        this.ico = ico;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.ORDER_NO
     *
     * @return the value of SYS_CODE_B.ORDER_NO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public BigDecimal getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.ORDER_NO
     *
     * @param orderNo the value for SYS_CODE_B.ORDER_NO
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.STATE
     *
     * @return the value of SYS_CODE_B.STATE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.STATE
     *
     * @param state the value for SYS_CODE_B.STATE
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CREATED_BY
     *
     * @return the value of SYS_CODE_B.CREATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CREATED_BY
     *
     * @param createdBy the value for SYS_CODE_B.CREATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CREATED_TIME
     *
     * @return the value of SYS_CODE_B.CREATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CREATED_TIME
     *
     * @param createdTime the value for SYS_CODE_B.CREATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.UPDATED_BY
     *
     * @return the value of SYS_CODE_B.UPDATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.UPDATED_BY
     *
     * @param updatedBy the value for SYS_CODE_B.UPDATED_BY
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.UPDATED_TIME
     *
     * @return the value of SYS_CODE_B.UPDATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.UPDATED_TIME
     *
     * @param updatedTime the value for SYS_CODE_B.UPDATED_TIME
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}