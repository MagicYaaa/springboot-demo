package org.hello.bean;


import org.springframework.beans.factory.annotation.Value;

/**
 * @program: springboot-demo
 * @description:
 * @author: Ya
 * @create: 2018-12-24 18:08
 **/
public class TestJavaConfigBean {
    @Value("${timeout:100}")
    private int timeout;
    private int batch;

    @Value("${batch:200}")
    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getBatch() {
        return batch;
    }

    @Override
    public String toString() {
        return "TestJavaConfigBean{" +
                "timeout=" + timeout +
                ", batch=" + batch +
                '}';
    }
}
