package ${package}.model.dto;

import com.google.common.base.MoreObjects;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;

/**
 * City
 *
 * @author LZJ
 */
@Data
@NoArgsConstructor
public class CityDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String state;

    private String country;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


}
