package ${package}.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ${package}.model.dao.City;
import ${package}.model.dto.CityDto;

/**
 * CityMapper
 *
 * @author LZJ
 */
@Mapper
public interface CityMapper extends BaseMapper<City> {
}


/**
 * @author LZJ
 * @time 2020-12-20 20:15:01
 **/
@Mapper
@Repository
public interface CityMapper extends BaseMapper<City> {

    public List<CityDto> cityList(@Param(value = "pageIndex") int pageIndex, @Param(value = "pageSize") int pageSize);

}
