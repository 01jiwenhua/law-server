package com.shx.law.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.shx.law.Exception.SystemException;
import com.shx.law.service.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件上传service
 * 
 * @author zmh
 * @version V1.0 创建时间：2017年3月30日 下午3:30:30
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {

    /**
     * 上传文件
     * 
     * @param files
     * @return
     * @throws SystemException
     */
    public Map<String, String> uploadFile(MultiValueMap<String, MultipartFile> files) throws SystemException {
        if (null == files) {
            throw new SystemException("图片不能为空", "10048");
        }
        Map<String, String> result = new HashMap();
//        for (Entry<String, List<MultipartFile>> entry : files.entrySet()) {
//            String fileResult = FastDFSUtil.upload(entry.getValue().get(0));
//            result.put(entry.getKey(), fileResult);
//        }
        return result;
    }

}
