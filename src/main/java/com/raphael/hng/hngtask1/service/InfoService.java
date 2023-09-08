package com.raphael.hng.hngtask1.service;

import com.raphael.hng.hngtask1.dto.InfoResponse;

public interface InfoService {
    InfoResponse getInfo(String slackName, String track);
}
