LOAD DATA TRUNCATE
INTO TABLE SYS_TYPE_VALUE
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
(
 NAME         "RTRIM(LTRIM(:NAME))"
,TYPE_NAME    "RTRIM(LTRIM(:TYPE_NAME))"
,VALUE        "RTRIM(LTRIM(:VALUE))"
,DISPLAY_NAME "DECODE(RTRIM(LTRIM(:NAME)),'LOCALE',DECODE(RTRIM(LTRIM(:DISPLAY_NAME)),NULL,' ',RTRIM(LTRIM(:DISPLAY_NAME))),DECODE(RTRIM(LTRIM(:DISPLAY_NAME)),NULL,'&nbsp;',RTRIM(LTRIM(:DISPLAY_NAME))))"
,INSERTABLE_TYP    "RTRIM(LTRIM(:INSERTABLE_TYP))"
,CHANGEABLE_TYP    "RTRIM(LTRIM(:CHANGEABLE_TYP))"
)
