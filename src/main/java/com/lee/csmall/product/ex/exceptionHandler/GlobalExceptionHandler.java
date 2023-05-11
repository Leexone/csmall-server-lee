package com.lee.csmall.product.ex.exceptionHandler;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.UnexpectedTypeException;
import java.util.Objects;
import java.util.Set;



/**
 * @author lee
 * 我亦无他,唯手熟尔
 * resolve Controller Exceptrion
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JsonResult serviceExceptionHandler(ServiceException s) {
        log.warn("Exception:", s);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(500);
        jsonResult.setMessage(s.getMessage());
        return jsonResult;
    }


    @ExceptionHandler
    public JsonResult bindExceptionHandler(BindException s) {
        log.warn("BindException", s);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(500);
        log.info("come on ");
        jsonResult.setMessage(Objects.requireNonNull(s.getFieldError()).getDefaultMessage());
        if (jsonResult.getMessage().contains("NumberFormatException")) {
            jsonResult.setMessage("please input number");
        }
        return jsonResult;

    }

    @ExceptionHandler
    public JsonResult constraintViolationExceptionHandler(ConstraintViolationException c) {
        Set<ConstraintViolation<?>> set = c.getConstraintViolations();
        String message =  null;
        for (ConstraintViolation<?> violation : set) {
            message = violation.getMessage();
        }
        log.warn("Exception", c);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(500);
        jsonResult.setMessage(message);
        return jsonResult;

    }


    @ExceptionHandler
    public JsonResult unexpectedTypeExceptionHandler(UnexpectedTypeException c) {
        log.warn("Exception", c);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(500);
        jsonResult.setMessage("please input number");
        return jsonResult;

    }


    @ExceptionHandler
    public JsonResult numberFormatExceptionHandler(NumberFormatException n) {
        log.warn("Exception", n);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setState(500);
        jsonResult.setMessage("please input number");
        return jsonResult;
    }


    @ExceptionHandler
    public String globalExceptionHandler(Throwable s) {
        log.warn("Exception", s);
       return "server busy [see this message pls check terminal]";

    }

}
