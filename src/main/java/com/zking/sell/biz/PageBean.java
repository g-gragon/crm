
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>pageBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="pageBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageBean", propOrder = {
    "curPage",
    "pageRecord",
    "paginate",
    "totalRecord"
})
public class PageBean {

    protected int curPage;
    protected int pageRecord;
    protected boolean paginate;
    protected int totalRecord;

    /**
     * 获取curPage属性的值。
     * 
     */
    public int getCurPage() {
        return curPage;
    }

    /**
     * 设置curPage属性的值。
     * 
     */
    public void setCurPage(int value) {
        this.curPage = value;
    }

    /**
     * 获取pageRecord属性的值。
     * 
     */
    public int getPageRecord() {
        return pageRecord;
    }

    /**
     * 设置pageRecord属性的值。
     * 
     */
    public void setPageRecord(int value) {
        this.pageRecord = value;
    }

    /**
     * 获取paginate属性的值。
     * 
     */
    public boolean isPaginate() {
        return paginate;
    }

    /**
     * 设置paginate属性的值。
     * 
     */
    public void setPaginate(boolean value) {
        this.paginate = value;
    }

    /**
     * 获取totalRecord属性的值。
     * 
     */
    public int getTotalRecord() {
        return totalRecord;
    }

    /**
     * 设置totalRecord属性的值。
     * 
     */
    public void setTotalRecord(int value) {
        this.totalRecord = value;
    }

}
