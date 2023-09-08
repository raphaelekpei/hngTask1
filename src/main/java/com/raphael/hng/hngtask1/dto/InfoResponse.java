package com.raphael.hng.hngtask1.dto;

import lombok.*;


@Getter
@Setter
@Builder
public class InfoResponse {
    private String slackName;
    private String currentDay;
    private String utcTime;
    private String track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private Integer statusCode;

}
