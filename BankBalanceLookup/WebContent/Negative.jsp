
<%@ include file="header.jsp" %>


<div class="container">
<h1>Balance</h1>
<table class="table table-hover">
<tr>
<th>id</th>
<th>first name</th>
<th>last name</th>
<th>balance</th>
</tr>
<tr>
<td>${cust.id}</td>
<td>${cust.fName}</td>
<td>${cust.lName}</td>
<td>${cust.balance}</td>
</table>
<br>
<br>
<div class="embed-responsive embed-responsive-4by3">
  <iframe class="embed-responsive-item" src="http://www.moneymanagement.org/landingpages/debt?RCTAG=GPA&gclid=CjwKEAiA64uyBRCVmKyT2vuAjzgSJADfINB6DNEWX2inROHfcjBoGwbwwDKZDZt7Ian_ZvVHBRLmSBoCbgvw_wcB"></iframe>
</div>

</div>

<%@ include file="Footer.jsp" %>

