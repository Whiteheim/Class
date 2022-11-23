from django.shortcuts import render, get_object_or_404, redirect
from .models import Photo
from photo.forms import PhotoForm
# View
# Template과 Model 사이를 이어주는 다리역할 ( = MVC 패턴의 C)

# View 제작 방법은 다양
#    대표적 - 함수형 View / Class형 View

# 기능 개발 순서
#    Model -> Template -> View -> URL 순으로 작성

# def photo_list(request):
    # return render(request, 'photo/photo_list.html', {})

# 렌더링 : 서버로부터 HTML파일을 받아 브라우저에 제공하는 과정
#        => 웹에 보여질 수 있도록 가공해서 전달

# objects.all()을 통해 Photo 모델의 데이터 전체를 가져옴
# render 마지막 파라미터의 {}를 활용하면 Template(html 파일)으로 데이터를 보낼 수 있음 
# {} 안에 넣고자 하는 데이터를 데이터의 이름과 함께 전달하면 됨
# 이 부분이 Django에서 제공하는 ORM(Object Relational Mapping)
def photo_list(request):
    photos = Photo.objects.all()
    return render(request, 'photo/photo_list.html', {'photos': photos})


# get_object_or_404() : 실행시 Model (Photo)로 부터 데이터를 찾아보고 찾는 데이터가 없다면 404에러를 반환하는 함수
# pk (primary key)
#    : Model에서 찍어낸 수 많은 객체들을 구분할 수 있는 구분자
def photo_detail(request, pk):
    photo = get_object_or_404(Photo, pk=pk)
    return render(request, 'photo/photo_detail.html', {'photo': photo})

def photo_post(request):
    if request.method == "POST":
        form = PhotoForm(request.POST)
        if form.is_valid():
            photo = form.save(commit = False)
            photo.save()
            return redirect('photo_detail', pk=photo.pk)
    else: # GET방식의 경우
        form = PhotoForm()
    return render(request, 'photo/photo_post.html', {'form': form})


# 수정기능을 위해 photo_detail.html은 그대로 사용
# 글 등록 때와 코드는 비슷
#    + PhotoFrom의 instance를 photo로 설정해서 수정 대상이 될 데이터를 설정해줌
#    GET방식 요청이 들어와도 photo데이터를 form에 담아 photo.post.html로 넘겨 기존 데이터를 수정가능하도록 함
def photo_edit(request, pk):
    photo = get_object_or_404(Photo, pk=pk)
    if request.method == "POST":
        form = PhotoForm(request.POST, instance=photo)
        if form.is_valid():
            photo = form.save(commit = False)
            photo.save()
            return redirect('photo_detail', pk=photo.pk)
    else:
        form = PhotoForm(instance=photo)
    return render(request, 'photo/photo_post.html', {'form': form})

# 삭제 기능
def photo_delete(request, pk):
    photo = Photo.objects.get(pk=pk)
    if request.method == "GET":
        photo.delete()
        return redirect("/", pk=photo.pk)






































