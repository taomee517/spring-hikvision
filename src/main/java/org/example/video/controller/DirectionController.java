package org.example.video.controller;

import org.apache.commons.lang3.StringUtils;
import org.example.video.beans.ControlEntity;
import org.example.video.utils.BeanUtil;
import org.example.video.utils.HttpClientUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("ctrl")
public class DirectionController {

    @RequestMapping(value = "start", method = RequestMethod.POST)
    public ResponseEntity<Boolean> ctrlStart(@RequestBody ControlEntity controlEntity){
        try {
            assert Objects.nonNull(controlEntity);
            assert StringUtils.isNotEmpty(controlEntity.getAccessToken());
            assert StringUtils.isNotEmpty(controlEntity.getDeviceSerial());
            assert Objects.nonNull(controlEntity.getDirection());
            String startApi = "https://open.ys7.com/api/lapp/device/ptz/start";
            System.out.println("控制开始");
//            Map<String,String> ctrlMap = BeanUtil.bean2StrMap(controlEntity);
//            String result = HttpClientUtil.doPost(startApi,ctrlMap);
//            System.out.println("控制开始结果：" + result);
            return ResponseEntity.ok(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("stop")
    public ResponseEntity<Boolean> ctrlStop(@RequestBody ControlEntity controlEntity){
        try {
            assert Objects.nonNull(controlEntity);
            assert StringUtils.isNotEmpty(controlEntity.getAccessToken());
            assert StringUtils.isNotEmpty(controlEntity.getDeviceSerial());
            assert Objects.nonNull(controlEntity.getDirection());
            String startApi = "https://open.ys7.com/api/lapp/device/ptz/stop";
            Map<String,String> ctrlMap = BeanUtil.bean2StrMap(controlEntity);
            String result = HttpClientUtil.doPost(startApi,ctrlMap);
            System.out.println("控制结束结果：" + result);
            return ResponseEntity.ok(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
