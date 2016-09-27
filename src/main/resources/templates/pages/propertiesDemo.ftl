<#include "../common/header.ftl">  

<div class="column50Left">
    <h3>Properties</h3><br/>
    
    <ul>
        <li><em><b>Message from application-dev.properties</b></em> ${envMessage}</li>
        <li><em><b>Current active profiles</b></em> ${activeProfiles}</li>
        <li><em><b>Secret from application.properties</b></em> ${mySecret}</li>
         
    </ul>
</div>
<div class="column50Right">
    <h3>Javascript Sample</h3><br/>
    
     <div id="textInfo"></div>
</div>
 <script src="/js/code/demo.js " type="text/javascript"></script>  
<#include "../common/footer.ftl">