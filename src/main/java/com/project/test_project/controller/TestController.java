package com.project.test_project.controller;

import static lombok.AccessLevel.PRIVATE;

import com.project.test_project.service.ITestService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class TestController {

  ITestService testService;

  @GetMapping("/hello")
  public ResponseEntity<String> hello() {
    return testService.hello();
  }

}
