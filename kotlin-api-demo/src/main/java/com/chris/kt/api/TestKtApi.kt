package com.chris.kt.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * create by: Chris Chan
 * create on: 2019/9/11 5:01
 * use for:
 */
@RestController
@RequestMapping("/kt")
object TestKtApi {
    @GetMapping("testKt")
    fun testKt(): String {
        return "test kotlin api success"
    }
}