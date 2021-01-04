package ${package}.model.dao;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
*  tl_user_info
*/
@Data
@NoArgsConstructor
@TableName("tl_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 外部平台id
     */
    private String opId;
    /**
    * user_id
    */
    @TableId(type = IdType.INPUT)
    private Long userId;

    /**
    * first_name
    */
    private String firstName;

    /**
    * last_name
    */
    private String lastName;

    /**
    * 是否为bot，y/n
    */
    private String isBot;

    /**
    * 是否已认证，y/n
    */
    private String isVerified;

    /**
    * is_restricted
    */
    private String isRestricted;

    /**
    * is_support
    */
    private String isSupport;

    /**
    * 语言
    */
    private String languageCode;

    /**
    * username
    */
    private String username;

    /**
    * phone_number
    */
    private String phoneNumber;

    /**
    * create_date
    */
    private Date createDate;

    /**
    * update_date
    */
    private Date updateDate;

}
