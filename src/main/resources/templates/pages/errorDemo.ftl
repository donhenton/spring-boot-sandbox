<#include "../common/header.ftl">
        <h3>Error Demonstration</h3>
        
        <p class="row">
          Press the button below to see the error page
        </p>
       <p class="row">
          <form method="POST" action="/errorPost">
              <input type="submit" value="Show Error Page" class="btn btn-primary" />
          </form>
        </p>

<#include "../common/footer.ftl">