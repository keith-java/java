package org.apache.dubbo.demo.provider;

/**
 * @version V1.0
 * @Description:
 * @author: zhous
 * @date: 2020/10/14
 */
public interface DemoService {
    String sayHello(String name);

    public String info();

    public String health();
}
