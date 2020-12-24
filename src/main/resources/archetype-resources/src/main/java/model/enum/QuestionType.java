package ${package}.model.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author LZJ
 **/
public enum QuestionType {

    MAIN     (  1,  "main"      ,  "Level.1 主页"       ),
    THEME    (  2,  "theme"     ,  "Level.2 主题"       ),
    COURSE   (  3,  "course"    ,  "Level.3 课程"       ),
    CARD     (  4,  "card"      ,  "Level.4 知识卡片"   ),
    QUESTION (  5,  "question"  ,  "Level.5 问题及答案" );
    private int    order;
    private String type;
    private String desc;

    private QuestionType(int order,String type,String desc) {
        this.order = order;
        this.type  = type;
        this.desc  = desc;
    }

    public static QuestionType findType(String command) {
        for (QuestionType type : QuestionType.values()) {
            if (StringUtils.equals(command, type.typeCommand())) {
                return type;
            }
        }
        return null;
    }

    public String type() {
        return type;
    }

    public String typeCommand() {
        return "/" + type;
    }

    public int order() {
        return order;
    }

    public String desc() {
        return desc;
    }

}
