N=int(input())
lis=list(map(int,input().strip().split()))[:N]
z=max(lis)

while(max(lis)==z):
  lis.remove(z)

print(max(lis))
