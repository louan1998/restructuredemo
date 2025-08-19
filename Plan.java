package org.ai.restructuredemo.plan;

import lombok.Data;
import org.ai.restructuredemo.processor.IProcessor;

import java.util.List;

@Data
public class Plan {
    protected String planId;
    protected String type; // plan的类型标识
    protected List<Plan> planList; // 子计划列表
    protected String planParam; // 当plan是step时，这里为null
    protected IProcessor processor; // 执行者接口
    protected boolean isPlanListFinished; // 执行状态标识
    protected String source; // 数据源标识
}
