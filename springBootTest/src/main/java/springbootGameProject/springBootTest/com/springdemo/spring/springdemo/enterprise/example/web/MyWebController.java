package springbootGameProject.springBootTest.com.springdemo.spring.springdemo.enterprise.example.web;

import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.enterprise.example.business.BusinessService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

  @Autowired
  private BusinessService businessService;

  public long returnValueFromBusinessService() {
    return businessService.calculateSum();
  }
}
