package com.tracesource.dao;

import com.tracesource.pojo.Menu;
import com.tracesource.pojo.Power;
import com.tracesource.pojo.Role;
import com.tracesource.pojo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StaffMapper {
    int createRole(List<Role> roles);

    List<Role> getRoleList(String role_id);

    int deleteRole(String role_id);

    int createStaff(Staff staff);

    List<Staff> getStaffList(String staff_id);

    int deleteStaff(String staff_id);

    List<Power> getPowerList();

    List<Power> getRolePowerList(List<Integer> powerIDList);

    List<Menu> getMenuList();

    int updateStaffRole(Map<String,Object> params);

    Staff getStaffByIDAndPass(@Param("staff_id") String staff_id,@Param("staff_pass") String staff_pass);



}
