package com.whstategrid.wuhaistategrid.modle;

import com.whstategrid.wuhaistategrid.bean.ProjectInfo;

import java.util.ArrayList;

public class Constant {
	ArrayList<ProjectInfo> list =null;
	public ArrayList<ProjectInfo> getlist(){
		if(list==null){
			list =new ArrayList<ProjectInfo>();
			list.add(new ProjectInfo("安全策划管理",new String[]{"输变电工程安全管理总体策划框架要求"}, "AQ1"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"业主项目部安全管理台账"}, "AQ2"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"安全监理工作方案"}, "JAQ1"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"施工安全管理及风险控制方案报审表"}, "SAQX2"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"主要施工机械/工器具/安全防护用品(用具）报审表"}, "SAQX3"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"大中型施工机械进场/出场申报表"}, "SAQX4"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"安全文明施工设施配置计划申报表"}, "SAQX5"));
			list.add(new ProjectInfo("安全策划管理",new String[]{"安全文明施工设施进场验收单"}, "SAQX6"));
			list.add(new ProjectInfo("安全风险管理",new String[]{"输变电工程安全施工作业票（B票）"}, "AQ3"));
			list.add(new ProjectInfo("安全风险管理",new String[]{"安全旁站监理记录表"}, "JAQ2"));
			list.add(new ProjectInfo("安全风险管理",new String[]{"安全管理台帐目次"}, "SAQX7"));
			list.add(new ProjectInfo("安全检查管理",new String[]{"安全检查问题整改通知单","管控记录表"}, "AQ11"));
			list.add(new ProjectInfo("安全检查管理",new String[]{"安全检查问题整改反馈单","管控记录表"}, "AQ12"));
			//第一页完成(08132316 第一次   13条)
			list.add(new ProjectInfo("安全文明施工管理",new String[]{"安全文明施工奖励记录"}, "AQ4"));
			list.add(new ProjectInfo("安全文明施工管理",new String[]{"安全文明施工处罚记录"}, "AQ5"));
			list.add(new ProjectInfo("安全应急管理",new String[]{"现场应急处置方案"}, "AQ10"));
			list.add(new ProjectInfo("分包安全管理",new String[]{"施工分包计划一览表","管控记录表"}, "AQ7"));
			list.add(new ProjectInfo("分包安全管理",new String[]{"施工分包人员动态信息汇总表"}, "AQ8"));
			list.add(new ProjectInfo("分包安全管理",new String[]{"施工分包单位考核情况一览表"}, "AQ9"));
			list.add(new ProjectInfo("分包安全管理",new String[]{"电力建设工程分包安全协议范本"}, "SAQX1"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"工程质量通病防治任务书（变电（换流）站土建工程）"}, "ZL1-1"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"工程质量通病防治任务书（变电（换流）站电气安装调试工程）"}, "ZL1-2"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"工程质量通病防治任务书（输电线路工程）"}, "ZL1-3"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"监理实施细则"}, "JZL1"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"质量旁站方案"}, "JZL2"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"质量通病防治控制措施"}, "JZL3"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"质量通病防治措施报审表（表单）","管控记录表"}, "SZLB1/SZLX1"));
			//第二页完成(08132327 第一次   14条)
			list.add(new ProjectInfo("质量策划管理",new String[]{"施工质量验收及评定范围划分报审表（表单）","管控记录表"}, "SALB2/SZLX2"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"工程控制网测量报审表(变电工程）"}, "SZLB3"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"线路复测报审表（线路工程）"}, "SZLX3"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"质量通病防治措施报审表 （附件上传）"}, "SZLB1/SZLX1"));
			list.add(new ProjectInfo("质量策划管理",new String[]{"施工质量验收及评定范围划分报审表 （附件上传）"}, "SALB2/SZLX2"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"质量检查问题整改通知单","管控记录表"}, "ZL2"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"质量检查问题整改反馈单","管控记录表"}, "ZL3"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"见证取样统计表"}, "JZL4"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"设备材料开箱检查记录表"}, "JZL5"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"旁站监理记录表"}, "JZL6"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"计量器具台账"}, "JZL6"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"主要测量计量器具/试验设备检验报审表","管控记录表"}, "SZLB5/SZLX5"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"试验（检测）单位资质报审表"}, "SZLB6/SZLX6"));
			//第三页完成(08132335 第一次   13条)
			list.add(new ProjectInfo("施工质量管理",new String[]{"乙供主要材料及构配件供货商资质报审表"}, "SZLB7/SZLX7"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"乙供工程材料/构配件/设备进场报审表"}, "SZLB8/SZLX8"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"产品检验记录"}, "SZLB9/SZLX9"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"甲供主要设备（材料/构配件）开箱申请表"}, "SZLB10/SZLX10"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"材料试验委托单"}, "SZLB11/SZLX11"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程材料/构配件/设备缺陷通知单"}, "SZLB12/SZLX12"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"设备（材料/构配件）缺陷处理报验表"}, "SZLB13/SZLX13"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"特殊工种/特殊作业人员报审表"}, "SZLB14/SZLX14"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"试品/试件实验报告报验表"}, "SZLB15/SZLX15"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"同条件混凝土试块养护温度记录"}, "SZLB16"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"混凝土试块抗压强度汇总表"}, "SZLB17"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"混凝土试块抗压强度汇总及评定表","管控记录表"}, "SZLB18"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"跟踪管理记录（水泥）"}, "SZLB19"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"跟踪管理记录（钢筋）"}, "SZLX19"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"变电工程施工强制性条文执行记录表"}, "SZLB20"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"输电工程施工强制性条文执行记录表"}, "SZLX20"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程质量通病防治工作总结（变电（换流）站土建工程）"}, "SZLB2101"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程质量通病防治工作总结（变电（换流）站电气安装调试工程）"}, "SZLB2102"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程质量通病防治工作总结（输电线路工程）"}, "SZLX21"));
			//第四页完成(08132345 第一次   19条)
			list.add(new ProjectInfo("施工质量管理",new String[]{"过程质量检查表"}, "SZLB22"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程安全事故/质量事件报告表"}, "SZLB24/SZLX24"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程安全事故/质量事件处理方案报审表"}, "SZLB25/SZLX25"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程安全事故/质量事件处理结果报验表）"}, "SZLB26/SZLX26"));
			list.add(new ProjectInfo("施工质量管理",new String[]{"工程质量问题处理单"}, "SZLB23"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"输变电工程标准工艺应用率及应用效果评分表"}, "ZL4"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"输变电工程标准工艺管理及应用效果评价表"}, "ZL5"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"监理初检方案"}, "JZL7"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"监理初检报告"}, "JZL8"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程质量中间验收申请表"}, "JZL9"));
			//第五页完成(08132350 第一次   10条)
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程竣工预验收申请表"}, "JZL10"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程验评记录统计报审表"}, "JZL11"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程质量评估报告"}, "JZL12"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程质量通病防治工作评估报告"}, "JZL13"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"工程质量问题台账"}, "SZLB27"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"调试报告报审表"}, "SZLB28"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"公司级专检申请表"}, "SZLB29/SZLX28"));
			list.add(new ProjectInfo("质量验收管理",new String[]{"监理初检申请表"}, "SZLB30/SZLX29"));
			//第六页完成(08132354 第一次   8条)
			//完 共77条
		}
		return list;
	}
}
