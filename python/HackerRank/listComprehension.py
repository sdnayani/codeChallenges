x,y,z,N=map(int,input().split())
print(x)
print(y)
print(z)
print(N)
print([[i, j, k] for i in range (x+1) for j in range (y+1) for k in range (z+1) if (i+j+k)!=N])