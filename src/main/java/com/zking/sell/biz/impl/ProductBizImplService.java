
package com.zking.sell.biz.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductBizImplService", targetNamespace = "http://impl.biz.sell.zking.com/", wsdlLocation = "http://localhost:8080/sell/services/Product?wsdl")
public class ProductBizImplService
    extends Service
{

    private final static URL PRODUCTBIZIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTBIZIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTBIZIMPLSERVICE_QNAME = new QName("http://impl.biz.sell.zking.com/", "ProductBizImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/sell/services/Product?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTBIZIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTBIZIMPLSERVICE_EXCEPTION = e;
    }

    public ProductBizImplService() {
        super(__getWsdlLocation(), PRODUCTBIZIMPLSERVICE_QNAME);
    }

    public ProductBizImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTBIZIMPLSERVICE_QNAME, features);
    }

    public ProductBizImplService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTBIZIMPLSERVICE_QNAME);
    }

    public ProductBizImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTBIZIMPLSERVICE_QNAME, features);
    }

    public ProductBizImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductBizImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IProductBiz
     */
    @WebEndpoint(name = "ProductBizImplPort")
    public IProductBiz getProductBizImplPort() {
        return super.getPort(new QName("http://impl.biz.sell.zking.com/", "ProductBizImplPort"), IProductBiz.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IProductBiz
     */
    @WebEndpoint(name = "ProductBizImplPort")
    public IProductBiz getProductBizImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.biz.sell.zking.com/", "ProductBizImplPort"), IProductBiz.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTBIZIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTBIZIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTBIZIMPLSERVICE_WSDL_LOCATION;
    }

}