package com.chris.kt.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * create by: Chris Chan
 * create on: 2019/9/11 5:00
 * use for:
 */
@RestController
@RequestMapping("/javakt")
class TestJavaKtApi {
    @GetMapping("testJavaKt")
    fun testJavaKt(): String {
        return "test javaKt api success"
    }
}
