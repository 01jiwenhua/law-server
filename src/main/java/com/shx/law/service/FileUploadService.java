package com.shx.law.service;

import java.util.Map;

import com.shx.law.Exception.SystemException;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件上传 service
 * 
 * @author zmh
 * @version V1.0 创建时间：2017年3月30日 下午3:29:39
 */
public interface FileUploadService {
    /**
     * 上传文件
     * 
     * @param files
     * @return
     * @throws com.shx.law.Exception.SystemException
     */
    public Map<String, String> uploadFile(MultiValueMap<String, MultipartFile> files) throws SystemException;
}
