package com.frogobox.springkotlinnewcomer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


/*
 * Created by faisalamir on 23/06/22
 * spring-kotlin-new-comer
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

@RestController
class DemoController {

    @GetMapping("/ping")
    fun ping(): String {
        return "TEST PING"
    }

}