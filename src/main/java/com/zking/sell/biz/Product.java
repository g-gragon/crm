
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>product complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="proRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "proBatch",
    "proId",
    "proName",
    "proPrice",
    "proRemark",
    "proType",
    "proUnit"
})
public class Product {

    protected String proBatch;
    protected Long proId;
    protected String proName;
    protected Float proPrice;
    protected String proRemark;
    protected String proType;
    protected String proUnit;

    /**
     * ��ȡproBatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProBatch() {
        return proBatch;
    }

    /**
     * ����proBatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProBatch(String value) {
        this.proBatch = value;
    }

    /**
     * ��ȡproId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProId() {
        return proId;
    }

    /**
     * ����proId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProId(Long value) {
        this.proId = value;
    }

    /**
     * ��ȡproName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProName() {
        return proName;
    }

    /**
     * ����proName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProName(String value) {
        this.proName = value;
    }

    /**
     * ��ȡproPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProPrice() {
        return proPrice;
    }

    /**
     * ����proPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProPrice(Float value) {
        this.proPrice = value;
    }

    /**
     * ��ȡproRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProRemark() {
        return proRemark;
    }

    /**
     * ����proRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProRemark(String value) {
        this.proRemark = value;
    }

    /**
     * ��ȡproType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProType() {
        return proType;
    }

    /**
     * ����proType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProType(String value) {
        this.proType = value;
    }

    /**
     * ��ȡproUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProUnit() {
        return proUnit;
    }

    /**
     * ����proUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProUnit(String value) {
        this.proUnit = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proBatch='" + proBatch + '\'' +
                ", proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proRemark='" + proRemark + '\'' +
                ", proType='" + proType + '\'' +
                ", proUnit='" + proUnit + '\'' +
                '}';
    }
}
