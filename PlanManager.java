package org.ai.restructuredemo.plan;

import java.util.List;
import java.util.Map;

public class PlanManager {
    private List<Plan> planChain;  // 有序的计划链
    private Map<String, Plan> planMap;  // 快速查找

    public void addPlan(Plan plan){} // 添加计划
    public void insertPlan(int index, Plan plan){} // 在指定位置插入
    public void removePlan(String planId){} // 删除指定计划
    public void updatePlan(String planId, Plan newPlan){} // 更新计划
    public Plan getPlan(String planId){return null;} // 查询单个计划
    public List<Plan> getAllPlans(){return null;} // 获取所有计划
}
