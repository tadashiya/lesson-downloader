package com.haitekuya.lessondownloader

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class AudioReplyController {

    @GetMapping("/")
    fun getList() {

    }
}

@Component
@ConfigurationProperties(prefix = "audio.reply")
@Validated
class AudioReplyProperties {
    @NotNull
    lateinit var hostName: String
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException : RuntimeException()
