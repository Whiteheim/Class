from django.contrib import admin
from .models import Photo    #Photo를 import 하며서, Photo의 models.py를 불러옴
# 모델을 이곳에 등록
# Register your models here.

# 모델 등록하기
# admin.site.register()를 통해 admin페이지에 Phod모델을 등록
admin.site.register(Photo)
