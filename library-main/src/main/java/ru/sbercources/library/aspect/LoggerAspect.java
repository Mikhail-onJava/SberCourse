package ru.sbercources.library.aspect;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggerAspect {

  @Pointcut("bean(*Controller)")
  public void controllers() {

  }
  // будет работать перед вызовом, кастомная настройка
  @Around("controllers()") // pointcut
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable { // joinPoint хранит данные о вызываемом методе
    log.info("Enter: {}.{}() with arguments = {}", // логи, которые отображают вхождение в контроллер
        joinPoint.getSignature().getDeclaringType(),
        joinPoint.getSignature().getName(),
        Arrays.toString(joinPoint.getArgs()));
    Object result = null;
    try {
      result = joinPoint.proceed();
      // логи, которые отображают выход из контроллера
      log.info("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringType(), joinPoint.getSignature().getName(), result);

    } catch (Exception e) {
      log.info("Exception: " + e.getMessage()); // обработка ошибок
    }

    return result;
  }
}
// изучить log4j2.xml, добавить в зависимости properties