package com.raphael.hng.hngtask1.controller;

import com.raphael.hng.hngtask1.dto.InfoResponse;
import com.raphael.hng.hngtask1.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/api")
    public ResponseEntity<InfoResponse> getInfo(
            @RequestParam("slack_name") String slackName,
            @RequestParam("track") String track
    ){
        InfoResponse infoResponse = infoService.getInfo(slackName, track);
//        return ResponseEntity.ok(infoResponse);
        return new ResponseEntity<>(infoResponse, HttpStatus.OK);

    }
}
