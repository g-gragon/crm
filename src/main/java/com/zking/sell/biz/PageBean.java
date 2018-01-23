
package com.zking.sell.biz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>pageBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcurPage���Ե�ֵ��
     * 
     */
    public int getCurPage() {
        return curPage;
    }

    /**
     * ����curPage���Ե�ֵ��
     * 
     */
    public void setCurPage(int value) {
        this.curPage = value;
    }

    /**
     * ��ȡpageRecord���Ե�ֵ��
     * 
     */
    public int getPageRecord() {
        return pageRecord;
    }

    /**
     * ����pageRecord���Ե�ֵ��
     * 
     */
    public void setPageRecord(int value) {
        this.pageRecord = value;
    }

    /**
     * ��ȡpaginate���Ե�ֵ��
     * 
     */
    public boolean isPaginate() {
        return paginate;
    }

    /**
     * ����paginate���Ե�ֵ��
     * 
     */
    public void setPaginate(boolean value) {
        this.paginate = value;
    }

    /**
     * ��ȡtotalRecord���Ե�ֵ��
     * 
     */
    public int getTotalRecord() {
        return totalRecord;
    }

    /**
     * ����totalRecord���Ե�ֵ��
     * 
     */
    public void setTotalRecord(int value) {
        this.totalRecord = value;
    }

}
