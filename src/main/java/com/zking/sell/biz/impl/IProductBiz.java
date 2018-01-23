
package com.zking.sell.biz.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.zking.sell.biz.ObjectFactory;
import com.zking.sell.biz.PageBean;
import com.zking.sell.biz.Product;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IProductBiz", targetNamespace = "http://biz.sell.zking.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProductBiz {


    /**
     * 
     * @param product
     * @param pageBean
     * @return
     *     returns java.util.List<com.zking.sell.biz.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "list", targetNamespace = "http://biz.sell.zking.com/", className = "com.zking.sell.biz.List")
    @ResponseWrapper(localName = "listResponse", targetNamespace = "http://biz.sell.zking.com/", className = "com.zking.sell.biz.ListResponse")
    public List<Product> list(
        @WebParam(name = "product", targetNamespace = "")
        Product product,
        @WebParam(name = "pageBean", targetNamespace = "")
        PageBean pageBean);

}