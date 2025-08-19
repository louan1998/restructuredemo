package org.ai.restructuredemo.myself;

import lombok.Data;

@Data
public class Field {
    private String fieldName;
    private String dataType;
    private String contentType; // field数据库列 | const常量列 | calculate计算列
    private String alias;
    private String source;
}
