
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>list complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://biz.sell.zking.com/}product" minOccurs="0"/>
 *         &lt;element name="pageBean" type="{http://biz.sell.zking.com/}pageBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list", propOrder = {
    "product",
    "pageBean"
})
public class List {

    protected Product product;
    protected PageBean pageBean;

    /**
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * 获取pageBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PageBean }
     *     
     */
    public PageBean getPageBean() {
        return pageBean;
    }

    /**
     * 设置pageBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PageBean }
     *     
     */
    public void setPageBean(PageBean value) {
        this.pageBean = value;
    }

}
