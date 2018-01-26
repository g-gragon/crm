
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>storage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="storage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="strId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="strRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strWare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storage", propOrder = {
    "pid",
    "pname",
    "strCount",
    "strId",
    "strRemark",
    "strWare",
    "strWarehouse"
})
public class Storage {

    protected Long pid;
    protected String pname;
    protected Integer strCount;
    protected Long strId;
    protected String strRemark;
    protected String strWare;
    protected String strWarehouse;

    /**
     * 获取pid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置pid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPid(Long value) {
        this.pid = value;
    }

    /**
     * 获取pname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPname() {
        return pname;
    }

    /**
     * 设置pname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPname(String value) {
        this.pname = value;
    }

    /**
     * 获取strCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrCount() {
        return strCount;
    }

    /**
     * 设置strCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrCount(Integer value) {
        this.strCount = value;
    }

    /**
     * 获取strId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStrId() {
        return strId;
    }

    /**
     * 设置strId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStrId(Long value) {
        this.strId = value;
    }

    /**
     * 获取strRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRemark() {
        return strRemark;
    }

    /**
     * 设置strRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRemark(String value) {
        this.strRemark = value;
    }

    /**
     * 获取strWare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWare() {
        return strWare;
    }

    /**
     * 设置strWare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWare(String value) {
        this.strWare = value;
    }

    /**
     * 获取strWarehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWarehouse() {
        return strWarehouse;
    }

    /**
     * 设置strWarehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWarehouse(String value) {
        this.strWarehouse = value;
    }

}
