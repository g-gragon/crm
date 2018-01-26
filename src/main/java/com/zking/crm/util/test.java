//package com.zking.crm.util;
//import com.zking.sell.biz.IProductBiz;
//import com.zking.sell.biz.Product;
//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
//public class test {
//    public static void main(String[] args) {
////        JaxWsProxyFactoryBean bean=new JaxWsProxyFactoryBean();
////        bean.setServiceClass(IProductBiz.class);
////        bean.setAddress("http://localhost:8080/sell/services/Product");
////        IProductBiz client= (IProductBiz) bean.create();
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring-cxf-client.xml");
//        IProductBiz client=  context.getBean("Product",IProductBiz.class);
//        List<Product> response=client.list(null);
//        for(Product p:response){
//            System.out.println(p);
//        }
//    }
//}
