#    -*- coding:utf-8 -*-
from django import forms
from .models import Photo

# Django의 ModelForm을 상속 받아 필드값을 입력으로 받는 PhotoForm 클래스 생성 
class PhotoForm(forms.ModelForm):
    class Meta:
        model = Photo
        fields = (
            'title',
            'author',
            'image',
            'description',
            'price',
            )
































































