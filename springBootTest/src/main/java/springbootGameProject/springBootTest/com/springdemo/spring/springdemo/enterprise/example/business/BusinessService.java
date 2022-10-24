package springbootGameProject.springBootTest.com.springdemo.spring.springdemo.enterprise.example.business;

import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.enterprise.example.data.DataService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

  @Autowired
  private DataService dataService;

  public long calculateSum() {
    List<Integer> data = dataService.getData();
    return data.stream().reduce(Integer::sum).get();
  }
}
