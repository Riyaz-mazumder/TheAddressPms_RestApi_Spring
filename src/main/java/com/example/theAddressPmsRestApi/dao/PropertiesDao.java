package com.example.theAddressPmsRestApi.dao;

import com.example.theAddressPmsRestApi.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface PropertiesDao extends JpaRepository<Properties, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM theaddress.properties where approval = true and active = true order by id desc;")
    public List<Properties> getApprovedProperties();

    @Query(nativeQuery = true, value = "SELECT * FROM theaddress.properties where approval = true and active = true and area =? order by id desc;")
    public List<Properties> getApprovedPropertiesByAreaSearch(String area);

    @Query(nativeQuery = true, value = "SELECT * FROM theaddress.properties where approval = true and active = true order by id desc limit ? ")
    public List<Properties> getApprovedPropertiesByPage(Integer page);

    @Query(nativeQuery = true, value = "SELECT * FROM theaddress.properties where approval = false  order by id desc;")
    public List<Properties> getUnApprovedProperties();

    @Query(nativeQuery = true, value = "SELECT * FROM theaddress.properties WHERE area = ? AND category = ? AND type = ? AND approval = true AND active = true")
    public List<Properties> getApprovedPropertiesBySearch(String area, String category, String type);

     @Query(value = " SELECT s.id, s.name, s.contact_no, s.email, p.id, p.name, p.price ,p.date , p.user_id FROM  signup s " +
             " left join properties p " +
             " on s.id = p.user_id "+
             " where p.user_id= :id ",nativeQuery = true)
    List<Object[]> userDetails(@Param("id") Long id);

}
