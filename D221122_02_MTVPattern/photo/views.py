from django.shortcuts import render

# View
# Template과 Model 사이를 이어주는 다리역할 ( = MVC 패턴의 C)

# View 제작 방법은 다양
#    대표적 - 함수형 View / Class형 View

# 기능 개발 순서
#    Model -> Template -> View -> URL 순으로 작성

def photo_list(request):
    return render(request, 'photo/photo_list.html', {})

# 렌더링 : 서버로부터 HTML파일을 받아 브라우저에 제공하는 과정
#        => 웹에 보여질 수 있도록 가공해서 전달




