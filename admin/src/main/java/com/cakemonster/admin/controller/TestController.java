package com.cakemonster.admin.controller;

import com.cakemonster.admin.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author cakemonster
 * @date 2024/6/9
 */
@RestController
public class TestController {

    @GetMapping("/employee/basic/test")
    public Result<String> testEpl() {
        return Result.success("成功");
    }

    @GetMapping("/personnel/emp/test")
    public Result<String> testPer() {
        return Result.success("成功");
    }
}
