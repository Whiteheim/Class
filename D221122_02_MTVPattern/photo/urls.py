# photo 앱에 대한 url 작성
# => photo 폴더 안에 urls.py 만듦

from django.urls import path
from photo import views

urlpatterns = [
    # views.py에 있는 photo_list 함수 불러오기
    #    photo/photo_list.html과 렌더링
    path('', views.photo_list, name="photo_list"),
        # 여기서 pk라는 이름의 정수형 변수가 들어갈 자리를 의미(유일하게 데이터 구분 가능)
    path('photo/<int:pk>', views.photo_detail, name="photo_detail"),
    
    path('photo/new/', views.photo_post, name="photo_post"),
    
    path('photo/<int:pk>/edit', views.photo_edit, name="photo_edit"),
    
    path('photo/<int:pk>/delete', views.photo_delete, name="photo_delete") 
    ]