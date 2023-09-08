package com.raphael.hng.hngtask1.service;

import com.raphael.hng.hngtask1.dto.ApiResponse;

public interface ApiService {
    ApiResponse getInfo(String slackName, String track);
}
