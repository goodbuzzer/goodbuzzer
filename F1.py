#TEST CODE FORCES PLUS MINUS

while True:
        try:
            t = int(input())
            if (t>=1 and t<=162):
                break
        except:
            pass
for i in range(t):
        while True:
            try:
                a,b,c = map(int,input().split())
                if a >= 1 : 
                    if b <= 9 :
                        if c >= -8 and c <= 18 :
                            if  a + b != a - b  :
                                if a + b == c :
                                    print('+')
                                elif a - b == c :
                                    print('-')
                                break
            except:
                pass
            

    

