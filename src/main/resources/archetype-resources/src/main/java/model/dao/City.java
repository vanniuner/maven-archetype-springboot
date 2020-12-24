package ${package}.model.dao;

import java.io.Serializable;
import java.util.Date;
import com.alibaba.fastjson.JSON;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * City
 *
 * @author trang
 */
@Data
@NoArgsConstructor
@TableName("city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}