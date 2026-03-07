package com.platform.controller;

import com.platform.service.GreetingService;
import com.platform.service.MathService;
import com.platform.service.TimeService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

//  private final GreetingService greetingService;
    private final ObjectProvider<GreetingService> greetingServiceObjectProvider;
  private final TimeService timeService;
  private  final MathService mathService;

  private  final String appName;

    public TestController(ObjectProvider<GreetingService> greetingServiceObjectProvider,
                          TimeService timeService, MathService mathService, String appName)
    {
        this.greetingServiceObjectProvider = greetingServiceObjectProvider;
//        this.greetingService = greetingService;
        this.timeService = timeService;
        this.mathService = mathService;
        this.appName = appName;
    }


    @GetMapping("/hello")
    public String hello() {

//        return "Application is running   "+
//                greetingService.greeting() + " at  " +
//                timeService.getTime();
         GreetingService greetingServiceObj= greetingServiceObjectProvider.getObject();

        return greetingServiceObj.getid().toString();
    }



     @GetMapping("/multiply")
    public String multiply()
     {
         return String.valueOf(mathService.multiply(5,6));
     }

     @GetMapping("/appName")
    public String getAppName()
     {
         return appName;
     }

}
