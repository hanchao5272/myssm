package pers.hanchao.myssm.test.log4j;

import org.apache.log4j.Logger;
/**
 * <p>测试log4j</p>
 * @author hanchao 2018/2/10 21:11
 **/
public class Log4jDemo {
    private static final Logger LOGGER = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }
}
