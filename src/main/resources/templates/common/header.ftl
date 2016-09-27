<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<#assign appTitle="Spring Boot Application">
    <head>
        <title>Spring Boot Application</title>

        <link href="/css/foundation-icons.css"   type="text/css" rel="stylesheet"  />  
        <link href="/css/jquery-ui-theme.css" rel="stylesheet" type="text/css"/>  
        <link href="/css/style.css" rel="stylesheet" type="text/css"/>  
        <script src="/js/libs/jquery/dist/jquery.js " type="text/javascript"></script>  
        <script src="/js/ui-init.js" type="text/javascript"></script>    
    </head>
    <body>

        <section id="pageContainer">
            <header>
                <figure th:text="${appTitle}" class="logo">Spring Boot Application</figure>
                <nav class="topMenu grouping">


                <ul>


                    <li><aside>Demos</aside>
                        <ul>
                            <li><a href="/propertiesDemo">Properties</a></li>
                           
                        </ul>
                    </li>
                     <li><a href="/">Home</a></li>
                </ul>    
                   

            </nav>
            </header>
            <section id="main" class="grouping">
                <div class="mainPageContainer">
                    <!--begin content-->
                    
                    