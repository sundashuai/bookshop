<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>网上书城信息展示</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">

			<!-- 引入header.jsp -->
			<jsp:include page="/header.jsp"></jsp:include>

			<div class="container-fluid">
				<div class="main_con">
					<h2>公司简介</h2>
					<hr/>
					<div>
						<p>
							<font color="red">“网上书城”</font>是全球知名的综合性网上购物商城，由国内著名出版机构科文公司、美国老虎基金、美国IDG集团、卢森堡剑桥集团、亚洲创业投资基金（原名软银中国创业基金）共同投资成立。
						</p>

						<p>
							于美国时间2010年12月8日在纽约证券交易所正式挂牌上市，成为中国第一家完全基于线上业务、在美国上市的B2C网上商城。自路演阶段，就以广阔的发展前景而受到大批基金和股票投资人的追捧，上市当天股价即上涨86%，并以103倍的高PE和3亿1千3百万美金的IPO融资额，连创中国公司境外上市市盈率和亚太区2010年高科技公司融资额度两项历史新高。
						</p>

						<p>
							全球使用中文上网的人们享受网上购物带来的乐趣——丰富的种类、7×24购物的自由、优惠的价格、架起无界限沟通的桥梁。
						</p>

						<p>
							坚持"诚信为本"的经营理念，率先提出"上门退货、当面退款"以及"正规渠道、正品保证"的诺言，用自己的成功实践经验为国内电子商务企业树立了的"诚信经营，健康发展"的榜样。
						</p>
					</div>
				</div>
			</div>
		</div>
		
		<!-- 引入footer.jsp -->
		<jsp:include page="/footer.jsp"></jsp:include>

	</body>

</html>