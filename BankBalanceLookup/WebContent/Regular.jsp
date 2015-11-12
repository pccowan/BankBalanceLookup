

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
<div class="container">
<h1>Get Your Tickets Today</h1>
</div>
<div class="embed-responsive embed-responsive-4by3">

  <iframe class="embed-responsive-item" src="http://www.vividseats.com/nhl-hockey/chicago-blackhawks-tickets.html?utm_source=google&utm_medium=cpc&utm_campaign=NHL+Hockey&utm_term=chicago+black+hawks+games&vkid=2637825&gclid=CjwKEAiA64uyBRCVmKyT2vuAjzgSJADfINB69Mm6jwjjszPHLUcbdklEN19oFyuMmaNRiQ8Ti7zttRoCT8Tw_wcB"></iframe>
</div>

</div>

<%@ include file="Footer.jsp" %>

