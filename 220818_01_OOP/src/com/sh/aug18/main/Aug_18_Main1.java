package com.sh.aug18.main;

import com.sh.aug18.character.Character;
import com.sh.aug18.game.Planet;
import com.sh.aug18.hero.Ironman;

public class Aug_18_Main1 {
	public static void main(String[] args) {
		// 게임 개발 : 스토리
		// 캐릭터 생성 시 행성에 입장
		// 몬스터 조우 -> 도움요청 -> 영웅등장
		// 행성객체 (이름, 크기, 보이는지 유무)
		// 캐릭터 (이름)
	Planet p = new Planet("지구");
	Character c = new Character("김초보");
	//행성에 캐릭터 입주시킴
	p.add(c);
	System.out.println("--------------------");
	Ironman i = new Ironman();
	// 캐릭터가 아이언맨을 자신의 전담영웅으로 지정
	c.pick(i);
	
	// 캐릭터가 도움요청
	c.helpAaaaa();
	
	// 행성의 사이즈를 3000으로 수정
	p.setSize(3000);
	
	// 행성이 보이게 수정
	p.setVisable(true);
	
	// 사수 : interface를 만들어 제공해준 상태
	// 프로젝트 이름에 우클릭 -> Build Path -> Configure Build Path 
	// 		-> Libraries -> Add External Jars -> Jar 파일 추가
	// interface는 부사수 제어용
	// attack();을 반드시 구현하게 시킴
	// 아이언맨의 attack()을 넣어 완성시켜라
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
