from django.db import models

# 장고의 model field
#    1. CharField : 제한 문자열 삽입 가능
#                    최대 길이 지정은 반드시 max_length 옵션에 지정
#    2. EmailField : 이메일 주소 형태를 넣을 때 사용
#    3. URLField : URL 주소형태를 넣을 때 사용
#    4. TextField : 대용량의 문자열을 처리하는 필드, 크기 제한을 하지 않아도 됨
#    5. IntegerField : 정수형 필드
#    6. BooleanField : True or False만 저장하는 필드
#                    Null갑을 허용하기 위해서는 NullBooleanFeild를 사용
#    7. DatetimeField : 시간과 관련된 값을 저장하는 필드
#                    만약 자동으로 현재시간을 넣기위해서는 auto_now = True 옵션 사용
#                    auto_now : save될 때마다 현재 시간을 갱신
#                    auto_now_add : 제일 처음 생성한 현재 날짜만 갱신
#    8. DecimalFeild : 소수점 관련 필드
#                    표현 가능한 숫자의 자릿수 (max_digits)와 소수점 위치 (decimal_places) 를 지정
#    9. FileField : 파일을 업로드 하는 필드
#                upload_to 옵션에 반드시 해당 결로를 지정해야함
#                경로 탐색은 전에 settings.py에 설정해놓았던 MEDIA_ROOT 경로에서부터 시작
############################################################################
# Create your models here.
class Photo(models.Model):
    title = models.CharField(max_length=50)
    author = models.CharField(max_length=50)
    image = models.CharField(max_length=1000)
    description = models.TextField()
    price = models.IntegerField()
    
    # __str__() 함수로 사진 제목과 번호 보여주기
    def __str__(self):
        return f"[{self.pk}] {self.title}"
    
    
# Django에서 Model 클래스를 생성하고 난 후, DB와 연동시킬 수 있도록
#    해당 모델에 해당하는 테이블을 똑같이 생성을 해줘여함
# Python의 모델 클래스의 수정 (및 생성)을 DB에 적용하는 과정을 Migration이라고 함

# 1. make migration
# 특정 앱의 모델을 파악하여 테이블 스키마를 생성하거나 수정을 위한 파일을 생성함
# 필요한 필드가 생겼거나, 삭제해야 할 필드가 생기면 반드시 새로운 파일을 만들어줘야 함
#    *** 이 명령어를 수행하기 위해 settings.py파일의 
#        INSTALLED_APPS에 해당 앱의 이름이 추가되어 있어야함

# 2. migrate
# 모델 클래스를 보고, 실제로 DB테이블을 생성하거나 수정하는 명령어 



































