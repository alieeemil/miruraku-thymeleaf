package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  public List<User> getUsers() {
    List<User> users = new ArrayList<>();

    User adminUser = new User();
    adminUser.setId("10101");
    adminUser.setName("管理 太郎");
    adminUser.setDepartment("管理部");
    adminUser.setPosition("部長");
    users.add(adminUser);

    User humanResourceUser = new User();
    humanResourceUser.setId("10201");
    humanResourceUser.setName("人事 花子");
    humanResourceUser.setDepartment("人事部");
    humanResourceUser.setPosition("一般社員");
    users.add(humanResourceUser);

    User salesUser = new User();
    salesUser.setId("10301");
    salesUser.setName("営業 次郎");
    salesUser.setDepartment("営業部");
    salesUser.setPosition("部長");
    users.add(salesUser);

    User informationSystemUser = new User();
    informationSystemUser.setId("10801");
    informationSystemUser.setName("情シス 梅子");
    informationSystemUser.setDepartment("情報システム部");
    informationSystemUser.setPosition("一般社員");
    users.add(informationSystemUser);

    User informationSystemUser2 = new User();
    informationSystemUser2.setId("10802");
    informationSystemUser2.setName("情シス 三郎");
    informationSystemUser2.setDepartment("情報システム部");
    informationSystemUser2.setPosition("派遣社員");
    users.add(informationSystemUser2);

    return users;
  }
}