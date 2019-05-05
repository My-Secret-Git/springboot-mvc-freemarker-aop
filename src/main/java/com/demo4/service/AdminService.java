package com.demo4.service;

import com.demo4.dao.AdminDao;
import com.demo4.dao.AlumniDao;
import com.demo4.dao.InsertLogDao;
import com.demo4.entity.Admin;
import com.demo4.entity.Alumni;
import com.demo4.entity.InsertLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private AlumniDao alumniDao;

    /**
     * findAllAdmin
     * @return List<Admin>
     */
    public List<Admin> findAllAdmin(){
        return adminDao.findAll();
    }

    /**
     * login
     * @param username
     * @param password
     * @return that
     */
    public Admin login(String username,String password){
        Admin admin=adminDao.findByUsername(username);
        if (admin.getPassword().equals(password)){
            return admin;
        }
        else {
            return null;
        }
    }

    /**
     * find Admin By username
     * @param username
     * @return
     */
    public Admin findByUsername(String username){
        return adminDao.findByUsername(username);
    }
    /**
     * save alumni
     * @param alumni
     * @return isSuccess
     */
    public int saveAlumni(Alumni alumni){
        return alumniDao.saveAlumni(alumni);
    }

    /**
     * saveAdmin
     * @param admin
     * @return
     */
    public int saveAdmin(Admin admin){
        return adminDao.saveAdmin(admin);
    }
    /**
     * findAllAlumni
     * @return List<Alumni>
     */
    public List<Alumni> findAllAlumni(){
        return alumniDao.findAll();
    }

    /**
     * delete alumni
     * @param id
     * @return
     */
    public int deleteAlumni(Integer id){
        return alumniDao.delete(id);
    }
}
