
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>list complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡproduct���Ե�ֵ��
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
     * ����product���Ե�ֵ��
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
     * ��ȡpageBean���Ե�ֵ��
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
     * ����pageBean���Ե�ֵ��
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
