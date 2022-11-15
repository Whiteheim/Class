# -*- coding:utf-8 -*-
from cx_Oracle import connect
from datetime import datetime

# 메뉴 만들기 (함수 사용)
# 1. 학생 등록 / 2. 강의장 조회 / 3. 학생조회 / 4. 학생정보 파일로 내보내기
# 0. 종료

# 학생 등록
def regStudent():
    print("학생 등록 메뉴 입니다.")
    name = input("이름 : ")
    birth = input("생일(yyyyMMdd) : ")
    classRoomNo = int(input("강의장 번호 : "))
    mtExam = int(input("중간고사 점수 : "))
    fnExam = int(input("기말고사 점수 : "))
    
    con = connect("heim/1234@203.252.32.73:1521/xe")
    cur = con.cursor()
    sql = ("insert into nov15_student values(nov15_student_seq.nextval, "
            + f"'{name}' ,to_date('{birth}', 'yyyyMMdd'), " 
            + f"{classRoomNo}, {mtExam}, {fnExam})")
    cur.execute(sql)
    if cur.rowcount == 1:
        con.commit()
        print("등록이 완료 되었습니다.")
    con.close()

# 강의장 조회 : 강의장 번호 - 강의장 위치
def getClassRoomInfo():
    print("강의장 조회 메뉴입니다.")
    print("++++++++++++++++++++++++++++++++++++")
    con = connect("heim/1234@203.252.32.73:1521/xe")
    cur = con.cursor()
    sql = "select * from nov15_classRoom order by cNo"
    cur.execute(sql)
    
    for i, l in cur:
        print(f"{i}강의장 - {l}")
        print("++++++++++++++++++++++++++++++++++++")
    con.close()
    print("조회가 완료되었습니다.")   
    
    
# 학생 조회 : 이름, 생년월일 (연-월-일)(요일), 나이, 강의장 번호
#            중간고사 점수ㅡ 기말고사 점수, 평균점수
def getStudentInfo():
    print("학생 조회 메뉴입니다.")
    print("++++++++++++++++++++++++++++++++++++")
    con = connect("heim/1234@203.252.32.73:1521/xe")
    cur = con.cursor()
#    sql = ("select sName, to_char(sBirth, 'yyyy-mm-dd (dy)'), "
    sql = ("select sName, sBirth, "
        + "sClassroom, sMidtermExam, sFinalExam,"
        + "((sMidtermExam + sFinalExam) / 2) " 
        + "from nov15_student order by sName")
    cur.execute(sql)
    now = datetime.today()
    for n, b, c, me, fe, avg in cur:
        bd = datetime.strftime(b, "%Y-%m-%d")        # 연-월-일 포맷
        print(f"이름 : {n}")
        print(f"생일 : {bd} ({b.strftime('%a')})" )        # 요일 포맷
        print(f"나이 : {now.year - b.year + 1}")
        print(f"강의장 : {c}")
        print(f"중간고사 점수 : {me}")
        print(f"기말고사 점수 : {fe}")
        print(f"평균 : {avg}")
        # print(f"평균 : {(me + fe)/2}")
        print("++++++++++++++++++++++++++++++++++++")
    con.close() 
    print("조회가 완료되었습니다.")   

# 파일로 내보내기 (학생의 전체 정보 .csv파일)
def makeFile():
    print("전체 학생의 정보를 파일로 내보냅니다.")
    con = connect("heim/1234@203.252.32.73:1521/xe")
    cur = con.cursor()
    sql = "select sName, to_char(sbirth, 'yyyymmdd'), sclassroom, sMidtermExam, sFinalExam from nov15_student order by sBirth"
    cur.execute(sql)
    file = open("C:/Users/user/Desktop/KDT/Python/Test/studentInfo.csv", "w", encoding="UTF-8")
                
    for nm, b, c, me, fe in cur:
        file.write(f"{nm},{b},{c},{me},{fe}\n")
    
    file.close()
    con.close()
    print("파일 내보내기 완료")

# 프로그램 실행
def studentProgram():
    
    while True:
        print("------------------------------------")
        print("학생 정보 조회 프로그램입니다.")
        print("원하시는 메뉴의 번호를 입력해주세요.")
        print("------------------------------------")
        print("1. 학생 등록 \ 2. 강의장 조회")
        print("3. 학생 조회 \ 4. 학생 정보를 파일로 내보내기")
        print(">> 0번을 누르면 종료됩니다.")
        print("------------------------------------")
        number = int(input("번호 입력 : "))
        print("------------------------------------")
        if number == 1:
            regStudent()
        
        elif number == 2:
            getClassRoomInfo()
        
        elif number == 3:
            getStudentInfo()
            
        elif number == 4:
            makeFile()
        
        elif number == 0:
            print("프로그램을 종료합니다.")
            break
        
        else :
            studentProgram()
#################################################################

studentProgram()



































