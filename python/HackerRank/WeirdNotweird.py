
'''
Task
Given an integer N,, perform the following conditional actions:
If N is odd, print Weird
If Nis even and in the inclusive range of to 2 to 5  print Not Weird
If N is even and in the inclusive range of 6 to 20  print Weird
If N is even and greater than 20,print Not Weird
'''

n=int(input().strip())
check={True:"NotWeird",False:"Weird"}
print(check[n%2==0 and (n in range(6,20) or n > 20)]) 
