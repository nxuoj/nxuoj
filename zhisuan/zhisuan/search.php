<html>
<head>
<meta charset="utf-8">
<style type="text/css">
#div1 {width: 800px; background: lightblue; margin: 0 auto;line-height: 26px;}
a {text-decoration: none;color: red;}
</style>
</head>
<body onload="init()">


<?php

$week= $_POST["week"];
$mysql=new mysqli("49.232.76.174", "root", "jishuaishuai", "test");
mysqli_set_charset($mysql,'utf8');
if ($mysql->connect_errno) {
    printf("Connect failed: %s\n", $mysql->connect_error);
    exit();
}

$query="select * from zhisuan where week= $week";

if($result=$mysql->query($query))
{
while($row=$result->fetch_row())
{
   echo $row[0]." ".$row[2]." week".$row[3]." problem:".$row[4]."<hr/>";
   echo "<pre>".$row[1]."</pre>"."<hr/>"; 
  
}
}

?>

</body>

</html>