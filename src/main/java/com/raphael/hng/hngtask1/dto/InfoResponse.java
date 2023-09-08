package com.raphael.hng.hngtask1.dto;

import lombok.*;


@Getter
@Setter
@Builder
public class InfoResponse {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_Url;
    private String github_repo_url;
    private Integer status_code;

}
