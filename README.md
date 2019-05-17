# jk
放的是杰信商贸项目基于SSM框架实现的   
《杰信商贸综合管理平台》分三期完成。一期完成仓储管理（包括：采购单、仓库、货物、条形码、入库、出库、退货、盘点、库存、库存上限报警、
统计查询）和展会管理（包括：展会管理、出单管理），形成货物统一数字化管理。二期完成货运全流程管理，包括购销合同、出货表统计、出口报运单、
HOME装箱单，装箱单，委托书，发票，财务统计等三期完成决策分析（包括：成本分析图，销售情况统计，重点客户，经营情况同期比对统计，工作绩效）。
技术亮点：数据库用到了冗余设计和打断设计，跳跃查询，海量数据用POI来实现，项目中的图表和报表采用amCharts Flash实现，表现酷炫，使用简单

环境和软件：IDEA或ECLIPSE，MySQL5.7，MAVEN3.3.9

运行方式：
1、将项目导进eclipse中
2、右击项目在出现的列表中的Properties,在出现的设置中点击Deployment Assembly进入Web eployment Assembly
3、然后点击Add，进入Select Directive Type，选中Maven Dependencies,点击finish，将其加到Source中
4、右击项目在出现的列表中的Build Path，点击Config Build Path中，移除出错的jre，修改成自己的jre
5.将项目加进tomcat运行即可，访问http://localhost:8080/jk/home.action，进登录界面，无需密码，直接点击登录进去

