from django.db import models

# Create your models here.
class Fruit(models.Model):
    f_no = models.IntegerField(primary_key=True)
    f_name = models.CharField(max_length=10)
    f_price = models.IntegerField()
    f_explanation = models.TextField()
    
# models 설정 후 프로젝트 우클릭 -> make migrate -> migrate로 반영































