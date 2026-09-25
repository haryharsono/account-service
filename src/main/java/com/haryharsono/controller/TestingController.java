package com.haryharsono.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

  @ResponseBody
  @GetMapping("/testing")
  public String testing() {

    return "hello world";
  }
}
