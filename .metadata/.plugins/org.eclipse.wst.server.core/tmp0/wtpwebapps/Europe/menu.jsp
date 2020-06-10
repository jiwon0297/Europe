<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>Menu</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="NewsListViewAction.do" style="width : 250px; text-align : center;">News <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ReviewListViewAction.do" style="width : 250px; text-align : center;">Review</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="TipListViewAction.do" style="width : 250px; text-align : center;">Tip</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="MarketListViewAction.do" style="width : 250px; text-align : center;">Market</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="TogetherListViewAction.do" style="width : 250px; text-align : center;">Together</a>
      </li>
    </ul>
  </div>
</nav>

<div class="work_menu text-center">
                                <div id="filters" class="toolbar mb2 mt2">
                                    <button class="btn-md fil-cat filter active" data-filter="all">ALL</button>/
                                    <button class="btn-md fil-cat filter" data-rel="web" data-filter=".web">WEB DESIGN</button>/
                                    <button class="btn-md fil-cat filter" data-rel="design" data-filter=".design">PRINT DESIGN</button>/
                                    <button class="btn-md fil-cat filter" data-rel="flyers" data-filter=".flyers">ANIMATION</button>/
                                    <button class="btn-md fil-cat filter" data-rel="bcards" data-filter=".bcards">ART</button>/
                                    <button class="btn-md fil-cat filter" data-rel="photo" data-filter=".photo">PHOTOGRAPHY</button>/
                                    <button class="btn-md fil-cat filter" data-rel="video" data-filter=".video">VIDEO</button>
                                </div> 

                            </div>

</body>
</html>