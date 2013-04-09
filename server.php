<?php

  $host = 'db_server';
  $kadi   = 'db_username';
  $sifre  = 'db_password';
  $vt     = 'db_table';

  $baglan = mysql_connect($host,$kadi,$sifre) or die (mysql_error());
  $db = mysql_select_db($vt, $baglan) or die (mysql_error());


  // create connection
  if (!$db) {
    die('Could not connect: ' . mysql_error());
  }else{
    /* echo 'Connected successfully'; */
  }


  if(isset($_POST["latitude"]) && isset($_POST["longitude"]) && isset($_POST["dateTime"])){
    $lat = $_POST["latitude"];
    $long = $_POST["longitude"];
    $date = $_POST["dateTime"];
    error_log($lat);
    error_log($long);
    error_log($date);
    mysql_query("INSERT INTO ring_data(latitude, longitude, date) VALUES ('$lat', '$long', '$date')");
    //$ekle = mysql_query("insert into etiketler (konu_id,etiket,etiket_sef) values ('$konu_id','$etiket','$etiket_sef')");
  }

  $last = mysql_fetch_array(mysql_query("select * from ring_data  order by ID desc limit 1"));
  echo $last["latitude"];
  echo "#";
  echo $last["longitude"];

?>
