package com.project.test_project.service.impl;

import com.project.test_project.service.ITestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

  @Override
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello World");
  }
}
