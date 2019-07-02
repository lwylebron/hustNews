package com.lwy.hust.DAO;


import com.lwy.hust.Models.LoginTicket;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface LoginTicketDAO {
    String TABLE_NAME = "loginticket";
    String INSERT_FIELDS = " userId, expired, status, ticket ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId},#{expired},#{status},#{ticket})"})
    int addTicket(LoginTicket ticket);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where ticket=#{ticket}"})
    LoginTicket selectByTicket(String ticket);

    @Update({"update ", TABLE_NAME, " set status=#{status} where ticket=#{ticket}"})
    void updateStatus(@Param("ticket") String ticket, @Param("status") int status);
}
