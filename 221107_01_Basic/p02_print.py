# -*- coding:utf-8 -*-

# Java vs Python
# Java : 컴퓨터 활용에 효율적 -> 규칙의 언어 -> (상대적으로) 완벽한 객체지향 언어
#        명확하고, 혼란스럽지 않은 코드 (구체적이고 자세한 코드)
#        너무 구체적이다 보니 코드 작성이 어려움

# Python : 사람이 사용하기에 편함 -> 자유의 언어 -> hybrid한 객체지향 언어
#            상대적으로 짧은 코드
#            코드가 길어지면 헷갈릴 여지가 있음

#####################################################################

# 기본 출력
print('hello world')
print('bye world') # enter의 기능을 포함 (줄바꿈)
print()

# seperator
# sep = 기본값은 ''(띄어쓰기)
print('H', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd', sep='       ')

# 메일주소
# 전화번호 출력
print('gns240','gmail.com', sep='@')
print('010','5477','6046', sep='-')
print()

# end
print ('잠옴', end=' ') # 줄바꿈(기본값)을 띄어쓰기로 변경
print('피곤', end='')
print()

# 출력 형식 (format)
print('{} and {}'.format('1번', '2번'))
print('{1} and {0} and {0}'.format('1번', '2번'))
print('{p1} is {p2}'.format(p1='life', p2='eggs'))

# %d %s %f
print('%d' % 123)
print('%.2f' % 123.789)

# 10 = 0 번째, 11.11111이라는 값을 1번째에 소수점 둘째자리까지 출력
print('{}, {}'.format(10, '%.2f'%11.11111))
print('{0:d}, {1:.2f}'.format(10, 11.11111))




















































