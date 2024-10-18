import copy
s=str(input("String:"))
l=list(s)
ll=copy.deepcopy(l)
for i in range(len(l)):
    print(l[i],end=' ')
print('')
ss=""
while(len(ss)<len(s)):
    LL=[]
    for i in range(len(l)):
        L=[(l[i]+x) for x in ll if x.find(l[i])==(-1)]
        LL=LL+L
    ll=copy.deepcopy(LL)
    for i in range(len(ll)):
        print(ll[i],end=' ')
    print('')
    ss=ll[0]

   
