LOAD DATA TRUNCATE
INTO TABLE SYS_OBJECTS
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
TRAILING NULLCOLS
(
 OPF_ID
,PROGRAM_NAME
,PROGRAM_CD
,PROGRAM_TYP
,IMPORTANCE_SCALE
,ESTIMATED_SCALE
,DIFFICULTY_SCALE
,SCREEN_NAME
,SCREEN_ID
,SCREEN_TYP
,OPF_ID_SUB "NVL(SUBSTRB(:SCREEN_ID,7,3),SUBSTRB(:PROGRAM_CD,7,4))"
)