
public class Main2 {
	public static void main(String[] args) {
		// 陳濃斗税 舌帖
		/* CPU / RAM / HDD / GPU
		 * 
		 * CPU : 尻至舌帖(intel : ix - xxxx/ AMD : RyzenX)
		 * HDD / SSD : 督析 莫殿稽 煽舌馬澗 煽舌舌帖
		 * 		=> 督析 慎姥 煽舌
		 * RAM : 痕呪 莫殿稽 煽舌(舌帖)	
		 * 		=> 績獣煽舌
		 * GPU : 益掘波坦軒遂 (CPU + HDD + RAM研 左繕)
		 * 
		 *  汽戚斗 績獣 左糎獣 -> RAM拭 痕呪稽 煽舌
		 *  汽戚斗 慎姥 左糎獣 -> HDD拭 督析稽 煽舌
 		 */
		
		// 痕呪 (variable) : 汽戚斗研 煽舌馬澗 因娃 (益県)
		// 痕呪研 幻球澗 庚狛
		/*		1. 痕呪 識情(幻級奄) - RAM拭 因娃 溌左
		 * 							   巷情亜研 眼聖 呪 赤澗 因娃聖 幻給
		 * 			( 切戟莫 痕呪誤; )税 莫殿研 痕呪研 '識情'梅陥 虞壱 妊薄
		 * 			剛雌生稽 森獣) ( 益県曽嫌 益県戚硯; )
		 * 
		 * 		2. 痕呪 段奄鉢
		 *      ( 痕呪誤 = 葵; )税 莫殿稽 妊薄
		 *      - 切戟莫 : 痕呪亜 葵生稽 煽舌鞠嬢走澗 莫殿
		 *      - 痕呪誤 : 痕呪税 戚硯
		 *      String s; : 庚切伸 (String)聖 眼聖 s(益県)研 幻窮 雌殿
		 *      int i; : 舛呪(int)研 眼聖 i(益県)聖 幻窮 雌殿
		 *      
		 * 痕呪 識情引 段奄鉢研 疑獣拭 叔楳 亜管
		 * ( 切戟莫 痕呪誤 = 葵; )税 莫殿 => '痕呪研 幻窮陥' 虞壱 妊薄
		 *  
		 */
		
		//痕呪誤 憎澗 鋭帳
		//  1. 収切稽 獣拙 獣 拭君 降持
		// int i = 3;
		// int 10 = 3; (error)
		// int 10i = 3; (error)
		
		//  2. 働呪庚切, 句嬢床奄亜 級嬢亜檎 拭君 降持
		// String s = "せせ";
		// String �� = "せせ"; (error)
		// String y y = "せせ"; (error)
		
		//  3. 切郊庚狛 (森鉦嬢) 紫遂 獣 拭君降持
		// int int = 3; (error)
		// int _int = 3; (情希郊研 戚遂背 拭君 号走 亜管)
		
		// Java 庚鉢 )
		//  4. 痕呪誤聖 坐亀 督焦 亜管 馬亀系 幻級奄
	    //   ex ) int dfsdgagqwsdas = 2; (x)
		//        int age = 2;
		
		//  5. 亜偽失聖 是背 句趨床奄亜 琶推 廃 井酔
		// ex) int price of computer = 100000;
		//  => 轟端, 開展端 戚遂
		
		// 轟端 = int price_of_computer = 1000000; (情希郊 戚遂)
		// 開展端 = int priceOfComputer = 1000000; (句嬢床奄亜 琶推廃 採歳拭 企庚切 紫遂)
		
		//  6. 痕呪誤生稽 廃越精 紫遂 X
		
		
		/*
		 * 痕呪拭辞 ' = ' 税 税耕 
		 * ' = ' : 企脊尻至切 
		 * A = B 
		 * 析鋼旋生稽) A澗 B人 旭陥 
		 * 覗稽益掘講) A拭 B虞澗 葵聖 隔嬢虞
		 */
		
		/* 乞窮 汽戚斗澗 0 or 1稽 繕杯戚 鞠壱, 0 or 1戚 馬蟹税 bit亜 喫.
		 * 		Bit : 汽戚斗研 蟹展鎧澗 置社 舘是
		 * 			  Binary Digit (戚遭呪)
		 * 		Byte : 8bits
		 * 		採硲搾闘 : 固 蒋楕拭 切軒馬澗 bit.
		 * 				 : 0 戚檎 丞呪 / 1 戚檎 製呪稽 葵戚 蟹身.
		 * 				 : 採硲搾闘研 薦須廃 蟹袴走 搾闘拭 0 or 1税 葵戚 級嬢亜壱,
		 * 				   蟹展馨 呪 赤澗 骨是澗 (採硲搾闘研 薦須廃) 2税 薦咽(戚遭呪 戚奄 凶庚)
		 * 				   0聖 匂敗馬食 骨是研 走舛馬糠稽 原走厳 骨是澗 -1 聖 背層陥. 
		 * 				   ex) -2^7 ~ (2^7-1)
		 */
		
		// 切戟莫
		/* 		舛呪
		 * 			byte : -128 ~ 127 (-2^7 ~ (2^7-1))
		 * 			short : 鉦 -3幻 ~ 3幻
		 * 			int : 鉦 -21常 ~ 21常 (爽稽 紫遂)
		 * 			long : int研 込嬢蟹澗 骨是
		 * 
		 * 		叔呪
		 * 			float : 陥献 情嬢拭辞 叔呪研 妊薄拝 凶 爽稽 紫遂 
		 * 			double  : Java拭辞 叔呪研 妊薄拝 凶 爽稽 紫遂
		 * 
		 * 		庚切
		 * 			char
		 * 
		 * 		轄軒
		 * 			boolean : True / False 稽 衣引葵戚 蟹展害
		 * 
		 * 		蒸製
		 * 			viod : '蒸製'
		 */
		
		// 凧繕莫
		/*		奄沙莫戚 焼観 依級精 穿採 '凧繕莫'拭 紗敗
		 * 		庚切伸	
		 * 			String : 庚切伸 (食君 越切)研 煽舌. 蒋拭 伽 企庚切 紫遂
		 */
		char c = 'ぞ'; // 廃 越切研 眼澗 char , 拙精 魚身妊 紫遂
		String s = "ぞぞぞぞぞ"; // 食君 越切研 眼澗 String, 笛 魚身妊 紫遂
		
		int floor;
		floor = 7;
		
		int Floor = 7;
		System.out.printf("呪穣馬澗 寵精 %d寵 戚陥\n", floor);
		
		int finger = 10;
		String Finger = "謝亜喰";
		System.out.printf("%s精 %d鯵戚陥\n", Finger, finger);
		
		int subway = 9;
		double subway2 = 9;
		System.out.println(subway2);
		System.out.println(subway);
		// double拭 int 葵聖 隔澗依戚 亜管 / 9.0 精 9稽 妊薄 亜管馬奄 凶庚
		
		// 切戟莫聖 床檎 痕呪研 幻球澗 依 猿走 匂敗敗
		int a = 10; // a虞澗 痕呪 幻級奄 + a拭 葵(10) 隔奄
		
		
		// 切戟莫聖 床走 省生檎 痕呪 呪舛 亜管
		int A;
		A = 10;
		A = 20;
		
		// python : 情嬢亜 切疑生稽 切戟莫聖 限仲捜 (Java 企搾 壱厭 情嬢)
		// 	切戟莫聖 python戚 硝焼辞 識澱
		// a = 10 => 掻差鞠澗 痕呪亜 蒸生檎 a研 幻級嬢 10聖 隔嬢捜
		// a = 10 => 掻差鞠澗 痕呪亜 赤生檎 a税 葵聖 郊荷澗 莫殿
		
		// 痕呪晦軒亀 域至 亜管
		System.out.println(floor + finger);
		
		// 五乞軒(RAM)税 慎蝕
		/*  1. Stack : 叔楳獣 鉢檎拭 蟹展蟹澗 慎蝕
		 * 			   覗稽益轡戚 曽戟鞠檎 切疑生稽 舛軒
		 * 			   購拭辞 採斗 切戟亜 託溢託溢 竣績 (奄沙莫 切戟)
		 * 
		 * 	2. Heap : 痕呪稽 煽舌吉 汽戚斗級税 煽舌社 / Stack生稽 災君鎧嬢 霜 凶 痕呪 切端亜 災君鎧嬢像
		 * 			  覗稽益轡戚 曽戟鞠嬢亀 食穿備 害焼赤製 (呪疑生稽 舛軒(引暗))
		 * 			  陳濃斗亜 旋雁馬陥壱 毒舘廃 是帖拭 煽舌喫
		 *
		 * 		  』 Garbage Collection(Collector) : Heap 慎蝕聖 切疑生稽 舛軒背爽澗 獣什奴
		 *
		 *  3. 耕走税 慎蝕 : 硝 呪 蒸製
		 */
		
		
		
		
		
		
	}
}















































































