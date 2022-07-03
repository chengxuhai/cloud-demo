package demo.cloud.provider.service;

import demo.cloud.provider.dao.DeptDao;
import demo.cloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
