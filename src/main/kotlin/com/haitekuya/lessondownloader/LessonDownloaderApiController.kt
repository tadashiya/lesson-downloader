package com.haitekuya.lessondownloader

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotNull

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
    @field:NotNull(message = "AUDIO_REPLY_HOST_NAME is not set.")
    lateinit var hostName: String
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException : RuntimeException()


