package com.shx.law.service;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Company;
import com.shx.law.entity.Department;
import com.shx.law.entity.Job;
import com.shx.law.entity.Law;
import com.shx.law.vo.request.LawRequest;

import java.util.List;

public interface UserService {
     List<Company> getConpanyList();
     List<Department> getDepartmentList(String companyId);
     List<Job> getJobList();

}
