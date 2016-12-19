package com.whstategrid.wuhaistategrid.modle;

import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/19.
 */
public class Constant_LDHQ {
    public static String[] getNames() {
        return names;
    }

    public static String[] names = {"输变电工程流动红旗竞赛检查评分表(变电站工程安全质量部分)", "输变电工程流动红旗竞赛检查评分表(输电线路安全质量部分)", "输变电工程流动红旗竞赛检查评分表(变电和线路工程项目管理部分)"};
    // public static String[] names = {"输变电工程流动红旗竞赛检查评分表(变电站工程安全质量部分)"};

    public static ArrayList<ArrayList<LDHQCinfo>> getLDHQinfos() {
        ArrayList<ArrayList<LDHQCinfo>> list = new ArrayList<>();
        list.add(get1());
        list.add(get2());
        list.add(get3());
        return list;
    }

    private static ArrayList<LDHQCinfo> get1() {
        ArrayList<LDHQCinfo> infolist = new ArrayList<>();
        infolist.add(new LDHQCinfo(1, "1", "安全管理"));
        infolist.add(new LDHQCinfo(1, "1.1", "安全管理体系建立及运转"));
        infolist.add(new LDHQCinfo(2, "落实安全生产规章制度", "1.1.1", new String[]{"建设单位（业主项目部）按照要求建立工程项目安全管理责任制、安全工作例会、安全检查工作、基建安全信息管理、工程分包安全管理、安全奖惩细则等机制；内容符合国家、行业、公司现行规定；实施记录符合要求（重点抽查安全例会记录、安全奖惩记录等至少两项实施记录）（参照《内蒙古电力（集团）有限责任公司基本建设安全管理规定》等）", " 监理项目部按照要求建立安全责任制、安全监理例会、安全监理交底、安全审查备案、安全巡视和旁站工作、安全检查签证、安全工作奖惩等机制；内容符合国家、行业、公司现行规定；安全管理体系运转流畅，实施记录符合要求（重点抽查监理安全检查签证记录、安全旁站记录、巡视记录等）（参照《内蒙古电力（集团）有限责任公司基本建设安全管理规定》等）", " 施工项目部按照要求建立施工安全责任制、 安全教育培训、安全工作例会、施工分包安全管理、安全施工措施管理及交底、安全施工作业票管理、文明施工管理、安全检查、安全活动、安全奖惩细则等机制；内容符合国家、行业、公司现行规定；实施记录符合要求（重点抽查安全例会记录、安全奖惩记录等至少两项实施记录）（参照《内蒙古电力（集团）有限责任公司基本建设安全管理规定》等）", " 上级有关基建安全管理的文件及时传达（或转发）到工地；监理、施工项目部传达、学习记录的（重点检查学习宣贯近期上级下发的重要基建安全文件）"}));
        infolist.add(new LDHQCinfo(2, "明确安全责任", "1.1.2", new String[]{"建设管理单位按规定与施工、监理单位签订安全协议；安全工作目标和工作责任明确(主要检查施工监理承包合同及安全协议，具体条款可参照“内蒙古电力（集团）有限责任公司基本建设安全管理规定”中的相关规定按规定管理、使用安全生产费用（重点检查施工承包合同中是否明确使用规范，计划和记录是否规范）"}));
        infolist.add(new LDHQCinfo(2, "施工分包管理", "1.1.3", new String[]{"分包商在公司合格分包商名录内、未使用发生严重问题的分包单位、分包签订合同、分包对象非个人、分包单位有资质、法人（总公司）、安全生产许可证在有效期内", " 施工分包申请、人员、机械入场审核流程运转正确；分包合同、安全协议签订的规范性（合同主体、条款、时间等方面）；分包人员培训、考试、台帐、保险和“考勤”以及安全防护用品配备、安全交底、分包作业监督等；符合要求。（依据施工分包管理办法）", " 分包计划、人员管理、评价考核和动态监管工作规范"}));
        infolist.add(new LDHQCinfo(2, "人员资格管理和安全教育培训", "1.1.4", new String[]{"特种作业人员做到持有效证件上岗（证件应合格、在有效期内、存档证件复印件清晰且有单位盖章）", " 组织岗前安全培训教育和考试（抽查施工人员教育和培训记录，不得出现代考、代签现象）"}));
        infolist.add(new LDHQCinfo(2, "项目安全管理策划", "1.1.5", new String[]{"业主项目部编制安全管理总体策划；项目安全管理目标符合内蒙古电力（集团）有限责任公司基本建设安全管理规定、主要管理措施有针对性、并根据新的基建安全管理要求及时修订完善", " 施工项目部编制施工安全管理及风险控制方案；引用标准正确、编审批规范、内容无明显错误、安全目标响应建设管理单位安全目标要求、针对性强、格式及主要内容符合纲要等", " 监理项目部编制施工安全监理工作方案；安全旁站点设置明确；引用标准正确、编审批规范、内容无明显错误、安全目标响应建设管理单位安全目标要求、针对性强、格式及主要内容符合“七个纲要”要求等"}));
        infolist.add(new LDHQCinfo(2, "安全应急管理", "1.1.6", new String[]{"项目制定现场应急处置方案且制定完全；操作性强（组织机构、人员分工、联系方式明确，应急物资、现场医疗急救药品配备齐全）；进行安全演练"}));
        infolist.add(new LDHQCinfo(2, "施工安全风险管理", "1.1.7", new String[]{"检查项目执行内蒙古电力（集团）有限责任公司施工安全风险识别、评估及控制办法情况，工作开展规范；设计单位及三个项目部按规定履行职责"}));
        infolist.add(new LDHQCinfo(2, "施工方案编制、交底与执行", "1.1.8", new String[]{"施工组织设计，作业指导书、专项施工方案、专项技术措施等编审批规范；达到一定规模的危险性较大的分部分项工程专项施工方案附安全验算结果；超过一 定规模的危险性较大的分部分项工程的专项施工方案请专家论证；重要临时设施、重要施工工序、特殊作业、危险作业项目，编制专项安全技术措施", " 按经审批的方案施工", " 进行安全技术交底，(过程记录体现过程管理。"}));
        infolist.add(new LDHQCinfo(2, "安全监督检查", "1.1.9", new String[]{"项目建设管理单位按规定开展季度安全监督检查活动的或上级布置的专项安全检查活动的、业主项目部开展月度检查，有活动通知和活动记录（不得以监理或施工单位代替项目建设管理单位组织检查", " 监理项目部按规定对工程关键部位、关键工序、危险作业项目实施旁站；对重要施工设施在投入使用前进行安全性能检查签证，重大工序转接前进行安全文明施工条件检查签证（检查现场作业、过程管理环节记录和数码照片痕迹) ", " 施工项目部按规定至少每月组织一次安全检查。发现问题整改闭环", " 针对查出的隐患及时处理，作隐患整改反馈或采用曝光、点评等手段促进整改效果(查过程管理环节的痕迹，包括最终进入档案的检查发现问题数码照片)"}));
        infolist.add(new LDHQCinfo(2, "基建信息化系统应用", "1.1.10", new String[]{"通过系统上载安全管理总体策划、施工安全监理工作方案、施工安全管理及风险控制方案、安全管理评价报告。施工作业规范，完成安全风险的动态评估及复核流程", " 通过系统上载各类人员信息、培训考试、安全监督检查活动开展、问题闭环整改记录、旁站监理记录、施工日志、监理日志等"}));
        infolist.add(new LDHQCinfo(1, "1.2", "现场安全文明施工"));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.1", new String[]{"安全防护设施配置统一、标准；临边和危险作业区设置安全围栏等防护设施，孔洞设盖板；围栏、盖板规范，设危险警示（警告）牌或设置规范、数量充足，按规范设置工作接地线（按内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法，结合现场实际对照检查，若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录）", " 建筑脚手架搭设合格、规范(杆件、扣件、拉杆和斜撑、间距、立杆支垫、脚手板等)；脚手架经验收签证且挂牌后才能投入使用（对照“变电工程落地式钢管脚手架搭设安全技术规范”进行检查，若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等", " 高处作业垂直攀登和水平移动有效的安全防护措施，（按内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法，结合现场实际对照检查，若检查项目当前无相关内容，查过程管理、数码照片和安全措施执行记录）", " 施工现场（材料站、食堂、宿舍、易燃品库等地）缺少必要的消防器材。消防器材过期、失效，且有检查记录表，每件（若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录)", " 氧气、乙炔搬运、存放、使用符合安规要求（若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录）", " 基坑开挖放坡、积土堆放、深基坑支护符合要求（若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录)", " 浇注混凝土的通道跳板应固定（若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录)"}));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.2", new String[]{"符合“三级配电两级保护”要求（按“安规”要求检查，对照施工安全及风险控制方案、施工作业指导书等文件，检查发现符合策划内容，则本项不得分；若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 遵从“一机、一闸、一保护”（按“安规”要求检查；若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 电源线敷设规范（按“安规”要求检查；若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 接地或接零保护符合要求（按“安规”要求检查；若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 配电箱应设漏电保护器且漏电保护器合格，有标识（若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 电线老化、破损应妥善处理；电缆架设或埋设符合要求（按“安规”要求检查；若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）"}));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.3", new String[]{"按要求办理安全施工作业票、严格落实安全技术措施(作业票上安全技术措施全面、落实作业票上安全技术措施的；作业票填写、审查、签发规范；作业票做到全员交底、全员签字落实)", " 重要施工工序及特殊作业安全监护到位（现场实际检查检查当时无相关作业，则本项作为无施工项）", " 按规定设置工程项目施工“五牌一图”（工程项目概况牌、工程项目管理目标牌、工程项目管理责任牌、安全文明施工纪律牌、质量通病防治牌和施工现场总平面图）", " 在工程建设初期基本形成站内环形道路、搅拌站地面硬化", " 设备、材料、工具、模板定置、整齐堆放，符合安全文明施工的要求；按规定设置标识且标识规范（对照内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法检查，同时检查有无开展相关策划内容）", " 现场设置垃圾箱和废料箱，不存在垃圾或废料乱扔乱放现象(对照内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法检查，同时检查有无开展相关策划内容）", " 做到“工完、料尽、场地清”", " 施工人员无流动吸烟（现场非吸烟区发现烟蒂视为流动吸烟）", " 施工人员进入现场应正确佩戴安全帽、安全带等防护用品，（对照内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法检查施工现场及数码照片）", " 个人防护用品保管妥善（定置、整齐堆放，防潮、定期检验等）（检查现场和施工人员宿舍）", " 作业人员统一着装、佩带胸卡（对照“输变电工程安全文明施工标准”检查）"}));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.4", new String[]{"大型施工机械经检验，取得安全准用证，外租起重机械签订安全协议并进行报审", " 设备吊装区域设置围栏并设专人负责监护，起重物下方不得有人逗留或穿行，高处作业人员不得随意抛掷物品", " 转动部分设防护装置，钢丝绳、滑轮、吊钩、制动器磨损超限，起重钢丝绳使用（绳套插接长度、绳卡安装等）合格，承力钢丝绳在棱角处采取保护措施，起重机支垫符合要求"}));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.5", new String[]{"施工作业区与办公、生活区明显隔离； 临时建筑物符合管理规定", " 食堂、办公、生活区整洁、卫生、食堂炊事员有健康体检证", " 办公生活用电规范，防冻保暖、防暑降温、防煤气中毒等措施完善"}));
        infolist.add(new LDHQCinfo(1, "1.3", "重点工作落实（评分表根据检查具体时段调整）"));
        infolist.add(new LDHQCinfo(2, "安全管理主题活动开展情况", "1.3.1", new String[]{"现场有内蒙古电力（集团）有限责任公司和所属省公司级单位活动方案和重点措施；开展学习且有记录；现场结合工程实际制定活动计划且进行落实；方案不得照抄上级文件，应有针对性；举一反三全面排查安全隐患"}));
        infolist.add(new LDHQCinfo(2, "安全大检查活动开展情况", "1.3.2", new String[]{"结合安全事故、不安全事件召开专题分析会，对基建安全工作进行部署；按公司要求开展安全大检查。（包括基建安全大检查和公司安全大检查，重点检查学习记录反映实际工作开展情况，应有实际内容，不得走过场、敷衍应付）"}));
        infolist.add(new LDHQCinfo(2, "公司安全管理通用制度学习贯彻落实情况", "1.3.3", new String[]{"进行文件宣贯和学习；针对办法要求调整业主、监理、施工项目部安全管理总体策划文件"}));
        infolist.add(new LDHQCinfo(2, "重大施工作业风险“挂牌督查”要求执行情况", "1.3.4", new String[]{"落实风险管控“挂牌督查”要求，（主要查重大风险项目清单、挂牌督查文件和督查记录）"}));
        infolist.add(new LDHQCinfo(2, "季节性专项基建安全检查开展情况", "1.3.5", new String[]{"开展春夏季（秋冬季）基建安全检查和施工安全隐患排查；检查记录详实、工作开展认真（重点检查施工现场新开工、复工审核情况，现场队伍和人员入场审核、培训、交底情况，施工机械进场审核、维修保养情况等，符合要求）根据地域情况开展防汛、防台检查"}));
        infolist.add(new LDHQCinfo(2, "安全通病防治情况", "1.3.6", new String[]{"宣贯输变电工程施工现场安全通病防治工作要求、结合现场工程实际开展安全通病策划；同类安全通病不得重复出现3次以上"}));
        infolist.add(new LDHQCinfo(1, "1.4", "其它问题"));
        infolist.add(new LDHQCinfo(2, "其它问题", "1.4.1", new String[]{"参建单位提供的管理亮点应具备可持续性，有可推广价值（不得单纯依靠增大投入来烘托氛围博取认可）不得为迎检而对现场过度布置（是指明显超出标准要求且正常施工作业状况下不可能也不会进行，不可持续的相关布置）；不得为回避检查刻意停止应有作业或拆除应存在的设施", " 检查过程中，未发现不属于检查表所列内容的其它不符合项"}));
        infolist.add(new LDHQCinfo(1, "2", "质量部分"));
        infolist.add(new LDHQCinfo(1, "2.1", "质量管理体系建设及运转"));
        infolist.add(new LDHQCinfo(2, "工程质量策划管理", "2.1.1", new String[]{"设计、施工、监理合同中明确创优要求（包括合同中提出创优要求，创优质工程等级表述明确且规范）", " 编制工程创优规划；引用标准正确、编制时间符合要求、编审批规范、内容无明显错误、针对性强、在创优规划中编制标准工艺实施控制策划章节等（包括引用标准齐全、盖章规范、编制内容体现工程特点）", " 业主项目部组织开展工程创优策划专题会，按要求开展质量监督检查工作", " 监理创优实施细则和设计创优策划经审批合格，且编制标准工艺实施控制策划专篇", " 公司有关基建质量管理的文件，工程建设处应组织学习、及时传达（或转发）到工地（包括近期上级下发的重要基建质量文件）", " 编制定期质量巡视检查计划、质量检查通报、记录，对照质量检查计划开展活动（质量检查通报或记录与检查计划对应检查）"}));
        infolist.add(new LDHQCinfo(2, "设计质量管理", "2.1.2", new String[]{"进行设计交底；设计交底应包含标准工艺应用、强条执行、质量通病防治等内容；设计交底记录完整；设计在施工图设计前编制设计创优文件"}));
        infolist.add(new LDHQCinfo(2, "质量管理过程记录", "2.1.3", new String[]{"施工单位应编制施工创优实施细则；编制时间符合要求、编审批规范、内容无明显错误（内容明显错误包括内容与编制模板相冲突、目标明确或规范、创优保证措施出现明显错误、出现了与本工程无关的内容等）", " 建立项目物资验收、计量管理、质量检查验收、质量教育培训等台帐", " 施工项目部应有基建质量文件传达、学习记录（包括近期上级下发的重要基建质量文件等）", " 按要求组织技术交底；做到全员签字，不得出现代签现象（检查技术交底的时间是否满足施工进度要求，内容是否具体、有针对性，交底级别与交底内容相对应，是否包括含质量通病防治、合同、施工组织设计、专项施工方案、强条、创优细则等内容）", " 钢筋和水泥台账齐全、规范（包括台帐应包括材料名称、规格、生产日期、到货日期及数量、领用日期及数量、质量证明文件编号、复试报告编号、领用人、使用部位、剩余库存等）；原材料质量证明文件和复检试验记录完备、规范（随机抽查钢筋、水泥、砂石料等各三份，若使用商品混凝土，同样抽取三份）", " 一、二次设备试验报告齐全（抽查主变、断路器、蓄电池及无功补偿设备等）；施工记录规范", " 隐蔽工程（抽查钢筋、验槽、回填土、地网等）检查记录、签证书等资料应齐全、记录规范", " 按质量管理规定开展质量活动；对质量缺陷进行闭环管理，质量缺陷处理应有验收人", " 项目验评划分正确，验收记录填写具有真实性"}));
        infolist.add(new LDHQCinfo(2, "工程监理", "2.1.4", new String[]{"监理规划、监理实施细则、旁站方案齐全，引用标准正确、编审批规范、内容无明显错误、应有针对工程特点进行编制的内容", " 施工创优实施细则和施工质量验收及评定范围划分表经审核通过；主要材料及构配件供货商资质经审核通过（包括主要材料、构配件及设备供货商资质报审表、工程材料、构配件、设备进场报审表、主要设备开箱申请表等）", " 按监理规范配置平行检测检验仪器（检查种类、数量）；监理人员应具备登高检查能力（检查高空监理的人员资格和数量）", " 监理项目部应有基建质量文件传达、学习记录（包括近期上级下发的重要基建质量文件等）", " 运用见证、旁站、巡视、平行检验等质量控制手段，对工程施工质量进行检查、控制，检查发现的问题应及时闭环；组织工程质量初检工作（应符合内蒙古电力（集团）有限责任公司输变电工程施工建设监理管理办法要求）"}));
        infolist.add(new LDHQCinfo(2, "工艺标准推广应用", "2.1.5", new String[]{"按要求配置标准工艺系列成果；开展标准工艺宣贯、培训工作,（查三个项目部的宣贯和培训记录）；按要求应用《内蒙古电力（集团）有限责任公司输变电工程工艺标准库》；开展标准工艺应用检查"}));
        infolist.add(new LDHQCinfo(2, "强制性条文执行", "2.1.6", new String[]{"设计单位应编制输变电工程设计强制性条文执行计划；设计文件遵从强制性条文（重点检查设计图纸） ", " 施工单位应编制输变电工程施工强制性条文执行计划；工程实物遵从强制性条文 ", " 监理单位应填写输变电工程施工强制性条文执行检查表、汇总表 "}));
        infolist.add(new LDHQCinfo(2, "质量通病防治", "2.1.7", new String[]{"业主项目部在施工图编制前下达工程质量通病防治任务书，质量通病防治任务书内容无缺项、签字齐全", " 设计单位质量通病防治设计措施、施工单位质量通病防治措施和监理质量通病防治控制措施应齐全；编制日期符合要求，审批手续齐全", " 对质量通病防治内容进行技术交底（技术交底中应包含质量通病防治内容）；施工项目部应对质量通病防治工作进行阶段性总结"}));
        infolist.add(new LDHQCinfo(2, "设备管理", "2.1.8", new String[]{"设备现场保管应符合要求；按合同要求对重要设备组织监造,监造报告及相关记录应齐全，符合要求", " 设备交接验收手续应齐全、规范"}));
        infolist.add(new LDHQCinfo(2, "数码照片制度执行", "2.1.9", new String[]{"严格执行数码照片管理办法，不得弄虚作假；主题明确、数量充足、按要求分类整理、规范、满足要求"}));
        infolist.add(new LDHQCinfo(2, "基建信息化系统应用", "2.1.10", new String[]{"查基建信息系统中三个项目部质量策划文件的填报情况（主要查质量创优规划、监理创优实施细则、施工创优实施细则、强制性条文实施计划、旁站监理方案等）", " 在基建管理信息系统中正确录入质量通病防治措施并完成审批流程，系统中应录入质量检查记录、监理旁站记录、问题整改记录等档案"}));
        infolist.add(new LDHQCinfo(1, "2.2", "建筑工程施工质量及工艺"));
        infolist.add(new LDHQCinfo(2, "建构筑物和砌筑工程", "2.2.1", new String[]{"主要材料出厂资料及试验资料、隐蔽工程验收记录、工程质量验评记录、安全和功能检验资料及主要功能检查记录应齐全、完备", " 建构筑物无不均匀沉降超标、裂缝、渗漏水等缺陷", " 清水墙砌筑方法正确、墙面无污染、泛碱，勾缝均匀、光滑顺直、深浅一致；伸缩缝设置合理，嵌缝满足要求，滴水沿(线)设置满足要求，压顶无裂纹", " 施工现场工序无错误，且完全遵从标准工艺要求", " 门窗、护栏、梯子、平台等安装符合规范要求", " 墙面、楼面、地面平整、无积水等违反规范现象", " 建筑物与电缆沟、散水、室外踏步及坡道等结合处设置变形缝"}));
        infolist.add(new LDHQCinfo(2, "站区道路", "2.2.2", new String[]{"道路伸缩缝设置规范，无破损、裂缝、积水、严重污染、脱皮、起沙等现象；接缝平直，宽度和填缝、道路表面平整度符合规定"}));
        infolist.add(new LDHQCinfo(2, "设备基础", "2.2.3", new String[]{"设备、构支架基础表面平整美观、不进行二次抹面", " 实现无垫片安装（设备自带垫片除外）、设备底座与基础间无明显间隙"}));
        infolist.add(new LDHQCinfo(2, "电缆沟", "2.2.4", new String[]{"电缆沟道截面（沟壁之间）尺寸符合要求、沟内明显积水；电缆沟伸缩缝间距设置合理、全断开、填缝及时；电缆沟盖板铺设平整、顺直、无响动，盖板合模有探头板、异形板，盖板表面平整、无损伤、脱皮、露筋、裂缝、起沙等质量缺陷", " 接地扁铁焊接、防腐满足规范要求，焊接工艺优良"}));
        infolist.add(new LDHQCinfo(2, "构支架", "2.2.5", new String[]{"钢构支架焊接及外观质量优良（检查镀锌、焊口外观、锌层磨损等）；接地端子高度、焊缝朝向一致，满足质量通病防治措施要求"}));
        infolist.add(new LDHQCinfo(2, "两型一化", "2.2.6", new String[]{"落实“两型一化”变电站建设设计导则有关要求（清水墙工艺、砂石化等）"}));
        infolist.add(new LDHQCinfo(2, "建筑电气", "2.2.7", new String[]{"室内外照明及管线、器具、配电盘等符合规范要求"}));
        infolist.add(new LDHQCinfo(2, "成品保护", "2.2.8", new String[]{"成品保护措施完备，无成品破损或“二次污染”"}));
        infolist.add(new LDHQCinfo(1, "2.3", "电气安装施工质量及工艺"));
        infolist.add(new LDHQCinfo(2, "原材料", "2.3.1", new String[]{"装置性材料出厂合格证等质量证明材料、主设备出厂资料及试验资料齐全；原材料按规定送检"}));
        infolist.add(new LDHQCinfo(2, "设备安装", "2.3.2", new String[]{"设备无现渗漏油（气）现象，瓷件无损伤、裂纹", " 设备和端子箱无油漆脱落、起皱、流痕、施工原因划伤等缺陷；设备安装无缺件，螺栓安装符合规范要求"}));
        infolist.add(new LDHQCinfo(2, "接地装置", "2.3.3", new String[]{"接地网及构支架接地引下线截面、搭接面积、埋深、焊接、螺栓连接、防腐、接地极数量等符合设计、施工规范及标准工艺要求；不得在一个接地线中串接几个需要接地的电气装置，接地标示清晰、牢固，户内开关室、保护室合理设置试验接地端子并做保护措施。"}));
        infolist.add(new LDHQCinfo(2, "电缆敷设", "2.3.4", new String[]{"电缆保护管敷设牢固、整齐，室外（施工）电缆无外露，接地和防腐符合规范要求", " 电缆排放整齐，层次分明，弯曲方向一致、美观，电缆固定牢靠，标志齐全清晰"}));
        infolist.add(new LDHQCinfo(2, "二次接线", "2.3.5", new String[]{"二次接线整齐，线帽、电缆标牌清晰、正确、整齐，备用芯处置合理。电缆头密实、绑扎整齐，电缆铠甲层、屏蔽层接地牢固可靠，满足质量通病防治措施要求，屏柜接地、电流回路中性点接地符合设计及“反措”要求"}));
        infolist.add(new LDHQCinfo(2, "盘柜安装", "2.3.6", new String[]{"盘柜安装排列整齐，盘面垂直度、平整度和盘间间隙符合规范要求，固定牢靠，色泽统一。户外端子箱、就地柜有可靠的防水、防尘、防潮措施，屏柜、端子箱、就地柜与接地网直接接地可靠；配电、控制、保护用的屏（柜、箱）及操作台等的金属框架和底座接地可靠；装有电气元件的可开启的屏柜门有软导线跨接并可靠接地，屏柜端子箱接地柜封堵严密"}));
        infolist.add(new LDHQCinfo(2, "母线、跳线、连线", "2.3.7", new String[]{"三相线管段轴线平行，软母线弛度一致；跳线、接线无松股，弯曲平顺一致"}));
        infolist.add(new LDHQCinfo(2, "金属构件", "2.3.8", new String[]{"设备、构支架金属部分无锈蚀；紧固件无松动、螺栓露扣长度（2-3扣）满足要求"}));
        infolist.add(new LDHQCinfo(2, "标准工艺", "2.3.9", new String[]{"施工现场工序无错误，严格采用标准工艺"}));
        infolist.add(new LDHQCinfo(1, "2.4", "重点工作落实（评分表根据检查具体时段调整）"));
        infolist.add(new LDHQCinfo(2, "原材料", "2.4.1", new String[]{"质量管理体系运转顺畅，不存在重点治理的质量通病；现场有质量管理重点活动实施方案，项目部有学习记录；现场结合工程实际制定具体质量活动的措施和实施计划，措施在现场应得到切实落实"}));
        infolist.add(new LDHQCinfo(2, "原材料", "2.4.2", new String[]{"工程创优规划中明确标准工艺应用的目标、应用率和要求，设计创优实施细则、施工创优实施细则明确标准工艺应用具体内容和措施，创优监理实施细则中针对性提出工艺质量控制措施和标准工艺实施监督检查措施；策划内容针对性强。业主项目部应将标准工艺的应用作为施工图会检的内容，设计单位对施工图明确采用的标准工艺和“四新”应用进行交底，施工单位将标准工艺的应用作为施工图会检的内容。施工项目部编制“施工方案（作业指导书）应优先采用”典型施工方法。召开“标准工艺”应用专题会议。监理在工程检查、初验等环节中，定期（每周或每旬）检查“标准工艺”的实施情况"}));
        infolist.add(new LDHQCinfo(1, "2.5", "重点工作落实（评分表根据检查具体时段调整）"));
        infolist.add(new LDHQCinfo(2, "原材料", "2.5.1", new String[]{"参建单位提供的管理亮点应具备可持续性，有可推广价值（不得单纯依靠增大投入来烘托氛围博取认可）不得为迎检而对现场过度布置（是指明显超出标准要求且正常施工作业状况下不可能也不会进行，不可持续的相关布置）；不得为回避检查刻意停止应有作业或拆除应存在的设施", " 检查过程中，未发现不属于检查表所列内容的其它不符合项"}));
        return infolist;
    }

    private static ArrayList<LDHQCinfo> get2() {
        ArrayList<LDHQCinfo> infolist = new ArrayList<>();
        infolist.add(new LDHQCinfo(1, "1", "安全管理"));
        infolist.add(new LDHQCinfo(1, "1.1", "安全管理体系建立及运转"));
        infolist.add(new LDHQCinfo(2, "落实安全生产规章制度", "1.1.1", new String[]{"业主项目部按照要求建立工程项目安全管理责任制、安全工作例会、安全检查工作、基建安全信息管理、工程分包安全管理、安全奖惩细则等机制；内容符合国家、行业、公司现行规定；实施记录符合要求（重点抽查安全例会记录、安全奖惩记录等至少两项实施记录）（参照《内蒙古电力（集团）有限责任公司基建安全管理规定》等）", " 监理项目部按照要求建立安全责任制、安全监理例会、安全监理交底、安全审查备案、安全巡视和旁站工作、安全检查签证、安全工作奖惩等机制；内容符合国家、行业、公司现行规定；安全管理体系运转流畅，实施记录符合要求（重点抽查监理安全检查签证记录、安全旁站记录、巡视记录等）（参照《内蒙古电力（集团）有限责任公司基本建设安全管理规定》等）", " 施工项目部按照要求建立施工安全责任制、 安全教育培训、安全工作例会、施工分包安全管理、安全施工措施管理及交底、安全施工作业票管理、文明施工管理、安全检查、安全活动、安全奖惩细则等机制；内容符合国家、行业、公司现行规定；实施记录符合要求（重点抽查安全例会记录、安全奖惩记录等至少两项实施记录）（参照《内蒙古电力（集团）有限责任公司基本建设安全管理规定》等）", " 上级有关基建安全管理的文件及时传达（或转发）到工地；监理、施工项目部传达、学习记录的（重点检查学习宣贯近期上级下发的重要基建安全文件）"}));
        infolist.add(new LDHQCinfo(2, "明确安全管理责任", "1.1.2", new String[]{"建设管理单位按规定与施工、监理单位签订安全协议；安全工作目标和工作责任明确(主要检查施工监理承包合同及安全协议，具体条款可参照“内蒙古电力（集团）有限责任公司基本建设安全管理规定”中的相关规定", " 按规定管理、使用安全生产费用（施工承包合同明确、使用规范等），（重点检查施工承包合同中是否明确，计划和记录是否规范）"}));
        infolist.add(new LDHQCinfo(2, "施工分包管理", "1.1.3", new String[]{"无分包商不在公司合格分包商名录内、使用发生严重问题的分包单位，分包未签订合同，分包对象为个人、分包单位无资质、非法人（如分公司）、安全生产许可证过期等分包严重问题", " 施工分包申请、人员、机械入场审核流程运转顺畅；分包合同、安全协议签订符合规范（检查合同主体、条款、时间等方面）；分包人员培训、考试、台帐、保险和“考勤”以及安全防护用品配备、安全交底、分包作业监督等符合要求（依据施工分包管理办法检查）", " 分包计划、队伍选择、合同管理、人员管理、评价考核和动态监管工作符合规范"}));
        infolist.add(new LDHQCinfo(2, "人员资质管理和安全教育培训", "1.1.4", new String[]{"特种作业人员做到持有效证件上岗（证件合格、不过期、存档证件复印件清楚，监理人员登高检查能力和数量应符合规范要求）", " 组织岗前安全培训教育和考试（抽查施工人员教育和培训记录，不得出现代考、代签现象）"}));
        infolist.add(new LDHQCinfo(2, "项目安全管理策划", "1.1.5", new String[]{"业主项目部编制安全管理总体策划；项目安全管理目标符合基建安全管理规定、主要管理措施有针对性、根据新的基建安全管理要求及时修订完善", " 施工项目部编制施工安全管理及风险控制方案；引用标准正确、编审批规范、内容无明显错误、安全目标响应建设管理单位安全目标要求、针对性强、格式及主要内容符合纲要等", " 监理项目部编制施工安全监理工作方案；安全旁站点设置明确；引用标准正确、编审批规范、内容无明显错误、安全目标响应建设管理单位安全目标要求、针对性强、格式及主要内容符合“ 七个纲要”要求等"}));
        infolist.add(new LDHQCinfo(2, "安全应急管理", "1.1.6", new String[]{"项目制定现场应急处置方案，操作性强（组织机构、人员分工、联系方式明确，应急物资、现场医疗急救药品配备齐全），进行演练"}));
        infolist.add(new LDHQCinfo(2, "施工安全风险管理", "1.1.7", new String[]{"严格执行内蒙古电力（集团）有限责任公司施工安全风险识别、评估及控制办法，工作开展符合规范；设计单位及三个项目部按规定履行职责"}));
        infolist.add(new LDHQCinfo(2, "施工方案编制、交底与执行", "1.1.8", new String[]{"施工组织设计，作业指导书、专项施工方案、专项技术措施等编审批规范；达到一定规模的危险性较大的分部分项工程专项施工方案附安全验算结果；超过一定规模的危险性较大的分部分项工程的专项施工方案应请专家论证；重要临时设施、重要施工工序、特殊作业、危险作业项目，编制专项安全技术措施", " 按经审批的方案施工，按规定办理安全施工作业票", " 进行安全技术交底，(按每份次检查，包含过程管理环节，过程记录）"}));
        infolist.add(new LDHQCinfo(2, "安全监督检查", "1.1.9", new String[]{"项目建设管理单位按规定开展季度安全监督检查活动和上级布置的专项安全检查活动、业主项目部开展月度检查，有活动通知、活动记录（不得让监理或施工单位代替项目建设管理单位组织检查）", " 监理项目部按规定对工程关键部位、关键工序、危险作业项目实施旁站；对重要施工设施在投入使用前进行安全性能检查签证，重大工序转接前进行安全文明施工条件检查签证（检查现场作业、过程管理环节记录和数码照片痕迹) ", " 施工项目部按规定至少每月组织一次安全检查，发现问题及时整改闭环", " 针对查出的隐患及时处理，作隐患整改反馈或采用曝光、点评等手段促进整改效果(查过程管理环节的痕迹，包括最终进入档案的检查发现问题数码照片。"}));
        infolist.add(new LDHQCinfo(2, "基建信息化系统应用", "1.1.10", new String[]{"通过系统上载安全管理总体策划、施工安全监理工作方案、施工安全管理及风险控制方案、安全管理评价报告。施工作业规范完成安全风险的动态评估及复核流程，记录完整且按时完成", " 通过系统上载各类人员信息、培训考试、安全监督检查活动开展、问题闭环整改记录、旁站监理记录、施工日志、监理日志等"}));
        infolist.add(new LDHQCinfo(1, "1.2", "现场安全文明施工"));
        infolist.add(new LDHQCinfo(2, "安全设施标准化", "1.2.1", new String[]{"跨越架搭设规范（检查材料、间距、封顶、拉线、羊角等）；经验收签证和挂牌后投入使用（若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等。如检查当时无相关作业，则本项作为无施工项）", " 安全防护设施配置统一、标准；施工区域按规定设置安全围栏及危险警示（警告）标志等，设置规范、数量充足，设置工作接地线（若检查项目当前无相关内容，查过程管理环节，过程数码照片和安全措施执行记录）", " 高处作业垂直攀登和水平移动应有有效的安全防护措施（按内蒙古电力（集团）有限责任公司输变电工程安全文明施工标准化管理办法，结合现场实际对照检查，若检查项目当前无相关内容，查过程管理、数码照片和安全措施执行记录）", " 施工现场（材料站、食堂、宿舍、易燃品库、林区、牧区、库区等地）配备必要的消防器材。消防器材不得过期、失效，且有检查记录表", " 土石方爆破应有可靠的防护措施（若检查项目当前无相关内容，查过程管理环节、过程数码照片）", " 基坑开挖按施工方案要求放坡，应有临边防护措施、防塌方措施；基坑开挖积土堆放符合要求，浇注混凝土的通道跳板绑扎合格（若检查项目当前无相关内容，查过程管理环节、过程数码照片）"}));
        infolist.add(new LDHQCinfo(2, "施工用电管理", "1.2.2", new String[]{"遵从“一机、一闸、一保护”（按“安规”要求检查，最多，若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 接地或接零保护符合要求，配电箱配备漏电保护器，确保漏电保护器有效，定期进行检查（按“安规”要求检查，若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）", " 电线无老化、破损；电缆架设符合要求（对照施工安全及风险控制方案、施工作业指导书等文件进行检查，若检查项目当前无相关内容，查过程管理环节，过程记录和数码照片等）"}));
        infolist.add(new LDHQCinfo(2, "安全文明施工管理", "1.2.3", new String[]{"按要求办理安全施工作业票、严格落实安全技术措施(作业票上安全技术措施全面，作业票填写、审查、签发符合规范，作业票做到全员交底、全员签字落实）", " 重要施工工序及特殊作业安全监护到位（现场实际检查检查当时无相关作业，则本项作为无施工项）", " 施工机械停放、工器具存放、模板堆放定置化，水泥、沙石等材料铺垫彩条布；生熟土（如有）分开堆放；按规定挂标识牌或标识牌规范(对照内蒙古电力（集团）有限责任公司输变电工程安全标准化管理办法检查）", " 做到“工完、料尽、场地清”；现场设置垃圾箱和废料箱，不存在垃圾或废料乱扔乱放现象；施工人员无流动吸烟（现场非吸烟区发现烟蒂视为流动吸烟）", " 施工人员应统一着装、佩带胸卡，正确佩戴安全帽、安全带等防护用品", " 个人防护用品保管妥善，不得随意堆放导致受潮，并做定期检验（检查现场和施工人员宿舍）"}));
        infolist.add(new LDHQCinfo(2, "杆塔工程安全措施", "1.2.4", new String[]{"抱杆使用应满足技术措施和规程要求（起重绳索、四侧拉线、绞磨绊绳等规格符合要求，布置合理，连接可靠、工器具使用规范等）（现场实际检查检查当时无相关作业，则本项作为无施工项）", " 吊装区域设置围栏并设专人监护，起重物下方不得有人逗留或随意穿行，高处作业人员不得随意抛掷物件", " 杆塔组立期间及时安装临时接地装置"}));
        infolist.add(new LDHQCinfo(2, "架线工程安全措施", "1.2.5", new String[]{"受力钢丝绳内角侧、绳圈内以及吊件垂直下方不得有施工人员逗留", " 放线作业通讯联络可靠，重要部分设专人监护", " 临时拉线、过轮临锚、高空临锚、牵张机锚固等符合要求，布置合理，连接可靠；网套连接器、旋转（抗弯）连接器、卡线器、卸扣、双钩、链条葫芦、滑车、提线器等工器具按规定使用，应有检查记录", " 牵张机和导线可靠接地；牵张机悬挂操作规程，操作人员行为符合规范", " 临近带电体施工按规定采取有效防护措施；牵张机本体及牵引绳（导地线）两端、区段内杆塔本体接地规范，可靠；紧挂线和附件安装时按规定做好防感应电措施；导引绳（导地线）从带电线路下面穿过时采取可靠的安全措施"}));
        infolist.add(new LDHQCinfo(2, "施工机械管理", "1.2.6", new String[]{"重机械经检验合格并取得安全准用证，外租起重机械签订安全协议并进行报审", " 施工机械安全防护装置齐全、符合要求，现场悬挂操作规程", " 使用经过年检和证照齐全的车辆；不得使用带病车辆,农用车或自卸车载人，不得机动车人货混装、超速超载；租用车辆应签订合同和安全协议", " 钢丝绳、滑轮、吊钩、制动器磨损不得超限，起重钢丝绳使用（绳套插接长度、绳卡安装等）合格，承力钢丝绳在棱角处采取保护措施，起重机支垫符合要求"}));
        infolist.add(new LDHQCinfo(2, "办公、生活区管理", "1.2.7", new String[]{"食堂、办公、生活区整洁、卫生、食堂炊事员有健康体检证", " 办公生活用电规范，防冻保暖、防暑降温、防煤气中毒等措施完善"}));
        infolist.add(new LDHQCinfo(1, "1.3", "重点工作落实（评分表根据检查具体时段调整）"));
        infolist.add(new LDHQCinfo(2, "安全管理主题活动开展情况", "1.3.1", new String[]{"现场有内蒙古电力（集团）有限责任公司和所属省公司级单位活动方案和重点措施；开展学习且有记录；现场结合工程实际制定活动计划且进行落实；方案不得照抄上级文件，应有针对性；举一反三全面排查安全隐患，。"}));
        infolist.add(new LDHQCinfo(2, "安全大检查活动开展情况", "1.3.2", new String[]{"结合安全事故、不安全事件召开专题分析会，对基建安全工作进行部署；按公司要求开展安全大检查基建安全大检查和公司安全大检查，重点检查学习记录反映实际工作开展情况，应有实际内容，不得走过场、敷衍应付"}));
        infolist.add(new LDHQCinfo(2, "公司安全管理通用制度学习贯彻落实情况", "1.3.3", new String[]{"进行文件宣贯和学习；针对办法要求调整业主、监理、施工安全文明施工策划文件"}));
        infolist.add(new LDHQCinfo(2, "重大施工作业风险“挂牌督查”要求执行情况", "1.3.4", new String[]{"落实风险管控“挂牌督查”要求，（主要查重大风险项目清单、挂牌督查文件和督查记录）"}));
        infolist.add(new LDHQCinfo(2, "季节性专项基建安全检查开展情况", "1.3.5", new String[]{"开展春夏季（秋冬季）基建安全检查和施工安全隐患排查；检查记录详实、工作开展认真（重点检查施工现场新开工、复工审核情况，现场队伍和人员入场审核、培训、交底情况，施工机械进场审核、维修保养情况等，符合要求）根据地域情况开展防汛、防台检查，（排查记录、措施落实）"}));
        infolist.add(new LDHQCinfo(2, "安全通病防治情况", "1.3.6", new String[]{"宣贯输变电工程施工现场安全通病防治工作要求、结合现场工程实际开展安全通病策划；同类安全通病不得重复出现3次以上"}));
        infolist.add(new LDHQCinfo(1, "1.4", "其它问题"));
        infolist.add(new LDHQCinfo(2, "其它问题", "1.4.1", new String[]{"参建单位提供的管理亮点应具备可持续性，有可推广价值（不得单纯依靠增大投入来烘托氛围博取认可）不得为迎检而对现场过度布置（是指明显超出标准要求且正常施工作业状况下不可能也不会进行，不可持续的相关布置）；不得为回避检查刻意停止应有作业或拆除应存在的设施", " 检查过程中，未发现不属于检查表所列内容的其它不符合项"}));
        infolist.add(new LDHQCinfo(1, "2", "质量部分"));
        infolist.add(new LDHQCinfo(1, "2.1", "质量管理体系建设及运转"));
        infolist.add(new LDHQCinfo(2, "工程质量策划管理", "2.1.1", new String[]{"设计、施工、监理合同中明确创优要求（包括合同中提出创优要求，创优质工程等级表述明确且规范）", " 编制工程创优规划；引用标准正确、编制时间符合要求、编审批规范、内容无明显错误、针对性强、在创优规划中编制标准工艺实施控制策划章节等（包括引用标准齐全、盖章规范、编制内容体现工程特点）", " 业主项目部组织开展工程创优策划专题会，按要求开展质量监督检查工作", " 监理创优实施细则和设计创优策划经审批合格，且编制标准工艺实施控制策划专篇", " 公司有关基建质量管理的文件，工程建设处应组织学习、及时传达（或转发）到工地（包括近期上级下发的重要基建质量文件）", " 编制定期质量巡视检查计划、质量检查通报、记录，对照质量检查计划开展活动（质量检查通报或记录与检查计划对应检查）"}));
        infolist.add(new LDHQCinfo(2, "设计质量管理", "2.1.2", new String[]{"在推动“两型三新”方面结合工程特点，采用全方位不等高基础、原状土基础，紧凑型、同塔多回线路，高强钢铁塔及新型导线等设计（应采用而采用的视为不满足要求）；设计文件中应有强条执行、标准工艺应用、质量通病治理技术措施要求", " 进行设计交底；设计交底应包含标准工艺应用、强条执行、质量通病防治等内容；设计交底记录完整；设计在施工图设计前编制设计创优文件（重点检查设计交底记录）"}));
        infolist.add(new LDHQCinfo(2, "质量管理过程记录", "2.1.3", new String[]{"施工单位应编制施工创优实施细则；引用标准正确、编制时间符合要求、编审批规范、内容无明显错误（内容明显错误包括内容与编制模板相冲突、目标明确或规范、创优保证措施出现明显错误、出现了与本工程无关的内容等）", " 建立项目物资验收、计量管理、质量检查验收、质量教育培训等台帐", " 施工项目部应有基建质量文件传达、学习记录（包括近期上级下发的重要基建质量文件等）", " 按要求组织技术交底；做到全员签字，不得出现代签现象（检查技术交底的时间是否满足施工进度要求，内容是否具体、有针对性，交底级别与交底内容相对应）", " 钢筋和水泥台账齐全、规范（包括材料名称、规格、生产日期、到货日期及数量、领用日期及数量、质量证明文件编号、复试报告编号、领用人、使用部位、剩余库存等）；原材料质量证明文件和复检试验记录完备、规范（随机抽查钢筋、水泥、砂石料等各三份，若使用商品混凝土，同样抽取三份）", " 隐蔽工程检查（基础、接地、压接等）记录、签证书等资料齐全、规范", " 验评记录齐全，施工记录真实性强", " 按时开展质量活动、进行质量检查；对质量缺陷进行闭环管理（质量缺陷处理应有验收人）"}));
        infolist.add(new LDHQCinfo(2, "工程监理", "2.1.4", new String[]{"监理规划、监理实施细则、旁站方案齐全，引用标准正确、编审批规范、内容无明显错误、应有针对工程特点进行编制的内容", " 施工创优实施细则和施工质量验收及评定范围划分表经审核通过；主要材料及构配件供货商资质经审核通过（包括主要材料、构配件及设备供货商资质报审表、工程材料、构配件、设备进场报审表、主要设备开箱申请表等）", " 按监理规范配置平行检测检验仪器检查种类、数量） ", " 监理项目部应有基建质量文件传达、学习记录（包括近期上级下发的重要基建质量文件等）", " 施工图纸会检不及时，纪要签章齐全，每次开展图纸会检时间符合施工进度要求 ", " 运用见证、旁站、巡视、平行检验等质量控制手段，对工程施工质量进行检查、控制，检查发现问题及时整改闭环，组织工程质量初检工作（应符合内蒙古电力（集团）有限责任公司输变电工程建设监理管理办法要求）"}));
        infolist.add(new LDHQCinfo(2, "工艺标准推广应用", "2.1.5", new String[]{"按要求配备标准工艺系列成果，开展标准工艺应用检查", " 按照内蒙古电力（集团）有限责任公司输变电工程工艺标准库，开展标准工艺应用策划工作，采用标准工艺"}));
        infolist.add(new LDHQCinfo(2, "强制性条文执行", "2.1.6", new String[]{"设计单位应编制输变电工程设计强制性条文执行计划；设计文件遵从强制性条文（重点检查设计图纸） ", " 施工单位应编制输变电工程施工强制性条文执行计划；工程实物遵从强制性条文 ", " 监理单位应填写输变电工程施工强制性条文执行检查表、汇总表 "}));
        infolist.add(new LDHQCinfo(2, "质量通病防治", "2.1.7", new String[]{"业主项目部在施工图编制前下达工程质量通病防治任务书，质量通病防治任务书内容无缺项、签字齐全", " 设计单位质量通病防治设计措施、施工单位质量通病防治措施和监理质量通病防治控制措施应齐全；编制日期符合要求，审批手续齐全"}));
        infolist.add(new LDHQCinfo(2, "材料管理", "2.1.8", new String[]{"材料现场保管符合规范要求", " 主材交接验收手续齐全规范"}));
        infolist.add(new LDHQCinfo(2, "数码照片制度执行", "2.1.9", new String[]{"严格执行数码照片管理办法，不得弄虚作假；主题明确、数量充足、按要求分类整理、规范、满足要求"}));
        infolist.add(new LDHQCinfo(2, "基建信息化系统应用", "2.1.10", new String[]{"查基建信息系统中三个项目部质量策划文件的填报情况（主要查质量创优规划、监理创优实施细则、施工创优实施细则、强制性条文实施计划、旁站监理方案等）", " 在基建管理信息系统中正确录入质量通病防治措施并完成审批流程，系统中应录入质量检查记录、监理旁站记录、问题整改记录等档案"}));
        infolist.add(new LDHQCinfo(1, "2.2", "工程实物质量"));
        infolist.add(new LDHQCinfo(2, "基础工程", "2.2.1", new String[]{"混凝土强度、钢筋和地脚螺栓规格，符合设计或规范要求", " 基础混凝土无蜂窝、麻面及露筋等明显缺陷，基础无二次抹面", " 基础露出地面高度符合要求", " 回填土防沉层整齐、规范，坑口回填土的上表面不低于原始地面，符合要求", " 立柱及各底座断面尺寸偏差不超差(-1%)", " 混凝土搅拌、振捣等规范，带水浇混凝土、砂石中不得混有杂物，混凝土跌落高度不大于2m", " 基础成品保护符合要求"}));
        infolist.add(new LDHQCinfo(2, "铁塔工程", "2.2.2", new String[]{"塔材主材弯曲满足规范要求", " 塔材无明显加工缺陷；铁塔组立过程中采取保护措施，塔材不得受到破坏（磨损等），组装后塔材结合紧密（紧固后）", " 铁塔螺栓、防卸装置安装紧固、出扣一致，脚钉安装丝扣不得外露，垫片安装符合规定要求", " 架线后，转角、终端塔塔顶不得偏向受力侧；直线杆塔结构倾斜允许偏差符合标准"}));
        infolist.add(new LDHQCinfo(2, "架线工程", "2.2.3", new String[]{"引流线呈近似悬链线状自然下垂，销针穿向正确，弹簧垫齐全，符合要求", " 导（地）线弧垂偏差符合标准，相分裂导线同相子导线的弧垂偏差符合标准，符合要求", " 导地线压接工艺不满足规范要求"}));
        infolist.add(new LDHQCinfo(2, "附件安装", "2.2.4", new String[]{"防振锤及阻尼线安装符合标准，无移动、扭转现象，间隔棒结构面与导线垂直、安装偏差符合要求"}));
        infolist.add(new LDHQCinfo(2, "接地装置", "2.2.5", new String[]{"接地电阻值符合设计要求；接地体及引下线符合要求（深度、焊接质量等，需要开挖检查）符合要求，与塔材连接美观"}));
        infolist.add(new LDHQCinfo(2, "防护设施", "2.2.6", new String[]{"基础护坡或堡坎应牢固可靠，整齐美观；排水沟、挡土墙符合设计要求"}));
        infolist.add(new LDHQCinfo(1, "2.3", "重点工作落实（评分表根据检查具体时段调整）"));
        infolist.add(new LDHQCinfo(2, "质量管理重点活动落实情况", "2.3.1", new String[]{"质量管理体系运转顺畅，不存在重点治理的质量通病，现场有所属质量管理重点活动实施方案，项目部有学习记录；现场结合工程实际制定具体质量活动的措施和实施计划；措施在现场应有得到切实落实"}));
        infolist.add(new LDHQCinfo(2, "“标准工艺”推广应用情况", "2.3.2", new String[]{"工程创优规划中明确标准工艺应用的目标和要求，设计创优实施细则、施工创优实施细则明确标准工艺应用具体内容和措施，创优监理实施细则中针对性提出工艺质量控制措施和标准工艺实施监督检查措施；策划内容针对性强。业主项目部应将标准工艺的应用作为施工图会检的内容，设计单位对施工图明确采用的标准工艺和“四新”应用进行交底，施工单位将标准工艺的应用作为施工图会检的内容。施工项目部编制“施工方案（作业指导书）应优先采用”典型施工方法。召开“标准工艺”应用专题会议。监理在工程检查、初验等环节中，定期（每周或每旬）检查“标准工艺”的实施情况"}));
        infolist.add(new LDHQCinfo(1, "2.4", "其它问题"));
        infolist.add(new LDHQCinfo(2, "质量管理重点活动落实情况", "2.3.1", new String[]{"参建单位提供的管理亮点应具备可持续性，有可推广价值（不得单纯依靠增大投入来烘托氛围博取认可）不得为迎检而对现场过度布置（是指明显超出标准要求且正常施工作业状况下不可能也不会进行，不可持续的相关布置）；不得为回避检查刻意停止应有作业或拆除应存在的设施", " 检查过程中，未发现不属于检查表所列内容的其它不符合项"}));
        return infolist;
    }

    private static ArrayList<LDHQCinfo> get3() {
        ArrayList<LDHQCinfo> infolist = new ArrayList<>();
        infolist.add(new LDHQCinfo(1, "1", "项目部标准化建设"));
        infolist.add(new LDHQCinfo(2, "项目部组建", "1.1", new String[]{"业主项目部组建 项目部人员配备、组建时间符合要求，项目管理人员以文件形式正式任命并按要求履行报备手续。业主项目经理参加总部或省公司组织的项目经理培训并考试合格。（查任命文件及报备资料，培训证书、业主项目部组织机构管控表。业主项目部人员配备、组建时间、任命方式、报备符合公司规定要求，本项最多）", " 监理项目部组建 项目部组建和管理人员任职资格符合公司相关要求；主要人员与投标承诺一致。（查任命文件、资格证书、投标文件。监理项目部管理人员设置符合公司相关要求，有任命文件并按要求报备，组建时间符合规定要求。 总监任职资格符合要求，其他主要管理人员任职资格符合要求,主要管理人员与投标承诺一致）", " 施工项目部组建 项目部组建和管理人员任职资格符合公司相关要求；主要人员与投标承诺一致。（查任命文件、资格证书、投标文件。施工项目部管理人员设置符合公司相关要求，有任命文件并按要求报备，组建时间符合规定要求。项目经理任职资格符合要求，其他主要管理人员任职资格符合要求,主要管理人员与投标承诺一致）"}));
        infolist.add(new LDHQCinfo(2, "项目部资源配置", "1.2", new String[]{"业主项目部配置 配备满足工程管理所必需的办公设施，具备独立运作的条件。以及必备的规程、规章制度等文件", " 监理项目部配置 项目部配备必要的交通、办公、检测工具等设施，规程、制度齐全有效。（查办公设施、交通工具、检测工具、必备相关规程和规章制度等文件。 线路工程配备必要的交通工具、配备高处作业检查人员及相应的检查手段) ", " 施工项目部配置 项目部办公设施、交通工具、主要施工工器具和管理制度的配备满足规定要求。（查项目部施工区、生活区设置，办公、生活设施、交通工具、主要施工工器具及维护管理, 符合要求，查项目部制度清单，主要管理制度）"}));
        infolist.add(new LDHQCinfo(2, "项目管理提升", "1.3", new String[]{"管理纠偏 业主项目部加强对监理项目部履职情况监督，及时纠正管理偏差（查协调会纪要等，监理存在控制、协调工作到位现象，业主项目部应指出并留存书面意见） 监理项目部监督施工项目部管理体系正常运转，及时纠正管理及现场偏差 (查工作联系单、整改通知单等，施工项目部管理到位、不存在安全质量隐患等现象；监理项目部应指出并留存书面意见）", " 问题整改 发现的问题应闭环整改，不得重复出现"}));
        infolist.add(new LDHQCinfo(1, "2", "依法合规建设"));
        infolist.add(new LDHQCinfo(2, "项目核准", "2.1", new String[]{"未批先建为否决项\n" +
                "工程核准手续应完备，不得未核先建\n" +
                "(查项目核准文件、开工报审表等)\n"}));
        infolist.add(new LDHQCinfo(2, "招标管理", "2.2", new String[]{"未招标先实施为否决项\n" +
                "规范开展招标管理\n" +
                "（查招标投标文件、中标通知书等，招标节点时序正确、评标管理规范、施工招标采用工程量清单招标等） "}));
        infolist.add(new LDHQCinfo(2, "开工管理", "2.3", new String[]{"开工主要条件满足国家相关规定（查工程规划许可、建设用地许可、质量监督申报书等政府部门批复文件）", " 开工主要条件满足公司管理要求（查初步设计及批复文件、工程中标通知书及工程建设合同、施工图会检纪要、以及是否列入公司综合计划等)", " 按要求审批工程开工报审表（查开工报审表。审批流程规范、审批意见明确、审批及时等）"}));
        infolist.add(new LDHQCinfo(2, "拆迁赔偿", "2.4", new String[]{"依法合规开展征地拆迁、青苗赔偿工作\n" +
                "   （不得因地拆迁、青苗赔偿等原因造成群体性事件;相关手续齐全，满足财务管理要求)\n"}));
        infolist.add(new LDHQCinfo(2, "农民工工资", "2.5", new String[]{"按合同及时支付工程款或农民工工资\n" +
                "   （项目管理严格，合同约定明确，不得因拖欠农民工工资而引发民事纠纷）\n"}));
        infolist.add(new LDHQCinfo(1, "3", "项目管理"));

        infolist.add(new LDHQCinfo(2, "项目管理策划", "3.1", new String[]{"业主项目部项目管理策划 (查建设管理纲要、安全管理总体策划、质量通病防治任务书等策划文件，结合工程实际编写 对监理规划、项目管理实施规划等报审文件审核严格、规范）", " 监理项目部项目管理策划（查工程监理规划及相关专业监理实施细则、工作方案等策划文件，应有针对工程实际编制的内容；编审批手续和文件发放管理符合要求 对报审的项目管理实施规划等报审文件审核严格、规范）", " 施工项目部项目管理策划（查项目管理实施规划等策划文件及专项措施、方案等, 应有针对工程实际编制的内容；编审批手续和文件发放管理符合要求）"}));
        infolist.add(new LDHQCinfo(2, "进度管理", "3.2", new String[]{"实际进度与计划进度偏差（对比工程现场实际进度与计划进度节点时间）", " 业主项目部进度计划管控 业主项目部根据建设管理单位工程建设进度计划，组织编制项目实施进度计划、招标需求计划、设计进度计划、停电计划等，定期(每月)对进度实施计划执行情况分析、制定和落实纠偏措施）", " 监理项目部进度计划管控 (监理项目部按照业主项目部进度计划编制一级网络计划，定期(每月)对一级网络计划执行情况进行分析、制定和落实纠偏措施）", " 施工项目部进度计划管控（施工项目部编制施工进度计划应满足进度节点要求、按业主方下达的施工进度滚动计划的调整要求调整施工进度计划，定期（每月）分析、总结计划执行情况，编制工程设备和材料需求计划、施工机具需求计划或按计划实施）"}));
        infolist.add(new LDHQCinfo(2, "建设协调", "3.3", new String[]{"业主项目部每月召开工程例会（查工程例会记录、会议纪要。定期组织会议，会议议定事项落实到位）", " 业主项目部及时协调工程建设过程中出现的有关问题（查相关专题会议纪要。应协调事宜是否协调，协调议定事项是否落实到位", " 监理工地例会及组织设备到场验收（查例会纪要。定期(每月)召开会议并作会议记录；编制《监理月报》且有实质性内容 查设备到场验收交接记录、开箱检查记录）", " 施工项目部工地例会（查例会纪要，定期(每周)召开会议并做会议记录）"}));
        infolist.add(new LDHQCinfo(2, "档案管理", "3.4", new String[]{"工程档案管理 (业主、监理、施工项目部按要求开展工程档案管理,工程档案完整,工程档案与工程建设同步形成,档案资料规范)"}));
        infolist.add(new LDHQCinfo(2, "项目管理综合评价", "3.5", new String[]{"业主项目部对工程参建单位开展评价\n" +
                "   依据管理工作标准及参建单位合同执行情况，对项目设计、施工、监理单位开展履约评价，及时反馈物资供应商重大违约事项。\n" +
                "  （查相关评价报告或记录表。按要求进行评价或反馈，本项评价或反馈意见应准确）\n"}));
        infolist.add(new LDHQCinfo(2, "基建信息系统应用", "3.6", new String[]{"系统进度与实际进度一致性（查基建信息管理系统、现场实际进度，系统中关键进度节点与现场实际进度偏差，不得超出7天)", " 基建管理信息系统数据录入准确、完整（系统中关键数据无缺失或错误）"}));
        infolist.add(new LDHQCinfo(1, "3", "造价管理"));
        infolist.add(new LDHQCinfo(2, "初步设计管理", "3.1", new String[]{"初步设计批复（初步设计规模不得超出可研批复、核准，且按规定履行相关审批手续）", " 初步设计概算编制（定额套用不得出现明显错误、取费费率执行预规规定，概、预算书编制内容、格式及审批严格执行《电网工程建设预算编制与计算标准》，各级编制、校核、审核人员签字盖章）"}));
        infolist.add(new LDHQCinfo(2, "合同管理", "3.2", new String[]{"业主项目部合同管理（在中标通知书发出后一个月内签订合同，合同金额与中标通知书金额一致，，按内蒙古电力（集团）有限责任公司统一或省公司修订合同文本起草合同，合同签订履行审批手续，合同签字、盖章齐全，本项合同中预付款进度款支付方式、风险范围、价款调整方式、结算方式、工期等主要专用条款设置与招标文件相符）", " 监理项目部合同管理（审查分包单位资质报审表，审查施工单位自供物资的供应商资质，审核及过程管控严格，不得出现施工违规分包、以包代管等现象）"}));
        infolist.add(new LDHQCinfo(2, "进度款管理", "3.3", new String[]{"业主项目部支付进度款管理 (履行审批手续且手续完备。进度款不得超现场实际工作量支付，不得因进度款支付不足导致工程进度滞后)", " 监理项目部支付进度款管理 (及时审核施工项目部预付款和进度款支付申请,工程量审核准确）",}));
        infolist.add(new LDHQCinfo(2, "设计变更、签证管理", "3.4", new String[]{"不得进行虚假设计变更或拆分工程设计变更、现场签证而规避考核、审批", " 重大设计变更（查设计变更通知单。不得因业主变更设计内容、设计深度不够等项目内部管理因素造成重大设计变更）", " 设计变更管理（查设计变更通知单。不得存在后补设计变更、现场签证现象；变更原因、变更内容，变更图纸等附件完整，签署意见表述清楚，涉及费用变化的设计变更量、价编制规范）"}));
        infolist.add(new LDHQCinfo(1, "4", "技术管理"));
        infolist.add(new LDHQCinfo(2, "技术标准执行", "4.1", new String[]{"技术标准管理\n" +
                "（项目部有标准清单。及时整理和更新基建技术标准，标准齐全有效）\n"}));
        infolist.add(new LDHQCinfo(2, "设计管理", "4.2", new String[]{"设计管理原则（初步设计执行可研批复文件，施工图设计执行初步设计批复文件）", "“三通一标”应用 (全面采用通用设计、通用设备，开展工艺设计）", " 设计联络会（及时组织主变、组合电器、监控系统等主要设备的技术、设计联络会，）", " 施工图会检及设计交底 (按规定开展施工图预检、会检、组织设计交底）"}));
        infolist.add(new LDHQCinfo(2, "项目技术管理", "4.3", new String[]{"技术方案、措施审批管理（按规定流程审核项目管理实施规划中的技术方案、措施，以及专项措施）", " 技术方案、措施交底管理 (按规定在开工前未技术交底、未履行签字手续）", " 技术方案、措施执行管理（严格执行审定的技术方案、措施）"}));
        infolist.add(new LDHQCinfo(1, "5", "基建管理重点工作落实情况"));
        infolist.add(new LDHQCinfo(2, "重点工作落实情况", "5.1", new String[]{"公司重点工作要求落实\n" +
                "   重点工作的要求根据工程建设期间的实际管理要求进行适当调整\n"}));
        infolist.add(new LDHQCinfo(2, "重要文件培训宣贯", "5.2", new String[]{"重要文件培训宣贯\n" +
                "项目部在工程对开工后印发的政府部门、内蒙古电力（集团）有限责任公司相关重要文件进行培训宣贯\n" +
                "（查各项目部学习培训宣贯记录）\n"}));
        infolist.add(new LDHQCinfo(2, "其它问题", "5.3", new String[]{"其它问题\n" +
                "   （检查其它不符合公司规定要求的问题）\n"}));
        return infolist;
    }
}