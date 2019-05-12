package org.imooc.miaosha1.common.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.imooc.miaosha1.util.kit.HttpKit;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 拦截器：记录用户操作日志，检查用户是否登录……
 *
 * @author XuJijun
 * 来源:https://blog.csdn.net/clementad/article/details/52035199
 */
@Slf4j
@Aspect
@Component
public class ControllerInterceptor {
    /**
     * 定义拦截规则：拦截com.xjj.web.controller包下面的所有类中，有@RequestMapping注解的方法。
     * 00
     * (@annotation(org.springframework.web.bind.annotation.RequestMapping)||@annotation(org.springframework.web.bind.annotation.GetMapping)||@annotation(org.springframework.web.bind.annotation.PostMapping))
     */
    @Pointcut("execution(* org.imooc.miaosha1.controller.*..*(..)) && (@annotation(org.springframework.web.bind.annotation.RequestMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.GetMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.PostMapping))")
    public void controllerMethodPointcut() {
    }

//    @Autowired
//    LogService logService;

    /**
     * 拦截器具体实现
     *
     * @param pjp
     * @return JsonResult（被拦截方法的执行结果，或需要登录的错误提示。）
     */
    @Around("controllerMethodPointcut()") //指定拦截器规则；也可以直接把“execution(* com.xjj.........)”写进这里
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        //获取被拦截的方法
        Method method = signature.getMethod();

        String pathUrl = HttpKit.getRequest().getRequestURI();
        //获取被拦截的方法名
        String methodName = method.getName();

        //保存所有请求参数，用于输出到日志中
        Set<Object> allParams = new LinkedHashSet<>();

        log.info("请求开始，方法：{}", methodName);

        Object result = null;

        // 一切正常的情况下，继续执行被拦截的方法

        try {
            result = pjp.proceed();
//            ThreadContextValue.THREAD_USERID.remove();
        } catch (Throwable throwable) {
//            ThreadContextValue.THREAD_USERID.remove();
            throwable.printStackTrace();
            throw throwable;
        }
        long costMs = System.currentTimeMillis() - beginTime;
        log.info("{}请求结束，耗时：{}ms", methodName, costMs);

        // 保存记录到日志
//        Log log = new Log(OperateType.getOperateTypeEnumByUrl(pathUrl).getCode(), "", 0L, Long.valueOf(costMs).doubleValue());
//        logService.save(log);
        return result;
    }


}
