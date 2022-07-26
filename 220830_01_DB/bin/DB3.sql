-- < Oracle 鎧税 幻廃 敗呪 >
-- 1. 収切敗呪
--	- ABS(収切) : 箭企葵 域至									ex) ABS(-4.05)
-- 	- ROUND(収切, m) : 収切研 鋼臣顕, m精 鋼臣顕聖 馬澗 切鹸呪	ex) ROUND(5.36, 1)
--	- POWER(収切, n) : 収切 n薦咽 葵聖 域至 					ex) POWER(2, 3)
--	- TRUNC(収切, m) : 収切税 m腰属 切軒猿走 害奄壱 獄顕		ex) TRUNC(123.456, 2)
--																	TRUNC(123.456, -1)
--																	TRUNC(123.456, 0)
--	- MOD(m, n) 	 : 収切 m聖 n生稽 蟹勧 蟹袴走					ex) MOD(12, 10)
--	- SQRT(収切) 	 : 収切税 薦咽悦 葵聖 域至 (丞呪幻)				ex) SQRT(9.0)

select ABS(-4.05) from dual;
select ROUND(5.36, -1) from dual;
select POWER(2, 3) from dual;
select TRUNC(123.456, 2) from dual;
select TRUNC(123.456, -1)from dual;
select TRUNC(123.456, 0) from dual;
select MOD(12, 10) from dual;
select SQRT(9.0) from dual;
----------------------------------------------------------------------
-- 2. 庚切敗呪
--	- CONCAT(s1, s2) : 砧 庚切伸聖 尻衣							ex) CONCAT('ABCD', 'EFG')
--	- SUBSTR(s1, n, k) : 庚切伸税 n腰属採斗 k幻鏑税 掩戚研 鋼発 ex) SUBSTR('ABCDEFG', 3, 4)
--	- INSTR(s1, s2, n, k) : s1税 n採斗, 
--			達壱切馬澗 s2亜 k腰属 蟹展鎧澗 庚切伸税 是帖研 鋼発 ex) INSTR('Hello', 'l', 1, 2)
--	- LPAD(s, n, c) : 庚切伸 s税 図楕採斗 走舛廃 切軒 呪 n猿走 
--			走舛廃 庚切 c稽 辰趨捜								ex) LPAD('ABC', 5, '*')
--	- RPAD(s, n, c) : 庚切伸 s税 神献楕採斗 走舛廃 切軒 呪 n猿走
--			走舛廃 庚切 c稽 辰趨捜								ex) RPAD('ABC', 5, '*')
--	- LTRIM(s1, s2) : 庚切伸 s1奄層生稽 図楕拭 赤澗 走舛廃 庚切 s2 薦暗
--																ex) LTRIM('*ABC', '*')
-- 	- RTRIM(s1, s2)	: 庚切伸 s1奄層生稽 神献楕拭 赤澗 走舛廃 庚切 s2 薦暗
--																ex) RTRIM('ABC*', '*')
--	- REPLACE(s1, s2, s3) : s1税 走舛廃 庚切 s2研 庚切 s3稽 痕井
--														ex) REPLACE('JACK and JUE', 'J', "BL")
--	- LENGTH(s1) : 越切 呪研 室嬢爽澗 敗呪 						ex) LENGTH('せせせ')
--	- LENGTHB(s1) : 越切税 遂勲(byte)聖 室嬢爽澗 敗呪			ex) LENGTHB('せせせ')

select CONCAT('ABCD', 'EFG') from dual;
select SUBSTR('ABCDEFG', 3, 4) from dual;
select INSTR('Hello', 'l', 1, 2) from dual;
select LPAD('ABC', 5, '*') from dual;
select RPAD('ABC', 5, '*') from dual;
select LTRIM('*ABC', '*') from dual;
select RTRIM('ABC*', '*') from dual;
select REPLACE('JACK and JUE', 'J', 'BL') from dual;
select LENGTH('せせせ') from dual;
select LENGTHB('せせせ') from dual;
----------------------------------------------------------------------
-- 3. 劾促/ 獣娃 敗呪
--	[劾促 莫縦]
--		YYYY 		: 4切軒 尻亀
--		YYY, YY, Y 	: 唖 4切軒 尻亀税 原走厳 3, 2, 1 切軒
--		MM 			: 杉
--		DD 			: 1含 掻 劾促(析切)
--		DAY 		: 推析 (杉推析 ~ 析推析)
--		DY 			: 推析 (杉 ~ 析)
--		AM / PM		: 神穿 / 神板
--		HH, HH12 	: 12獣娃 舘是税 獣娃
--		HH24		: 24獣娃 舘是税 獣娃
-- 		MI			: 歳
--		SS			: 段

--		SYSDAYE 	: 薄仙劾促 / 獣娃


--		TO_DATE(s1, dateime莫縦): 庚切莫 汽戚斗研 劾促莫生稽 鋼発
select to_date ('2022-09-01 神穿 06:00', 'YYYY-MM-DD PM HH:MI') from dual;

-- 		TO_CHAR(date, datetime 莫縦): 劾促莫 汽戚斗研 庚切莫生稽 鋼発
select to_char(sysdate, 'YYYY-MM-DD') from dual;
-- 働舛 劾促葵聖 閤焼神壱 粛陥檎 sysdate 切軒拭 to_date敗呪研 隔嬢辞 幻級檎 亜管
--	=> 鋼発鞠澗 汽戚斗 展脊戚 陥牽陥

-- TO_DATE澗 劾促莫 / TO_CHAR澗 庚切莫 生稽 鋼発

--		ADD_MONTHS(date, 収切) : 劾促拭辞 走舛廃 含 幻鏑 希敗 (1 : 陥製含, -1 : 戚穿含)
select add_months(sysdate, -1) from dual;

--		LAST_DAY(date) : 益 含税 原走厳 劾聖 鋼発
select last_day(sysdate) from dual;
-------------------------------------------------

-- 神潅 劾促 奄層生稽 鰍亀 繕噺 (砺戚鷺 伯希 '尻亀' / 鎮軍 '2022鰍'生稽 窒径)
select to_char(sysdate, 'YYYY')||'鰍' as 尻亀 from dual;

-- 神潅 劾促 奄層 杉 繕噺 (砺戚鷺 伯希 '杉'/ 鎮軍 '08杉')
select to_char(sysdate, 'MM')||'杉' as 杉 from dual;

-- 				  析 繕噺 (砺戚鷺 伯希 '析'/ 鎮軍 '30析')
select to_char(sysdate, 'DD')||'析' as 析 from dual;

--				  獣/歳 繕噺 (砺戚鷺 伯希拭 唖唖 '獣', '歳'/ 鎮軍 '?獣','?歳')
-- select to_char(sysdate, 'HH')||'獣' as 獣 from dual;
-- select to_char(sysdate, 'MI')||'歳' as 歳 from dual;
select to_char(sysdate, 'HH')||'獣' as 獣, to_char(sysdate, 'MI')||'歳' as 歳 from dual;

-- 走榎戚 神穿昔走 神板昔走
select to_char(sysdate, 'PM') "神穿 / 神板" from dual;
-- 紺暢拭 働呪庚切研 隔生形檎 笛 魚身妊 紫遂

-- 庚切伸 2022-09-09 神穿 07:23聖 2022.09.09稽 繕噺
select to_char(to_date('2022-09-09 神穿 07:23', 'YYYY-MM-DD AM HH:MI'), 'YYYY.MM.DD') from dual;

-- 神潅 劾促 奄層 3含穿 原走厳 劾税 杉引 析
-- select to_char(last_day(add_months(sysdate, -3)), 'MM') from dual;
-- select to_char(last_day(add_months(sysdate, -3)), 'DD') from dual;
select to_char(last_day(add_months(sysdate, -3)), 'MM-DD') from dual;

--------------------------------------------------------------------
-- 4. 増域 / 歳汐 敗呪 - 'select 鎮軍誤' or 'having箭'拭辞 紫遂
--		- AVG(鎮軍誤) 	: 汝液
--		- COUNT(鎮軍誤) : 伊事鞠澗 汽戚斗税 呪
-- 		- MAX(鎮軍誤)	: 置企葵
--		- MIN(鎮軍誤)	: 置社葵
--		- SUM(鎮軍誤)	: 恥杯
--		- RANK 			: 掻差 授是幻鏑 陥製 授是葵聖 装亜 獣鉄					授是 1/2/2/2/5
--		- DENSE_RANK	: 掻差 授是亜 糎仙背亀 授託旋生稽 陥製 授是葵聖 妊獣 	授是 1/2/2/2/3
--------------------------------------------------------------------
-- 5. NULL 淫恵 敗呪 
--	薦鉦繕闇拭辞 NOT NULL聖 戚遂背 巷繕闇 汽戚斗研 脊径馬亀系 背客
--	NULL : 耕溌昔/ 耕旋遂 葵 
--			0 戚蟹 因空亀 焼観 葵戚 糎仙馬走 省澗 依
--			null 源壱 陥献 妊奄稽 企帖馬奄 是背 敗呪研 幻給
--		NVL敗呪	: NULL昔 井酔拭幻 走舛吉 葵生稽 企帖馬澗 敗呪
--		NVL(葵, null析凶 企端葵) 
select nvl(null, 'B') from dual;
select nvl('A', 'B') from dual;

--		NVL2敗呪 : NULL税 政巷拭 魚虞 走舛廃 葵生稽 企帖馬澗 敗呪
--			NVL2(葵, 葵戚 赤聖 凶 企端葵, null析凶 企端葵)
select nvl2(null, 'A', 'B') from dual;
select nvl2('C', 'A', 'B') from dual;




















