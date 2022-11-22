# photo 앱에 대한 url 작성
# => photo 폴더 안에 urls.py 만듦

from django.urls import path
from . import views

urlpatterns = [
    # views.py에 있는 photo_list 함수 불러오기
    #    photo/photo_list.html과 렌더링
    path('', views.photo_list, name="photo_list"),
    ]