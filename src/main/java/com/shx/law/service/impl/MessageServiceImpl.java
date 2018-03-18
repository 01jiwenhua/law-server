package com.shx.law.service.impl;

import com.shx.law.entity.Message;
import com.shx.law.entity.MessageExample;
import com.shx.law.mapper.MessageMapper;
import com.shx.law.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("messsageService")
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<Message> getMessage(String type) {
        MessageExample example=new MessageExample();
        MessageExample.Criteria criteria=example.createCriteria();
        criteria.andTypeEqualTo(Integer.valueOf(type));
        return messageMapper.selectByExample(example);
    }
}
