from rest_framework import viewsets, permissions, generics, status
from rest_framework.response import Response
from rest_framework.decorators import api_view
from rest_framework.generics import get_object_or_404
from .models import Fruit
from .serializers import FruitSerializer


# Create your views here.

# @ : Decorator (데코레이터)
#    Spring에서 사용하던 Annotation(어노테이션)과 유사한 기능
#    HelloAPI라는 함수가 GET방식의 요청을 받을 수 있는 API라는 것을 표현
@api_view(['GET'])
def HelloAPI(request):
    return Response("Success")
# 결과를 return 할 때, Response라는 클래스를 사용하게 되는데
#    응답에 대한 정보들을 담고있음
#    response.data : 응답에 포함되는 데이터
#    response.status : 응답에 대한 상태를 나타냄

# response.status (응답 상태)코드 : 요청에 대한 응답이 어떤 상태인지 나타내주는 코드값
#    HTTP_200_OK                    : GET방식의 요청이 정상적으로 진행되었을 때
#    HTTP_201_CREATED               : POST 방식의 요청이 정상적으로 진행되었을 때
#    HTTP_400_BAD_REQUEST           : 잘못된 요청을 보냈을 때
#    HTTP_401_UNAUTHORIZED          : 인증이 필요할 때, 인증 관련 내용이 요청에 없을 때
#    HTTP_403_FORBIDDEN             : Client가 접근하지 못하도록 막아놓은 곳에 요청이 왔을 때 (권한 없음)
#    HTTP_404_NOT_FOUND             : 요청을 보낸 곳이 잘못된 URL경로일 때 
#    HTTP_500_INTERNAL_SERVER_ERROR : 서버쪽에서 코드가 잘못 되었을 떄

# GET방식일 때 전체데이터 가져오기
# POST방식일 때 데이터 집어넣기
@api_view(['GET', 'POST'])  # GET / POST 요청을 처리하게 해주는 데코레이터
def fruitsAPI(request):
    if request.method == "GET":
        fruits = Fruit.objects.all()    # Fruit 모델로 부터 전체 데이터 가져오기
        # Serializer에 전체 데이터를 한번에 집어넣기
        # (직렬화, many=True : 다수의 데이터를 처리하기 위해 사용하는 옵션)
        serializer = FruitSerializer(fruits, many=True)
        return Response(serializer.data, status=status.HTTP_200_OK)
    elif request.method == "POST":
        # POST 요청으로 들어온 데이터를 Serializer에 넣기
        serializer = FruitSerializer(data=request.data)
        if serializer.is_valid():   # 유효한 데이터 일 때
            serializer.save()       # 역직렬화를 통해 save()
                                    # ModelSerializer의 create()함수가 자동으로 동작함
            return Response(serializer.data, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

# 특정 데이터 가져오기(과일 번호 이용)
@api_view(['GET'])
def fruitAPI(request, f_no):
    # f_no(파라미터) 가 모델의 f_no(fruit의 데이터)값인 데이터를 Fruit에서 가져오고, 없으면 404에러
    fruit = get_object_or_404(Fruit, f_no=f_no)
    serializer = FruitSerializer(fruit) # Serializer에 데이터 넣기 (직렬화)
    return Response(serializer.data, status=status.HTTP_200_OK)






































