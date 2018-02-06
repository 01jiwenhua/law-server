package com.shx.law.service;

import com.shx.law.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getMessage(String type);
}
