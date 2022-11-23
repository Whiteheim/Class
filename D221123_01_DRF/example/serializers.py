from rest_framework import serializers
from .models import Fruit

class FruitSerializer(serializers.ModelSerializer):
    class Meta:
        model = Fruit
        fields = ['f_no', 'f_name', 'f_price', 'f_explanation']

# Serializer
#    사전적 의미 : 직렬화
#            Django 프로젝트에서 내가 만든 모델(Fruit)로 부터 뽑아낸 데이터들을 JSON타입으로 바꾸는 작업
#    Django에서 데이터들은 JSON형태의 포맷이 아닌 Python객체의 형태로 저장이 됨

#    API(Application Programming Interface): 
#            응용 프로그램에 사용가능 하도록 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
#            데이터들을 Client에게 보내주는 역할 
#            아무 작업 없이 데이터를 그대로 보내게 되면 Client는 읽을 수 없음 (Python 객체이기 때문)
#                => Python 데이터를 읽을 수 있는 문자열(ex:JSON)로 변환하여 Client에게 보내줘야함
#                    Python 데이터를 문자열로 변환하는 작업을 직렬화(Serialize) 라고 함

#    Client가 데이터를 서버에 보내주는 경우
#        Client는 API요청에 의해 데이터를 JSON문자열 형태로 입력해서 보내게 됨
#        서버 입장에서는 모델을 통해 저장하려면 데이터가 Python 객체의 형태여야 하기 때문에
#        받아낸 데이터를 저장 할 수 없음 => JSON형태의 문자열을 Python데이터 객체로 변환하는 작업이 필요
#                => 이를 역직렬화(Deserialize) 라고 함

#    Serializer 는 직렬화, 역직렬화의 기능을 동시에 가짐
#        => Client와 서버 API간의 데이터 양식을 맞춰주는 변환기 라고 할 수 있음

#    ModelSerializer
#        모델의 내용을 기반으로 동작하는 Serializer
#        장점
#            - 코드 중복 축소, 필드 선언 리스트화 (모델에서 이미 필드선언을 했으므로 리스트의 형태로 간단하게 작업)




























































