package ${package}.controller;

import ${package}.model.dao.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LZJ
 */
@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class UserInfoController {

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(null);
    }


}
