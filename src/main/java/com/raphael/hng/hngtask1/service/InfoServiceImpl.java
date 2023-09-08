package com.raphael.hng.hngtask1.service;


import com.raphael.hng.hngtask1.dto.InfoResponse;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public InfoResponse getInfo(String slackName, String track) {

        // Specific user data
        String specificSlackName = "Raphael Ekpei";
        String specificTrack = "backend";

        // Get the current day of the week
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        dayFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String currentDay = dayFormat.format(new Date());

        // Get the current UTC time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTime = dateFormat.format(new Date());

        // Build GitHub URLs
        String githubFileUrl = "https://github.com/your-username/your-repo/blob/main/your-file.ext";
        String githubRepoUrl = "https://github.com/your-username/your-repo";

        // Create the response object
        return InfoResponse
                .builder()
                .slackName(specificSlackName)
                .currentDay(currentDay)
                .utcTime(utcTime)
                .track(specificTrack)
                .githubFileUrl(githubFileUrl)
                .githubRepoUrl(githubRepoUrl)
                .statusCode(200)
                .build();
    }
}
