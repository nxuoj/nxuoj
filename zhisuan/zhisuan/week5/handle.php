<?php
header("content-type:text/html;charset=utf-8");

$name=$_POST["name"];
$code =$_POST["code"];
$week="5";
$problem=$_POST["problem"];
date_default_timezone_set('PRC');
$time=date("Y-m-d H:i:s");

$mysql=new mysqli("49.232.76.174", "root", "jishuaishuai", "test");

mysqli_set_charset($mysql,'utf8');
if(mysqli_connect_errno()){
    echo "error";
    exit();
}



$query ="insert into test.zhisuan(`name`,`code`,`time`,`week`,`problem`) values('$name','$code','$time','5','1')";
$mysql->query( $query);
if($mysql->affected_rows>0)
    echo "success";
else 
    echo "error";

mysqli_close($mysql);


?>
