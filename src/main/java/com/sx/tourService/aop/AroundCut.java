package com.sx.tourService.aop;

import com.sx.tourService.utils.result.DataResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * @version V1.0
 * @author: hepeng
 * @Title: AroundCut.java
 * @Package:
 * @description:
 * @date: 2023/6/28 10:12
 */
@Component
@Aspect
public class AroundCut {
    public static final String POINT_CUT = "execution(* com.sx.tourService.controller.EmergeMsgController.*(..)) || " +
            "execution(* com.sx.tourService.controller.HotelController.*(..)) || " +
            "execution(* com.sx.tourService.controller.PersonController.*(..)) || " +
            "execution(* com.sx.tourService.controller.RoomController.*(..))||"+
            "execution(* com.sx.tourService.controller.SuitController.*(..))||"+
            "execution(* com.sx.tourService.controller.LoginController.*(..))||";



    @Around(AroundCut.POINT_CUT)
    public DataResult checkSession(ProceedingJoinPoint pjp) throws Throwable {
        //获取session
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        return (DataResult) pjp.proceed();
    }
}
