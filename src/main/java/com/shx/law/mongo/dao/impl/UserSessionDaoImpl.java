package com.shx.law.mongo.dao.impl;

import java.util.List;

import com.shx.law.mongo.dao.UserSessionDao;
import com.shx.law.mongo.entity.AuthCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class UserSessionDaoImpl implements UserSessionDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public String getVerifyCode(String phone) {
        Query query = new Query();
        query.addCriteria(new Criteria("phone").is(phone));
        query.with(new Sort(new Order(Direction.DESC, "createDate")));
        AuthCode authCode = mongoTemplate.findOne(query, AuthCode.class);
        return authCode == null ? "" : authCode.getAuthCode();
    }


}
