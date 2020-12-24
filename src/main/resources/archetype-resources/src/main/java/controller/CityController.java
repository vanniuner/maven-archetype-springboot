package ${package}.controller;

import ${package}.model.dao.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CityController
 *
 * @author trang
 */
@RestController
@RequestMapping(path = "/city", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class CityController {

    @GetMapping("/get/{id}")
    public ResponseEntity<City> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/list/{ids}")
    public ResponseEntity<List<City>> getByIds(@PathVariable List<Integer> ids) {
        return ResponseEntity.ok(null);
    }

}
