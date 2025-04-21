def solution(participant, completion):
    answer = ''
    dict_p = {}
    dict_c = {}
    
    for p in participant:
        if p not in dict_p.keys():
            dict_p[p] = 1
        else : 
            dict_p[p] += 1
            
    for c in completion:
        if c not in dict_c.keys():
            dict_c[c] = 1
        else : 
            dict_c[c] += 1

    for c in dict_c:
        while dict_c[c] > 0:
            dict_p[c] -= 1
            dict_c[c] -= 1

    for p in dict_p:
        if dict_p[p] > 0 :
            answer = p
            break
            
    return answer