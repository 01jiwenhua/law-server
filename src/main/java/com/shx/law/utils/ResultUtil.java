package com.shx.law.utils;

import com.shx.law.vo.request.Request;
import com.shx.law.vo.response.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

/**
 * Created by xuan on 2017/12/23.
 */
public class ResultUtil {
    private static Log log = LogFactory.getLog(ResultUtil.class);
    public static Response buidSuccess(Integer page,Integer pageSize,Map<String,Object> result){
        Response response=new Response();
        response.setPage(page);
        response.setPageSize(pageSize);
        response.setData(result);
        log.debug("success:"+result);
        response.setMessage("请求成功");
        response.setMessageCode("10000");
        return response;
    }
    public static Response buidSuccess(Map<String,Object> result){
        Response response=new Response();
        response.setData(result);
        log.debug("success:"+result);
        response.setMessage("请求成功");
        response.setMessageCode("10000");
        return response;
    }
    public static Response buidFail(String message,String messageCode){
        Response response=new Response();
        response.setMessage(message);
        log.debug("fail:"+message);
        response.setMessageCode(messageCode);
        return response;
    }
}
