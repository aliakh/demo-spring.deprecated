package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* demo.service.*.*(..))")
    public Object log(ProceedingJoinPoint jp) throws Throwable {
        LOGGER.info("This: " + jp.getThis());
        LOGGER.info("Target: " + jp.getTarget());
        LOGGER.info("Signature: " + jp.getSignature());
        LOGGER.info("Arguments: " + Arrays.toString(jp.getArgs()));

        Object value = jp.proceed();
        LOGGER.info("Result: " + value);
        return value;
    }
}
