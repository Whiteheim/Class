from django.urls import path, include
from .views import HelloAPI
from example.views import fruitsAPI, fruitAPI

urlpatterns = [
        path('hello/', HelloAPI),
        path('fruits/', fruitsAPI),
        path('fruits/<int:f_no>/', fruitAPI),
    ]