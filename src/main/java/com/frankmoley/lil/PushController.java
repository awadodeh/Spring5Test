package com.frankmoley.lil;

import javax.servlet.http.PushBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("push")
public class PushController {

   @GetMapping("with")
   public String demoWithPush( PushBuilder push ){

      if ( push != null ){
         push.path( "/img/LinkedInLearning.jpg" );
      }
      return "push";
   }

   @GetMapping("without")
   public String demoWithoutPush(){

      return "without";
   }
}
