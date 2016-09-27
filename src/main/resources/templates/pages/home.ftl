<#include "../common/header.ftl">
        <h3>Demonstration Application</h3>
        
        <p class="row">
            
            A demonstration application for Spring Boot. Showing various things.
            the tab set below uses jquery and jquery-ui, which have been loaded
            via <a href="http://webjars.org">webjars</a>.
        </p>
        <br/>
        <div class="tabs">
        <ul>
            <li><a href="#tabs-1">Striped Table</a></li>
            <li><a href="#tabs-2">Plain Table</a></li>

        </ul>
        <div id="tabs-1"> 
            <table class="table table-striped"> 
                <caption>Striped Table</caption> 
                <thead> 
                    <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>Username</th> </tr> </thead>
                <tbody>
                    <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> </tr> 
                    <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> </tr> 
                    <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> </tr> 
                </tbody> 
            </table>
        </div>
        <div id="tabs-2"> 
            <table class="table"> 
                <caption>Basic Table</caption> 
                <thead> 
                    <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>Username</th>  <th>Color Samples</th> </tr> </thead>
                <tbody>
                    <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> <td class="green-color">Green Color</td></tr> 
                    <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> <td class="red-color">Red Color</td> </tr> 
                    <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> <td class="reverse-green-color">Reverse Green Color</td></tr> 
                    <tr> <th scope="row">4</th> <td>Mark</td><td>Mark</td><td>Mark</td>  <td class="reverse-red-color">Reverse Red Color</td></tr>
                </tbody> 
            </table>


        </div>
    </div>

<#include "../common/footer.ftl">