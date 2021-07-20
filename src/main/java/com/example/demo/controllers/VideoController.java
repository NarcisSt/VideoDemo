package com.example.demo.controllers;

import com.example.demo.services.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/video")
public class VideoController {

    private final VideoService videoService;

    @GetMapping(value = "/stream/{fileName}")
    public Mono<ResponseEntity<byte[]>> streamVideo(@RequestHeader(value = "Range", required = false) String httpRangeList,
                                                    @PathVariable("fileName") String fileName) {
        return Mono.just(videoService.prepareContent(fileName, httpRangeList));
    }


}
