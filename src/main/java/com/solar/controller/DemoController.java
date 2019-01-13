package com.solar.controller;


import com.solar.pojo.Fee;
import com.solar.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * 〈controller〉
 *
 * @author Sun
 * @create 2019/1/6
 * @since 1.0.0
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("query/{id}")
    public ResponseEntity<Fee> query(@PathVariable("id") Long id) {
        Fee result = demoService.query(id);
        return ResponseEntity.ok(result);
    }
}