package com.songyutong.smartaccount.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/16
 */
public class RestTemplateUtil {

    public static <T> T doGet(String url, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T> responseEntity = restTemplate.getForEntity(url, clazz);
        serverIsRight(responseEntity);   //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public static <T, A> T doPostJson(String url, A requestBody, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        //设置提交json格式数据
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<A> request = new HttpEntity<>(requestBody, headers);
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, request, clazz);
        serverIsRight(responseEntity);  //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public static void serverIsRight(ResponseEntity responseEntity) {
        if (responseEntity.getStatusCodeValue() == 200) {
            System.out.println("服务器请求成功：{}" + responseEntity.getStatusCodeValue());
        } else {
            System.out.println("服务器请求异常：{}" + responseEntity.getStatusCodeValue());
        }
    }

}
