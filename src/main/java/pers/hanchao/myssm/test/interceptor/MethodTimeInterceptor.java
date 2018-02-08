package pers.hanchao.myssm.test.interceptor;

import org.apache.log4j.Logger;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Clock;

/**
 * 简单的方法执行时间拦截器，用来验证mvc拦截器可用
 * Created by 韩超 on 2018/2/8.
 */
public class MethodTimeInterceptor extends HandlerInterceptorAdapter{
    private final static Logger LOGGER = Logger.getLogger(MethodTimeInterceptor.class);
    private ThreadLocal<Long> startTime = new ThreadLocal<Long>();
    /**
     * <p>Title: 方法执行前记录时间</p>
     * @author 韩超@bksx 2018/2/8 10:20
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果是方法处理
        if (handler instanceof HandlerMethod){
            //Java 8 Clock
            startTime.set(Clock.systemDefaultZone().millis());
        }
        return true;
    }

    /**
     * <p>Title: 方法执行完成计算时间</p>
     * @author 韩超@bksx 2018/2/8 10:20
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        //如果是方法处理
        if (handler instanceof HandlerMethod){
            //获取方法处理时间
            Long useTime = Clock.systemDefaultZone().millis() - startTime.get();
            StringBuffer sb = new StringBuffer();
            //设置访问URI
            sb.append("[URI = ").append(request.getRequestURI());
            //设置请求类型
            sb.append(", type = ").append(request.getMethod());
            //设置用时
            sb.append(", useTime = ").append(useTime).append("ms]");
            LOGGER.info(sb.toString());
        }
    }

}
