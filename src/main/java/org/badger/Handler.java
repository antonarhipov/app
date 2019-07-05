package org.badger;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    //language=HTML
    return "<html><body><h1>Hello!!</h1></body></html>";
  }

}
