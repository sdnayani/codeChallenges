'''
Rotate array to right
'''
def rotateArray(L,k):
 print(L)
 tmp=L[len(L)-k:]
 print(tmp)
 
 for i in range((len(L)-k-1),-1,-1):
       L[i+2]=L[i] 
 print(L)

 for i in range(k):
    L[i]=tmp[i]
 print(L)
L=input().split()
rotateArray(L,2)
