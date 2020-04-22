package org.example.video.beans;

import lombok.Data;

@Data
public class ControlEntity {
    private String accessToken;
    private String deviceSerial;
    private Integer channelNo;
    private String direction;
    private Integer speed;
}
