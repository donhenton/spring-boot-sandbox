 <#include "../../common/header.ftl">

<style>
    .customerList
    {
      height: 350px;
      overflow: auto;
      border: thin solid #667467;
      padding: 10px;
      margin: 10px;
    }
</style>



<h3>List of customers</h3><br/>
<div class="column30Left">
    <div class="customerList">
        <ul>
        <#list customersList as c>
          <li>${c.customerNumber}: ${c.customerName}</li>
        </#list>
        </ul>
    </div>
</div>
<div class="column70Right">
 A list of customers pulled from the postgres customers table.
</div>
 <#include "../../common/footer.ftl">