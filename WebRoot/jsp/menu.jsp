<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<style type="text/css">
a {
	text-decoration: none;
}

body {
	background-image: url("image/left.jpg");
	width: 180px;
	height: 650px;
}

a:link {
	color: #FFFFFF;
}

a:visited {
	color: #FFFFFF;
}

a:hover {
	color: #FF00FF;
}
</style>

<div class="nav" id="nav">
	<s:if test="#session.user.identity!='administrator'">
		<div class="t">
			<dl>
				<dt>ManagePersonalInfo</dt>
				<dd>
					<a href="jsp/personinfo/info.jsp" target="view">PersonalInfo</a>
				</dd>
				<dd>
					<a href="jsp/personinfo/changepwd.jsp" target="view">ChangePassword</a>
				</dd>
			</dl>
			<dl>
				<dt>Vote</dt>
				<dd>&nbsp;</dd>
				<dd>
					<a href="queryItem.action" target="view">ViewVoteItem</a>
				</dd>
				<dd>
					<a href="mergeitem.action" target="view">GoToVote</a>
				</dd>
			</dl>
			<dl>
				<dt>ManageOwnVote</dt>
				<dd>
					<a href="jsp/vote/addvote.jsp" target="view">LaunchVote</a>
				</dd>
				<dd>
					<a href="queryvote.action" target="view">ViewLaunchedVote</a><a
						href="" target="view"></a>
				</dd>
				<dd>
					<a href="" target="view"></a>
				</dd>
			</dl>
		</div>
		
	</s:if>

	<s:if test="#session.user.identity=='administrator'">
		<div class="t">
			<dl>
				<dt>ManageUser</dt>
				<dd>
					<a href="queryuser.action" target="view">ViewUser</a>
				</dd>
				<dd>
					<a href="jsp/user/adduser.jsp" target="view">AddUser</a>
				</dd>
			</dl>
			<dl>
				<dt>ManageVote</dt>
				<dd>
					<a href="updateresult.action" target="view">UpdateVoteResult</a>
				</dd>
			</dl>
		</div>

	</s:if>
	
</div>